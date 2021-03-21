package com.example.wordofmouthapp.ui.list

typealias CompanyListActionHandler = (CompanyListAction) -> Unit


sealed class CompanyListAction {
    data class ItemClicked(val id: String) : CompanyListAction()
}
