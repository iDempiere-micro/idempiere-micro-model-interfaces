package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for C_ProjectLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectLine extends PersistentObject {

    /**
     * TableName=C_ProjectLine
     */
    String Table_Name = "C_ProjectLine";

    /**
     * AD_Table_ID=434
     */
    int Table_ID = 434;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name CommittedQty
     */
    String COLUMNNAME_CommittedQty = "CommittedQty";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderPO_ID
     */
    String COLUMNNAME_C_OrderPO_ID = "C_OrderPO_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectIssue_ID
     */
    String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
    /**
     * Column name C_ProjectLine_ID
     */
    String COLUMNNAME_C_ProjectLine_ID = "C_ProjectLine_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name InvoicedAmt
     */
    String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
    /**
     * Column name InvoicedQty
     */
    String COLUMNNAME_InvoicedQty = "InvoicedQty";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Production_ID
     */
    String COLUMNNAME_M_Production_ID = "M_Production_ID";
    /**
     * Column name PlannedAmt
     */
    String COLUMNNAME_PlannedAmt = "PlannedAmt";
    /**
     * Column name PlannedMarginAmt
     */
    String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";
    /**
     * Column name PlannedPrice
     */
    String COLUMNNAME_PlannedPrice = "PlannedPrice";
    /**
     * Column name PlannedQty
     */
    String COLUMNNAME_PlannedQty = "PlannedQty";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";

    /**
     * Set Committed Quantity. The (legal) commitment Quantity
     */
    void setCommittedQty(BigDecimal CommittedQty);

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Get Purchase Order. Purchase Order
     */
    int getOrderPOId();

    /**
     * Set Purchase Order. Purchase Order
     */
    void setOrderPOId(int C_OrderPO_ID);

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
     * Set Project Issue. Project Issues (Material, Labor)
     */
    void setProjectIssueId(int C_ProjectIssue_ID);

    /**
     * Get Project Line. Task or step in a project
     */
    int getProjectLineId();

    /**
     * Get Project Phase. Phase of a Project
     */
    int getProjectPhaseId();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setProjectPhaseId(int C_ProjectPhase_ID);

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getProjectTaskId();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setProjectTaskId(int C_ProjectTask_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Invoiced Amount. The amount invoiced
     */
    void setInvoicedAmt(BigDecimal InvoicedAmt);

    /**
     * Get Quantity Invoiced . The quantity invoiced
     */
    BigDecimal getInvoicedQty();

    /**
     * Set Quantity Invoiced . The quantity invoiced
     */
    void setInvoicedQty(BigDecimal InvoicedQty);

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Product Category. Category of a Product
     */
    int getProductCategoryId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Production. Plan for producing a product
     */
    int getProductionId();

    /**
     * Set Production. Plan for producing a product
     */
    void setProductionId(int M_Production_ID);

    /**
     * Set Planned Amount. Planned amount for this project
     */
    void setPlannedAmt(BigDecimal PlannedAmt);

    /**
     * Set Planned Margin. Project's planned margin amount
     */
    void setPlannedMarginAmt(BigDecimal PlannedMarginAmt);

    /**
     * Get Planned Price. Planned price for this project line
     */
    BigDecimal getPlannedPrice();

    /**
     * Set Planned Price. Planned price for this project line
     */
    void setPlannedPrice(BigDecimal PlannedPrice);

    /**
     * Get Planned Quantity. Planned quantity for this project
     */
    BigDecimal getPlannedQty();

    /**
     * Set Planned Quantity. Planned quantity for this project
     */
    void setPlannedQty(BigDecimal PlannedQty);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    void setMProjectIssue(I_C_ProjectIssue pi);

    void saveEx();

    void setOrgId(int ad_org_id);
}
