package com.example.wordofmouthapp.ui.list

import androidx.lifecycle.ViewModel
import com.example.wordofmouthapp.models.Company
import io.reactivex.subjects.BehaviorSubject

class CompanyListViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var companies: List<Company> = emptyList()

    val screenState: BehaviorSubject<CompanyListScreenState> = BehaviorSubject.create()

    fun loadData() {
        val list = listOf(
            Company(
                id = "1",
                name = "The Emma Essentials",
                category = "Home",
                imageUrl = "https://images.squarespace-cdn.com/content/5f3021342c03b15314ad38d6/1596991112827-MKWNG07GW4CCE1PBZ777/Brown+and+Cream+Motivational+Blog+Banner+%281%29.png?format=1500w&content-type=image%2Fpng"
            ),
            Company(
                id = "2",
                name = "Ethique",
                category = "Personal Care",
                imageUrl = "https://cdn.shopify.com/s/files/1/0025/1717/2339/files/ethique--logo-x2_73c3c7de-e7a7-4a53-848f-c6eef988ca4f.png?height=628&pad_color=fff&v=1528339326&width=1200"
            ),
        )

        screenState.onNext(
            CompanyListScreenState.DataLoaded(list)
        )
    }
}