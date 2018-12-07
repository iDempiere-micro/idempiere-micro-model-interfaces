package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxPostal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxPostal {

    /**
     * TableName=C_TaxPostal
     */
    String Table_Name = "C_TaxPostal";

    /**
     * AD_Table_ID=701
     */
    int Table_ID = 701;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_TaxPostal_ID
     */
    String COLUMNNAME_C_TaxPostal_ID = "C_TaxPostal_ID";
    /**
     * Column name C_TaxPostal_UU
     */
    String COLUMNNAME_C_TaxPostal_UU = "C_TaxPostal_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Postal_To
     */
    String COLUMNNAME_Postal_To = "Postal_To";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    I_C_Tax getC_Tax() throws RuntimeException;

    /**
     * Get Tax ZIP. Tax Postal/ZIP
     */
    int getC_TaxPostal_ID();

    /**
     * Set Tax ZIP. Tax Postal/ZIP
     */
    void setC_TaxPostal_ID(int C_TaxPostal_ID);

    /**
     * Get C_TaxPostal_UU
     */
    String getC_TaxPostal_UU();

    /**
     * Set C_TaxPostal_UU
     */
    void setC_TaxPostal_UU(String C_TaxPostal_UU);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get ZIP. Postal code
     */
    String getPostal();

    /**
     * Set ZIP. Postal code
     */
    void setPostal(String Postal);

    /**
     * Get ZIP To. Postal code to
     */
    String getPostal_To();

    /**
     * Set ZIP To. Postal code to
     */
    void setPostal_To(String Postal_To);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
