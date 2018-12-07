package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_RatioElement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_RatioElement {

    /**
     * TableName=PA_RatioElement
     */
    String Table_Name = "PA_RatioElement";

    /**
     * AD_Table_ID=836
     */
    int Table_ID = 836;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name ConstantValue
     */
    String COLUMNNAME_ConstantValue = "ConstantValue";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PA_MeasureCalc_ID
     */
    String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
    /**
     * Column name PA_RatioElement_ID
     */
    String COLUMNNAME_PA_RatioElement_ID = "PA_RatioElement_ID";
    /**
     * Column name PA_RatioElement_UU
     */
    String COLUMNNAME_PA_RatioElement_UU = "PA_RatioElement_UU";
    /**
     * Column name PA_Ratio_ID
     */
    String COLUMNNAME_PA_Ratio_ID = "PA_Ratio_ID";
    /**
     * Column name PA_RatioUsed_ID
     */
    String COLUMNNAME_PA_RatioUsed_ID = "PA_RatioUsed_ID";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name RatioElementType
     */
    String COLUMNNAME_RatioElementType = "RatioElementType";
    /**
     * Column name RatioOperand
     */
    String COLUMNNAME_RatioOperand = "RatioOperand";
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
     * Get Account. Account used
     */
    int getAccount_ID();

    /**
     * Set Account. Account used
     */
    void setAccount_ID(int Account_ID);

    I_C_ElementValue getAccount() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Constant Value. Constant value
     */
    BigDecimal getConstantValue();

    /**
     * Set Constant Value. Constant value
     */
    void setConstantValue(BigDecimal ConstantValue);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Measure Calculation. Calculation method for measuring performance
     */
    int getPA_MeasureCalc_ID();

    /**
     * Set Measure Calculation. Calculation method for measuring performance
     */
    void setPA_MeasureCalc_ID(int PA_MeasureCalc_ID);

    I_PA_MeasureCalc getPA_MeasureCalc() throws RuntimeException;

    /**
     * Get Ratio Element. Performance Ratio Element
     */
    int getPA_RatioElement_ID();

    /**
     * Set Ratio Element. Performance Ratio Element
     */
    void setPA_RatioElement_ID(int PA_RatioElement_ID);

    /**
     * Get PA_RatioElement_UU
     */
    String getPA_RatioElement_UU();

    /**
     * Set PA_RatioElement_UU
     */
    void setPA_RatioElement_UU(String PA_RatioElement_UU);

    /**
     * Get Ratio. Performance Ratio
     */
    int getPA_Ratio_ID();

    /**
     * Set Ratio. Performance Ratio
     */
    void setPA_Ratio_ID(int PA_Ratio_ID);

    I_PA_Ratio getPA_Ratio() throws RuntimeException;

    /**
     * Get Ratio Used. Performance Ratio Used
     */
    int getPA_RatioUsed_ID();

    /**
     * Set Ratio Used. Performance Ratio Used
     */
    void setPA_RatioUsed_ID(int PA_RatioUsed_ID);

    I_PA_Ratio getPA_RatioUsed() throws RuntimeException;

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Element Type. Ratio Element Type
     */
    String getRatioElementType();

    /**
     * Set Element Type. Ratio Element Type
     */
    void setRatioElementType(String RatioElementType);

    /**
     * Get Operand. Ratio Operand
     */
    String getRatioOperand();

    /**
     * Set Operand. Ratio Operand
     */
    void setRatioOperand(String RatioOperand);

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
