package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for I_ElementValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_ElementValue {

    /**
     * AD_Table_ID=534
     */
    int Table_ID = 534;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AccountSign
     */
    String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AccountType
     */
    String COLUMNNAME_AccountType = "AccountType";
    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name C_Element_ID
     */
    String COLUMNNAME_C_Element_ID = "C_Element_ID";
    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name I_ElementValue_ID
     */
    String COLUMNNAME_I_ElementValue_ID = "I_ElementValue_ID";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsDocControlled
     */
    String COLUMNNAME_IsDocControlled = "IsDocControlled";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name ParentElementValue_ID
     */
    String COLUMNNAME_ParentElementValue_ID = "ParentElementValue_ID";
    /**
     * Column name PostActual
     */
    String COLUMNNAME_PostActual = "PostActual";
    /**
     * Column name PostBudget
     */
    String COLUMNNAME_PostBudget = "PostBudget";
    /**
     * Column name PostEncumbrance
     */
    String COLUMNNAME_PostEncumbrance = "PostEncumbrance";
    /**
     * Column name PostStatistical
     */
    String COLUMNNAME_PostStatistical = "PostStatistical";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    String getAccountSign();

    /**
     * Get Account Type. Indicates the type of account
     */
    String getAccountType();

    /**
     * Get Element. Accounting Element
     */
    int getC_Element_ID();

    /**
     * Get Account Element. Account Element
     */
    int getC_ElementValue_ID();

    /**
     * Set Account Element. Account Element
     */
    void setC_ElementValue_ID(int C_ElementValue_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Import Account. Import Account Value
     */
    int getI_ElementValue_ID();

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Document Controlled. Control account - If an account is controlled by a document, you
     * cannot post manually to it
     */
    boolean isDocControlled();

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Post Actual. Actual Values can be posted
     */
    boolean isPostActual();

    /**
     * Get Post Budget. Budget values can be posted
     */
    boolean isPostBudget();

    /**
     * Get Post Encumbrance. Post commitments to this account
     */
    boolean isPostEncumbrance();

    /**
     * Get Post Statistical. Post statistical quantities to this account?
     */
    boolean isPostStatistical();

}
