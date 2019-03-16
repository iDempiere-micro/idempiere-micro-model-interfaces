package software.hsharp.services

import org.compiere.model.I_C_SalesStage
import java.math.BigDecimal

/**
 * Service for sales stage
 */
interface SalesStageService {
    /**
     * Ensure that the sales stage exists. If not, a new is created.
     */
    fun ensureSalesStage(name: String, probability: BigDecimal, searchKey: String): I_C_SalesStage
}