package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintForm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintForm {

    /**
     * TableName=AD_PrintForm
     */
    String Table_Name = "AD_PrintForm";

    /**
     * AD_Table_ID=454
     */
    int Table_ID = 454;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintForm_ID
     */
    String COLUMNNAME_AD_PrintForm_ID = "AD_PrintForm_ID";
    /**
     * Column name AD_PrintForm_UU
     */
    String COLUMNNAME_AD_PrintForm_UU = "AD_PrintForm_UU";
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
     * Column name Distrib_Order_MailText_ID
     */
    String COLUMNNAME_Distrib_Order_MailText_ID = "Distrib_Order_MailText_ID";
    /**
     * Column name Distrib_Order_PrintFormat_ID
     */
    String COLUMNNAME_Distrib_Order_PrintFormat_ID =
            "Distrib_Order_PrintFormat_ID";
    /**
     * Column name Invoice_MailText_ID
     */
    String COLUMNNAME_Invoice_MailText_ID = "Invoice_MailText_ID";
    /**
     * Column name Invoice_PrintFormat_ID
     */
    String COLUMNNAME_Invoice_PrintFormat_ID = "Invoice_PrintFormat_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Manuf_Order_MailText_ID
     */
    String COLUMNNAME_Manuf_Order_MailText_ID = "Manuf_Order_MailText_ID";
    /**
     * Column name Manuf_Order_PrintFormat_ID
     */
    String COLUMNNAME_Manuf_Order_PrintFormat_ID = "Manuf_Order_PrintFormat_ID";
    /**
     * Column name Order_MailText_ID
     */
    String COLUMNNAME_Order_MailText_ID = "Order_MailText_ID";
    /**
     * Column name Order_PrintFormat_ID
     */
    String COLUMNNAME_Order_PrintFormat_ID = "Order_PrintFormat_ID";
    /**
     * Column name Project_MailText_ID
     */
    String COLUMNNAME_Project_MailText_ID = "Project_MailText_ID";
    /**
     * Column name Project_PrintFormat_ID
     */
    String COLUMNNAME_Project_PrintFormat_ID = "Project_PrintFormat_ID";
    /**
     * Column name Remittance_MailText_ID
     */
    String COLUMNNAME_Remittance_MailText_ID = "Remittance_MailText_ID";
    /**
     * Column name Remittance_PrintFormat_ID
     */
    String COLUMNNAME_Remittance_PrintFormat_ID = "Remittance_PrintFormat_ID";
    /**
     * Column name Shipment_MailText_ID
     */
    String COLUMNNAME_Shipment_MailText_ID = "Shipment_MailText_ID";
    /**
     * Column name Shipment_PrintFormat_ID
     */
    String COLUMNNAME_Shipment_PrintFormat_ID = "Shipment_PrintFormat_ID";
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
     * Get Print Form. Form
     */
    int getAD_PrintForm_ID();

    /**
     * Set Print Form. Form
     */
    void setAD_PrintForm_ID(int AD_PrintForm_ID);

    /**
     * Get AD_PrintForm_UU
     */
    String getAD_PrintForm_UU();

    /**
     * Set AD_PrintForm_UU
     */
    void setAD_PrintForm_UU(String AD_PrintForm_UU);

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
     * Get Distribution Order Mail Text. Email text used for sending Distribution Order
     */
    int getDistrib_Order_MailText_ID();

    /**
     * Set Distribution Order Mail Text. Email text used for sending Distribution Order
     */
    void setDistrib_Order_MailText_ID(int Distrib_Order_MailText_ID);

    I_R_MailText getDistrib_Order_MailText() throws RuntimeException;

    /**
     * Get Distribution Order Print Format. Print Format for printing Distribution Order
     */
    int getDistrib_Order_PrintFormat_ID();

    /**
     * Set Distribution Order Print Format. Print Format for printing Distribution Order
     */
    void setDistrib_Order_PrintFormat_ID(int Distrib_Order_PrintFormat_ID);

    I_AD_PrintFormat getDistrib_Order_PrintFormat() throws RuntimeException;

    /**
     * Get Invoice Mail Text. Email text used for sending invoices
     */
    int getInvoice_MailText_ID();

    /**
     * Set Invoice Mail Text. Email text used for sending invoices
     */
    void setInvoice_MailText_ID(int Invoice_MailText_ID);

    I_R_MailText getInvoice_MailText() throws RuntimeException;

    /**
     * Get Invoice Print Format. Print Format for printing Invoices
     */
    int getInvoice_PrintFormat_ID();

    /**
     * Set Invoice Print Format. Print Format for printing Invoices
     */
    void setInvoice_PrintFormat_ID(int Invoice_PrintFormat_ID);

    I_AD_PrintFormat getInvoice_PrintFormat() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Manufacturing Order Mail Text. Email text used for sending Manufacturing Order
     */
    int getManuf_Order_MailText_ID();

    /**
     * Set Manufacturing Order Mail Text. Email text used for sending Manufacturing Order
     */
    void setManuf_Order_MailText_ID(int Manuf_Order_MailText_ID);

    I_R_MailText getManuf_Order_MailText() throws RuntimeException;

    /**
     * Get Manufacturing Order Print Format. Print Format for printing Manufacturing Order
     */
    int getManuf_Order_PrintFormat_ID();

    /**
     * Set Manufacturing Order Print Format. Print Format for printing Manufacturing Order
     */
    void setManuf_Order_PrintFormat_ID(int Manuf_Order_PrintFormat_ID);

    I_AD_PrintFormat getManuf_Order_PrintFormat() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Order Mail Text. Email text used for sending order acknowledgements or quotations
     */
    int getOrder_MailText_ID();

    /**
     * Set Order Mail Text. Email text used for sending order acknowledgements or quotations
     */
    void setOrder_MailText_ID(int Order_MailText_ID);

    I_R_MailText getOrder_MailText() throws RuntimeException;

    /**
     * Get Order Print Format. Print Format for Orders, Quotes, Offers
     */
    int getOrder_PrintFormat_ID();

    /**
     * Set Order Print Format. Print Format for Orders, Quotes, Offers
     */
    void setOrder_PrintFormat_ID(int Order_PrintFormat_ID);

    I_AD_PrintFormat getOrder_PrintFormat() throws RuntimeException;

    /**
     * Get Project Mail Text. Standard text for Project EMails
     */
    int getProject_MailText_ID();

    /**
     * Set Project Mail Text. Standard text for Project EMails
     */
    void setProject_MailText_ID(int Project_MailText_ID);

    I_R_MailText getProject_MailText() throws RuntimeException;

    /**
     * Get Project Print Format. Standard Project Print Format
     */
    int getProject_PrintFormat_ID();

    /**
     * Set Project Print Format. Standard Project Print Format
     */
    void setProject_PrintFormat_ID(int Project_PrintFormat_ID);

    I_AD_PrintFormat getProject_PrintFormat() throws RuntimeException;

    /**
     * Get Remittance Mail Text. Email text used for sending payment remittances
     */
    int getRemittance_MailText_ID();

    /**
     * Set Remittance Mail Text. Email text used for sending payment remittances
     */
    void setRemittance_MailText_ID(int Remittance_MailText_ID);

    I_R_MailText getRemittance_MailText() throws RuntimeException;

    /**
     * Get Remittance Print Format. Print Format for separate Remittances
     */
    int getRemittance_PrintFormat_ID();

    /**
     * Set Remittance Print Format. Print Format for separate Remittances
     */
    void setRemittance_PrintFormat_ID(int Remittance_PrintFormat_ID);

    I_AD_PrintFormat getRemittance_PrintFormat() throws RuntimeException;

    /**
     * Get Shipment Mail Text. Email text used for sending delivery notes
     */
    int getShipment_MailText_ID();

    /**
     * Set Shipment Mail Text. Email text used for sending delivery notes
     */
    void setShipment_MailText_ID(int Shipment_MailText_ID);

    I_R_MailText getShipment_MailText() throws RuntimeException;

    /**
     * Get Shipment Print Format. Print Format for Shipments, Receipts, Pick Lists
     */
    int getShipment_PrintFormat_ID();

    /**
     * Set Shipment Print Format. Print Format for Shipments, Receipts, Pick Lists
     */
    void setShipment_PrintFormat_ID(int Shipment_PrintFormat_ID);

    I_AD_PrintFormat getShipment_PrintFormat() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
