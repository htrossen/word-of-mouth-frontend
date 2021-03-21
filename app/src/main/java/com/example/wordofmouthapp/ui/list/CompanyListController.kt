package com.example.wordofmouthapp.ui.list

import com.airbnb.epoxy.Typed2EpoxyController
import com.example.wordofmouthapp.models.Company

class CompanyListController : Typed2EpoxyController<List<Company>, CompanyListActionHandler>() {
    override fun buildModels(
        companies: List<Company>,
        actionHandler: CompanyListActionHandler
    ) {
        companies.forEach { company ->
            companyItem {
                id(company.id)
                company(company)
                actionHandler(actionHandler)
            }
            divider {
                id("divider${company.id}")
            }
        }
    }
}