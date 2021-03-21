package com.example.wordofmouthapp.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.wordofmouthapp.databinding.CompanyListFragmentBinding
import com.example.wordofmouthapp.utils.AutoClearOnDestroyProperty
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable

class CompanyListFragment : Fragment() {

    private val compositeDisposable = CompositeDisposable()

    private lateinit var viewModel: CompanyListViewModel

    private val controller = CompanyListController()

    private var binding: CompanyListFragmentBinding by AutoClearOnDestroyProperty()

    companion object {
        fun newInstance() = CompanyListFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CompanyListViewModel::class.java)

        viewModel.loadData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CompanyListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        compositeDisposable.add(
            viewModel
                .screenState
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        render(it)
                    },
                    {
                        println(it)
                    }
                )
        )

        binding.list.adapter = controller.adapter
    }

    private fun render(state: CompanyListScreenState) {
        when (state) {
            is CompanyListScreenState.DataLoaded -> {
                controller.setData(state.data, ::handleAction)
            }
            else -> {}
        }
    }

    private fun handleAction(action: CompanyListAction) {
        when (action) {
            is CompanyListAction.ItemClicked -> {} //todo
        }
    }
}