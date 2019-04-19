package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for C_InvoiceLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceLine extends PersistentObject, IDocLine {

    /**
     * TableName=C_InvoiceLine
     */
    String Table_Name = "C_InvoiceLine";

    /**
     * AD_Table_ID=333
     */
    int Table_ID = 333;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name A_Processed
     */
    String COLUMNNAME_A_Processed = "A_Processed";
    /**
     * Column name C_1099Box_ID
     */
    String COLUMNNAME_C_1099Box_ID = "C_1099Box_ID";
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
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsDescription
     */
    String COLUMNNAME_IsDescription = "IsDescription";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name LineTotalAmt
     */
    String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_RMALine_ID
     */
    String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
    /**
     * Column name PriceActual
     */
    String COLUMNNAME_PriceActual = "PriceActual";
    /**
     * Column name PriceEntered
     */
    String COLUMNNAME_PriceEntered = "PriceEntered";
    /**
     * Column name PriceLimit
     */
    String COLUMNNAME_PriceLimit = "PriceLimit";
    /**
     * Column name PriceList
     */
    String COLUMNNAME_PriceList = "PriceList";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
    /**
     * Column name Ref_InvoiceLine_ID
     */
    String COLUMNNAME_Ref_InvoiceLine_ID = "Ref_InvoiceLine_ID";
    /**
     * Column name RRAmt
     */
    String COLUMNNAME_RRAmt = "RRAmt";
    /**
     * Column name RRStartDate
     */
    String COLUMNNAME_RRStartDate = "RRStartDate";
    /**
     * Column name S_ResourceAssignment_ID
     */
    String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
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
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getInvoiceId();

    I_C_Invoice getInvoice() throws RuntimeException;

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getInvoiceLineId();

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getOrderLineId();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Get Tax. Tax identifier
     */
    int getTaxId();

    /**
     * Get Description Only. if true, the line is just description and no transaction
     */
    boolean isDescription();

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    BigDecimal getLineNetAmt();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Get Unit Price. Actual Price
     */
    BigDecimal getPriceActual();

    /**
     * Set Unit Price. Actual Price
     */
    void setPriceActual(BigDecimal PriceActual);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Quantity Invoiced. Invoiced Quantity
     */
    BigDecimal getQtyInvoiced();

    /**
     * Set Quantity Invoiced. Invoiced Quantity
     */
    void setQtyInvoiced(BigDecimal QtyInvoiced);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    boolean isTaxIncluded();

    boolean updateInvoiceTax(boolean b);

    boolean updateHeaderTax();

    void clearParent();

    I_C_Invoice getParent();

    void saveEx();

    void setInOutLineId(int inOutLineId);

    void setLine(int number);

    void setRef_InvoiceLineId(int invoiceLineId);

    String allocateLandedCosts();

    int getLine();

    void setProductId(int i);

    void setPriceEntered(BigDecimal zero);

    void setPriceLimit(BigDecimal zero);

    void setPriceList(BigDecimal zero);

    void setLineNetAmt(BigDecimal zero);

    String getDescription();

    void setDescription(String toString);

    void setClientOrg(PersistentObject po);

    void setInvoice(I_C_Invoice counter);

    void setPrice();

    boolean setTax();

    void setQty(BigDecimal zero);

    void setTaxAmt(BigDecimal zero);

    void setLineTotalAmt(BigDecimal zero);

    void addDescription(String msgadd);

    BigDecimal getTaxAmt();

    BigDecimal getLineTotalAmt();

    BigDecimal getPriceList();

    BigDecimal getPriceLimit();

    BigDecimal getPriceEntered();

    int getUOMId();

    int getRMALineId();

    void setUOMId(int uomId);

    BigDecimal getMatchedQty();

    I_C_LandedCost[] getLandedCost(String o);

    int getChargeId();

    int getProjectPhaseId();

    int getProjectTaskId();

    void setPrice(int priceListId);

    boolean is_Changed();

    void setTaxAmt();
}
