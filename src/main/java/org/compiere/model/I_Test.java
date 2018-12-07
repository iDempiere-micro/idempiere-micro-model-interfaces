package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for Test
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_Test {

    /**
     * TableName=Test
     */
    String Table_Name = "Test";

    /**
     * AD_Table_ID=135
     */
    int Table_ID = 135;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name Account_Acct
     */
    String COLUMNNAME_Account_Acct = "Account_Acct";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CharacterData
     */
    String COLUMNNAME_CharacterData = "CharacterData";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name T_Amount
     */
    String COLUMNNAME_T_Amount = "T_Amount";
    /**
     * Column name T_Date
     */
    String COLUMNNAME_T_Date = "T_Date";
    /**
     * Column name T_DateTime
     */
    String COLUMNNAME_T_DateTime = "T_DateTime";
    /**
     * Column name Test_ID
     */
    String COLUMNNAME_Test_ID = "Test_ID";
    /**
     * Column name Test_UU
     */
    String COLUMNNAME_Test_UU = "Test_UU";
    /**
     * Column name T_Integer
     */
    String COLUMNNAME_T_Integer = "T_Integer";
    /**
     * Column name T_Number
     */
    String COLUMNNAME_T_Number = "T_Number";
    /**
     * Column name T_Qty
     */
    String COLUMNNAME_T_Qty = "T_Qty";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Account_Acct
     */
    int getAccount_Acct();

    /**
     * Set Account_Acct
     */
    void setAccount_Acct(int Account_Acct);

    I_C_ValidCombination getAccount_A() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Binary Data. Binary Data
     */
    int getBinaryData();

    /**
     * Set Binary Data. Binary Data
     */
    void setBinaryData(int BinaryData);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Character Data. Long Character Field
     */
    String getCharacterData();

    /**
     * Set Character Data. Long Character Field
     */
    void setCharacterData(String CharacterData);

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Set Address. Location or Address
     */
    void setC_Location_ID(int C_Location_ID);

    I_C_Location getC_Location() throws RuntimeException;

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    I_C_Payment getC_Payment() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Amount
     */
    BigDecimal getT_Amount();

    /**
     * Set Amount
     */
    void setT_Amount(BigDecimal T_Amount);

    /**
     * Get Date
     */
    Timestamp getT_Date();

    /**
     * Set Date
     */
    void setT_Date(Timestamp T_Date);

    /**
     * Get DateTime
     */
    Timestamp getT_DateTime();

    /**
     * Set DateTime
     */
    void setT_DateTime(Timestamp T_DateTime);

    /**
     * Get Test ID
     */
    int getTest_ID();

    /**
     * Set Test ID
     */
    void setTest_ID(int Test_ID);

    /**
     * Get Test_UU
     */
    String getTest_UU();

    /**
     * Set Test_UU
     */
    void setTest_UU(String Test_UU);

    /**
     * Get Integer
     */
    int getT_Integer();

    /**
     * Set Integer
     */
    void setT_Integer(int T_Integer);

    /**
     * Get Number
     */
    BigDecimal getT_Number();

    /**
     * Set Number
     */
    void setT_Number(BigDecimal T_Number);

    /**
     * Get Qty
     */
    BigDecimal getT_Qty();

    /**
     * Set Qty
     */
    void setT_Qty(BigDecimal T_Qty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
