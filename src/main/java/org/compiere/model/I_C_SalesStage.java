package org.compiere.model;

import org.idempiere.icommon.model.NamedPersistentObject;
import software.hsharp.core.models.SearchableByKey;

import java.math.BigDecimal;

/**
 * Generated Interface for C_SalesStage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SalesStage extends NamedPersistentObject, SearchableByKey {

    String Table_Name = "C_SalesStage";

    /**
     * AD_Table_ID=53338
     */
    int Table_ID = 53338;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    String COLUMNNAME_Probability = "Probability";

    /**
     * Get Probability
     */
    BigDecimal getProbability();

    /**
     * Set Probability
     */
    void setProbability(BigDecimal Probability);
}
