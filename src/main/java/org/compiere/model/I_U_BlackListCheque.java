package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_BlackListCheque
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_BlackListCheque {

    /**
     * TableName=U_BlackListCheque
     */
    String Table_Name = "U_BlackListCheque";

    /**
     * AD_Table_ID=52000
     */
    int Table_ID = 52000;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BankName
     */
    String COLUMNNAME_BankName = "BankName";
    /**
     * Column name ChequeNo
     */
    String COLUMNNAME_ChequeNo = "ChequeNo";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name U_BlackListCheque_ID
     */
    String COLUMNNAME_U_BlackListCheque_ID = "U_BlackListCheque_ID";
    /**
     * Column name U_BlackListCheque_UU
     */
    String COLUMNNAME_U_BlackListCheque_UU = "U_BlackListCheque_UU";
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
     * Get Bank Name
     */
    String getBankName();

    /**
     * Set Bank Name
     */
    void setBankName(String BankName);

    /**
     * Get Cheque No
     */
    String getChequeNo();

    /**
     * Set Cheque No
     */
    void setChequeNo(String ChequeNo);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Black List Cheque
     */
    int getU_BlackListCheque_ID();

    /**
     * Set Black List Cheque
     */
    void setU_BlackListCheque_ID(int U_BlackListCheque_ID);

    /**
     * Get U_BlackListCheque_UU
     */
    String getU_BlackListCheque_UU();

    /**
     * Set U_BlackListCheque_UU
     */
    void setU_BlackListCheque_UU(String U_BlackListCheque_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
