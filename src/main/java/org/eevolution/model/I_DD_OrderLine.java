package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for DD_OrderLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_DD_OrderLine {

    /**
     * TableName=DD_OrderLine
     */
    String Table_Name = "DD_OrderLine";

    /**
     * AD_Table_ID=53038
     */
    int Table_ID = 53038;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name ConfirmedQty
     */
    String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
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
     * Column name DateDelivered
     */
    String COLUMNNAME_DateDelivered = "DateDelivered";
    /**
     * Column name DateOrdered
     */
    String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePromised
     */
    String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DD_Order_ID
     */
    String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
    /**
     * Column name DD_OrderLine_ID
     */
    String COLUMNNAME_DD_OrderLine_ID = "DD_OrderLine_ID";
    /**
     * Column name DD_OrderLine_UU
     */
    String COLUMNNAME_DD_OrderLine_UU = "DD_OrderLine_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name FreightAmt
     */
    String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDescription
     */
    String COLUMNNAME_IsDescription = "IsDescription";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_AttributeSetInstanceTo_ID
     */
    String COLUMNNAME_M_AttributeSetInstanceTo_ID = "M_AttributeSetInstanceTo_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_LocatorTo_ID
     */
    String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name PickedQty
     */
    String COLUMNNAME_PickedQty = "PickedQty";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyDelivered
     */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyInTransit
     */
    String COLUMNNAME_QtyInTransit = "QtyInTransit";
    /**
     * Column name QtyOrdered
     */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name QtyReserved
     */
    String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name TargetQty
     */
    String COLUMNNAME_TargetQty = "TargetQty";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    void setChargeId(int C_Charge_ID);

    org.compiere.model.I_C_Charge getCharge() throws RuntimeException;

    /**
     * Get Confirmed Quantity. Confirmation of a received quantity
     */
    BigDecimal getConfirmedQty();

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    org.compiere.model.I_C_Project getProject() throws RuntimeException;

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
    int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    org.compiere.model.I_C_UOM getUOM() throws RuntimeException;

    /**
     * Get Date Delivered. Date when the product was delivered
     */
    Timestamp getDateDelivered();

    /**
     * Set Date Delivered. Date when the product was delivered
     */
    void setDateDelivered(Timestamp DateDelivered);

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date Promised. Date Order was promised
     */
    Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    void setDatePromised(Timestamp DatePromised);

    /**
     * Get Distribution Order
     */
    int getDistributionOrderId();

    /**
     * Set Distribution Order
     */
    void setDistributionOrderId(int DD_Order_ID);

    org.eevolution.model.I_DD_Order getDistributionOrder() throws RuntimeException;

    /**
     * Get Distribution Order Line
     */
    int getDistributionOrderLineId();

    /**
     * Set Distribution Order Line
     */
    void setDistributionOrderLineId(int DD_OrderLine_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Freight Amount. Freight Amount
     */
    BigDecimal getFreightAmt();

    /**
     * Set Freight Amount. Freight Amount
     */
    void setFreightAmt(BigDecimal FreightAmt);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Description Only. if true, the line is just description and no transaction
     */
    void setIsDescription(boolean IsDescription);

    /**
     * Get Description Only. if true, the line is just description and no transaction
     */
    boolean isDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Invoiced. Is this invoiced?
     */
    void setIsInvoiced(boolean IsInvoiced);

    /**
     * Get Invoiced. Is this invoiced?
     */
    boolean isInvoiced();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    BigDecimal getLineNetAmt();

    /**
     * Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    void setLineNetAmt(BigDecimal LineNetAmt);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Set Attribute Set Instance To. Target Product Attribute Set Instance
     */
    void setAttributeSetInstanceToId(int M_AttributeSetInstanceTo_ID);

    /**
     * Get Attribute Set Instance To. Target Product Attribute Set Instance
     */
    int getMAttributeSetInstanceToId();

    I_M_AttributeSetInstance getMAttributeSetInstanceTo() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    org.compiere.model.I_M_Locator getLocator() throws RuntimeException;

    /**
     * Get Locator To. Location inventory is moved to
     */
    int getLocatorToId();

    /**
     * Set Locator To. Location inventory is moved to
     */
    void setLocatorToId(int M_LocatorTo_ID);

    org.compiere.model.I_M_Locator getLocatorTo() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    org.compiere.model.I_M_Shipper getShipper() throws RuntimeException;

    /**
     * Get Picked Quantity
     */
    BigDecimal getPickedQty();

    /**
     * Set Picked Quantity
     */
    void setPickedQty(BigDecimal PickedQty);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Qty In Transit
     */
    BigDecimal getQtyInTransit();

    /**
     * Set Qty In Transit
     */
    void setQtyInTransit(BigDecimal QtyInTransit);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    BigDecimal getQtyOrdered();

    /**
     * Set Ordered Quantity. Ordered Quantity
     */
    void setQtyOrdered(BigDecimal QtyOrdered);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    BigDecimal getScrappedQty();

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Get Target Quantity. Target Movement Quantity
     */
    BigDecimal getTargetQty();

    /**
     * Set Target Quantity. Target Movement Quantity
     */
    void setTargetQty(BigDecimal TargetQty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;
}
