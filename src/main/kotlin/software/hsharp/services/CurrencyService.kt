package software.hsharp.services

import org.compiere.model.I_C_Currency
import software.hsharp.core.models.BaseDataService

interface CurrencyService : BaseDataService<I_C_Currency> {
    val EUR: I_C_Currency
}