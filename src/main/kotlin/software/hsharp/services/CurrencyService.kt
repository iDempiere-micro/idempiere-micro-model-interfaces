package software.hsharp.services

import org.compiere.model.I_C_Currency
import software.hsharp.core.services.BaseDataService

/**
 * Currency service
 */
interface CurrencyService : BaseDataService<I_C_Currency> {
    /**
     * EUR currency
     */
    val EUR: I_C_Currency
}