package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_ReportLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ReportLine {

    /**
     * TableName=PA_ReportLine
     */
    String Table_Name = "PA_ReportLine";

    /**
     * AD_Table_ID=448
     */
    int Table_ID = 448;

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
     * Column name CalculationType
     */
    String COLUMNNAME_CalculationType = "CalculationType";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GL_Budget_ID
     */
    String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsInverseDebitCreditOnly
     */
    String COLUMNNAME_IsInverseDebitCreditOnly = "IsInverseDebitCreditOnly";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name LineType
     */
    String COLUMNNAME_LineType = "LineType";
    /**
     * Column name Oper_1_ID
     */
    String COLUMNNAME_Oper_1_ID = "Oper_1_ID";
    /**
     * Column name Oper_2_ID
     */
    String COLUMNNAME_Oper_2_ID = "Oper_2_ID";
    /**
     * Column name PAAmountType
     */
    String COLUMNNAME_PAAmountType = "PAAmountType";
    /**
     * Column name PAPeriodType
     */
    String COLUMNNAME_PAPeriodType = "PAPeriodType";
    /**
     * Column name PA_ReportLine_ID
     */
    String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
    /**
     * Column name PA_ReportLineSet_ID
     */
    String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
    /**
     * Column name PA_ReportLine_UU
     */
    String COLUMNNAME_PA_ReportLine_UU = "PA_ReportLine_UU";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Calculation
     */
    String getCalculationType();

    /**
     * Set Calculation
     */
    void setCalculationType(String CalculationType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Budget. General Ledger Budget
     */
    int getGL_Budget_ID();

    /**
     * Set Budget. General Ledger Budget
     */
    void setGL_Budget_ID(int GL_Budget_ID);

    I_GL_Budget getGL_Budget() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Inverse Operation for Debit/Credit Only Column. Apply inverse operation to debit or credit
     * only column
     */
    void setIsInverseDebitCreditOnly(boolean IsInverseDebitCreditOnly);

    /**
     * Get Inverse Operation for Debit/Credit Only Column. Apply inverse operation to debit or credit
     * only column
     */
    boolean isInverseDebitCreditOnly();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Get Line Type
     */
    String getLineType();

    /**
     * Set Line Type
     */
    void setLineType(String LineType);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Operand 1. First operand for calculation
     */
    int getOper_1_ID();

    /**
     * Set Operand 1. First operand for calculation
     */
    void setOper_1_ID(int Oper_1_ID);

    I_PA_ReportLine getOper_1() throws RuntimeException;

    /**
     * Get Operand 2. Second operand for calculation
     */
    int getOper_2_ID();

    /**
     * Set Operand 2. Second operand for calculation
     */
    void setOper_2_ID(int Oper_2_ID);

    I_PA_ReportLine getOper_2() throws RuntimeException;

    /**
     * Get Amount Type. PA Amount Type for reporting
     */
    String getPAAmountType();

    /**
     * Set Amount Type. PA Amount Type for reporting
     */
    void setPAAmountType(String PAAmountType);

    /**
     * Get Period Type. PA Period Type
     */
    String getPAPeriodType();

    /**
     * Set Period Type. PA Period Type
     */
    void setPAPeriodType(String PAPeriodType);

    /**
     * Get Report Line
     */
    int getPA_ReportLine_ID();

    /**
     * Set Report Line
     */
    void setPA_ReportLine_ID(int PA_ReportLine_ID);

    /**
     * Get Report Line Set
     */
    int getPA_ReportLineSet_ID();

    /**
     * Set Report Line Set
     */
    void setPA_ReportLineSet_ID(int PA_ReportLineSet_ID);

    I_PA_ReportLineSet getPA_ReportLineSet() throws RuntimeException;

    /**
     * Get PA_ReportLine_UU
     */
    String getPA_ReportLine_UU();

    /**
     * Set PA_ReportLine_UU
     */
    void setPA_ReportLine_UU(String PA_ReportLine_UU);

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
