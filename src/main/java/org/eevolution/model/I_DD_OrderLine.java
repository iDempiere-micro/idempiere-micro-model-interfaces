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
@SuppressWarnings("all")
public interface I_DD_OrderLine {

    /**
     * TableName=DD_OrderLine
     */
    public static final String Table_Name = "DD_OrderLine";

    /**
     * AD_Table_ID=53038
     */
    public static final int Table_ID = 53038;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Charge_ID
     */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name ConfirmedQty
     */
    public static final String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
    /**
     * Column name C_Project_ID
     */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateDelivered
     */
    public static final String COLUMNNAME_DateDelivered = "DateDelivered";
    /**
     * Column name DateOrdered
     */
    public static final String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePromised
     */
    public static final String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DD_Order_ID
     */
    public static final String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
    /**
     * Column name DD_OrderLine_ID
     */
    public static final String COLUMNNAME_DD_OrderLine_ID = "DD_OrderLine_ID";
    /**
     * Column name DD_OrderLine_UU
     */
    public static final String COLUMNNAME_DD_OrderLine_UU = "DD_OrderLine_UU";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name FreightAmt
     */
    public static final String COLUMNNAME_FreightAmt = "FreightAmt";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDescription
     */
    public static final String COLUMNNAME_IsDescription = "IsDescription";
    /**
     * Column name IsInvoiced
     */
    public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name Line
     */
    public static final String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_AttributeSetInstanceTo_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstanceTo_ID = "M_AttributeSetInstanceTo_ID";
    /**
     * Column name M_Locator_ID
     */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_LocatorTo_ID
     */
    public static final String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Shipper_ID
     */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name PickedQty
     */
    public static final String COLUMNNAME_PickedQty = "PickedQty";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyDelivered
     */
    public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyEntered
     */
    public static final String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyInTransit
     */
    public static final String COLUMNNAME_QtyInTransit = "QtyInTransit";
    /**
     * Column name QtyOrdered
     */
    public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name QtyReserved
     */
    public static final String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name ScrappedQty
     */
    public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name TargetQty
     */
    public static final String COLUMNNAME_TargetQty = "TargetQty";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    public static final String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    public static final String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    public int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    public void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    public int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    public void setCampaignId(int C_Campaign_ID);

    public org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    public int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    public void setChargeId(int C_Charge_ID);

    public org.compiere.model.I_C_Charge getCharge() throws RuntimeException;

    /**
     * Get Confirmed Quantity. Confirmation of a received quantity
     */
    public BigDecimal getConfirmedQty();

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    public void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Project. Financial Project
     */
    public int getProjectId();

    /**
     * Set Project. Financial Project
     */
    public void setProjectId(int C_Project_ID);

    public org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    public int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    public void setUOMId(int C_UOM_ID);

    public org.compiere.model.I_C_UOM getUOM() throws RuntimeException;

    /**
     * Get Date Delivered. Date when the product was delivered
     */
    public Timestamp getDateDelivered();

    /**
     * Set Date Delivered. Date when the product was delivered
     */
    public void setDateDelivered(Timestamp DateDelivered);

    /**
     * Get Date Ordered. Date of Order
     */
    public Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    public void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date Promised. Date Order was promised
     */
    public Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    public void setDatePromised(Timestamp DatePromised);

    /**
     * Get Distribution Order
     */
    public int getDD_OrderId();

    /**
     * Set Distribution Order
     */
    public void setDD_OrderId(int DD_Order_ID);

    public org.eevolution.model.I_DD_Order getDD_Order() throws RuntimeException;

    /**
     * Get Distribution Order Line
     */
    public int getDD_OrderLineId();

    /**
     * Set Distribution Order Line
     */
    public void setDD_OrderLineId(int DD_OrderLine_ID);

    /**
     * Get DD_OrderLine_UU
     */
    public String getDD_OrderLine_UU();

    /**
     * Set DD_OrderLine_UU
     */
    public void setDD_OrderLine_UU(String DD_OrderLine_UU);

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Get Freight Amount. Freight Amount
     */
    public BigDecimal getFreightAmt();

    /**
     * Set Freight Amount. Freight Amount
     */
    public void setFreightAmt(BigDecimal FreightAmt);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Description Only. if true, the line is just description and no transaction
     */
    public void setIsDescription(boolean IsDescription);

    /**
     * Get Description Only. if true, the line is just description and no transaction
     */
    public boolean isDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Set Invoiced. Is this invoiced?
     */
    public void setIsInvoiced(boolean IsInvoiced);

    /**
     * Get Invoiced. Is this invoiced?
     */
    public boolean isInvoiced();

    /**
     * Get Line No. Unique line for this document
     */
    public int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    public void setLine(int Line);

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    public BigDecimal getLineNetAmt();

    /**
     * Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    public void setLineNetAmt(BigDecimal LineNetAmt);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Set Attribute Set Instance To. Target Product Attribute Set Instance
     */
    public void setM_AttributeSetInstanceToId(int M_AttributeSetInstanceTo_ID);

    /**
     * Get Attribute Set Instance To. Target Product Attribute Set Instance
     */
    public int getMAttributeSetInstanceToId();

    public I_M_AttributeSetInstance getMAttributeSetInstanceTo() throws RuntimeException;

    /**
     * Get Locator. Warehouse Locator
     */
    public int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    public void setLocatorId(int M_Locator_ID);

    public org.compiere.model.I_M_Locator getLocator() throws RuntimeException;

    /**
     * Get Locator To. Location inventory is moved to
     */
    public int getLocatorToId();

    /**
     * Set Locator To. Location inventory is moved to
     */
    public void setLocatorToId(int M_LocatorTo_ID);

    public org.compiere.model.I_M_Locator getLocatorTo() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    public int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    public void setProductId(int M_Product_ID);

    public org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    public int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    public void setShipperId(int M_Shipper_ID);

    public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /**
     * Get Picked Quantity
     */
    public BigDecimal getPickedQty();

    /**
     * Set Picked Quantity
     */
    public void setPickedQty(BigDecimal PickedQty);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    public BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    public void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    public BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    public void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Qty In Transit
     */
    public BigDecimal getQtyInTransit();

    /**
     * Set Qty In Transit
     */
    public void setQtyInTransit(BigDecimal QtyInTransit);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    public BigDecimal getQtyOrdered();

    /**
     * Set Ordered Quantity. Ordered Quantity
     */
    public void setQtyOrdered(BigDecimal QtyOrdered);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    public BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    public void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    public BigDecimal getScrappedQty();

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    public void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Get Target Quantity. Target Movement Quantity
     */
    public BigDecimal getTargetQty();

    /**
     * Set Target Quantity. Target Movement Quantity
     */
    public void setTargetQty(BigDecimal TargetQty);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    public int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(int User1_ID);

    public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    public int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(int User2_ID);

    public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;
}
