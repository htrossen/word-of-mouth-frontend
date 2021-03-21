package com.example.wordofmouthapp.ui.list

import com.example.wordofmouthapp.models.Company

sealed class CompanyListScreenState {
    data class DataLoaded(val data: List<Company>) : CompanyListScreenState()
    object Empty : CompanyListScreenState()
    object Error : CompanyListScreenState()
    object Loading : CompanyListScreenState()
}
