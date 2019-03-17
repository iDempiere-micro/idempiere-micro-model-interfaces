package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_ProjectIssue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectIssue {

    /**
     * TableName=C_ProjectIssue
     */
    String Table_Name = "C_ProjectIssue";

    /**
     * AD_Table_ID=623
     */
    int Table_ID = 623;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectIssue_ID
     */
    String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name S_TimeExpenseLine_ID
     */
    String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    I_C_Project getProject() throws RuntimeException;

    /**
     * Get Project Issue. Project Issues (Material, Labor)
     */
    int getProjectIssueId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    I_M_Locator getLocator() throws RuntimeException;

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Expense Line. Time and Expense Report Line
     */
    int getTimeExpenseLineId();

    /**
     * Set Expense Line. Time and Expense Report Line
     */
    void setTimeExpenseLineId(int S_TimeExpenseLine_ID);

}
