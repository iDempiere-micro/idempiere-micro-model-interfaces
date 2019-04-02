package software.hsharp.modules

import software.hsharp.core.modules.BaseModule
import software.hsharp.services.BusinessOpportunityService
import software.hsharp.services.BusinessPartnerService
import software.hsharp.services.CategoryService
import software.hsharp.services.ContactActivityService
import software.hsharp.services.CountryService
import software.hsharp.services.CurrencyService
import software.hsharp.services.ProductService
import software.hsharp.services.SalesOrderService
import software.hsharp.services.SalesStageService
import software.hsharp.services.UsersService

interface Module :
    BaseModule {
    val businessPartnerService: BusinessPartnerService
    val currencyService: CurrencyService
    val countryService: CountryService
    val categoryService: CategoryService
    val businessOpportunityService: BusinessOpportunityService
    val salesStageService: SalesStageService
    val contactActivityService: ContactActivityService
    val salesOrderService: SalesOrderService
    val productService: ProductService
    val usersService: UsersService
}