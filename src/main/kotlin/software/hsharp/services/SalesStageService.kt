package software.hsharp.services

import org.compiere.model.I_C_SalesStage
import java.math.BigDecimal

interface SalesStageService {
    fun ensureSalesStage(name: String, probability: BigDecimal, searchKey: String): I_C_SalesStage
}