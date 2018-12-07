package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_LabelPrinterFunction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_LabelPrinterFunction {

    /**
     * TableName=AD_LabelPrinterFunction
     */
    String Table_Name = "AD_LabelPrinterFunction";

    /**
     * AD_Table_ID=624
     */
    int Table_ID = 624;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_LabelPrinterFunction_ID
     */
    String COLUMNNAME_AD_LabelPrinterFunction_ID = "AD_LabelPrinterFunction_ID";
    /**
     * Column name AD_LabelPrinterFunction_UU
     */
    String COLUMNNAME_AD_LabelPrinterFunction_UU = "AD_LabelPrinterFunction_UU";
    /**
     * Column name AD_LabelPrinter_ID
     */
    String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name FunctionPrefix
     */
    String COLUMNNAME_FunctionPrefix = "FunctionPrefix";
    /**
     * Column name FunctionSuffix
     */
    String COLUMNNAME_FunctionSuffix = "FunctionSuffix";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsXYPosition
     */
    String COLUMNNAME_IsXYPosition = "IsXYPosition";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name XYSeparator
     */
    String COLUMNNAME_XYSeparator = "XYSeparator";

    /**
     * Get Label printer Function. Function of Label Printer
     */
    int getAD_LabelPrinterFunction_ID();

    /**
     * Set Label printer Function. Function of Label Printer
     */
    void setAD_LabelPrinterFunction_ID(int AD_LabelPrinterFunction_ID);

    /**
     * Get AD_LabelPrinterFunction_UU
     */
    String getAD_LabelPrinterFunction_UU();

    /**
     * Set AD_LabelPrinterFunction_UU
     */
    void setAD_LabelPrinterFunction_UU(String AD_LabelPrinterFunction_UU);

    /**
     * Get Label printer. Label Printer Definition
     */
    int getAD_LabelPrinter_ID();

    /**
     * Set Label printer. Label Printer Definition
     */
    void setAD_LabelPrinter_ID(int AD_LabelPrinter_ID);

    I_AD_LabelPrinter getAD_LabelPrinter() throws RuntimeException;

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Function Prefix. Data sent before the function
     */
    String getFunctionPrefix();

    /**
     * Set Function Prefix. Data sent before the function
     */
    void setFunctionPrefix(String FunctionPrefix);

    /**
     * Get Function Suffix. Data sent after the function
     */
    String getFunctionSuffix();

    /**
     * Set Function Suffix. Data sent after the function
     */
    void setFunctionSuffix(String FunctionSuffix);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set XY Position. The Function is XY position
     */
    void setIsXYPosition(boolean IsXYPosition);

    /**
     * Get XY Position. The Function is XY position
     */
    boolean isXYPosition();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get XY Separator. The separator between the X and Y function.
     */
    String getXYSeparator();

    /**
     * Set XY Separator. The separator between the X and Y function.
     */
    void setXYSeparator(String XYSeparator);
}
