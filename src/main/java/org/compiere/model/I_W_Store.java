package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Store
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Store {

    /**
     * TableName=W_Store
     */
    String Table_Name = "W_Store";

    /**
     * AD_Table_ID=778
     */
    int Table_ID = 778;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
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
     * Column name EMailFooter
     */
    String COLUMNNAME_EMailFooter = "EMailFooter";
    /**
     * Column name EMailHeader
     */
    String COLUMNNAME_EMailHeader = "EMailHeader";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsMenuAssets
     */
    String COLUMNNAME_IsMenuAssets = "IsMenuAssets";
    /**
     * Column name IsMenuContact
     */
    String COLUMNNAME_IsMenuContact = "IsMenuContact";
    /**
     * Column name IsMenuInterests
     */
    String COLUMNNAME_IsMenuInterests = "IsMenuInterests";
    /**
     * Column name IsMenuInvoices
     */
    String COLUMNNAME_IsMenuInvoices = "IsMenuInvoices";
    /**
     * Column name IsMenuOrders
     */
    String COLUMNNAME_IsMenuOrders = "IsMenuOrders";
    /**
     * Column name IsMenuPayments
     */
    String COLUMNNAME_IsMenuPayments = "IsMenuPayments";
    /**
     * Column name IsMenuRegistrations
     */
    String COLUMNNAME_IsMenuRegistrations = "IsMenuRegistrations";
    /**
     * Column name IsMenuRequests
     */
    String COLUMNNAME_IsMenuRequests = "IsMenuRequests";
    /**
     * Column name IsMenuRfQs
     */
    String COLUMNNAME_IsMenuRfQs = "IsMenuRfQs";
    /**
     * Column name IsMenuShipments
     */
    String COLUMNNAME_IsMenuShipments = "IsMenuShipments";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Stylesheet
     */
    String COLUMNNAME_Stylesheet = "Stylesheet";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name URL
     */
    String COLUMNNAME_URL = "URL";
    /**
     * Column name WebContext
     */
    String COLUMNNAME_WebContext = "WebContext";
    /**
     * Column name WebInfo
     */
    String COLUMNNAME_WebInfo = "WebInfo";
    /**
     * Column name WebOrderEMail
     */
    String COLUMNNAME_WebOrderEMail = "WebOrderEMail";
    /**
     * Column name WebParam1
     */
    String COLUMNNAME_WebParam1 = "WebParam1";
    /**
     * Column name WebParam2
     */
    String COLUMNNAME_WebParam2 = "WebParam2";
    /**
     * Column name WebParam3
     */
    String COLUMNNAME_WebParam3 = "WebParam3";
    /**
     * Column name WebParam4
     */
    String COLUMNNAME_WebParam4 = "WebParam4";
    /**
     * Column name WebParam5
     */
    String COLUMNNAME_WebParam5 = "WebParam5";
    /**
     * Column name WebParam6
     */
    String COLUMNNAME_WebParam6 = "WebParam6";
    /**
     * Column name WStoreEMail
     */
    String COLUMNNAME_WStoreEMail = "WStoreEMail";
    /**
     * Column name W_Store_ID
     */
    String COLUMNNAME_W_Store_ID = "W_Store_ID";
    /**
     * Column name WStoreUser
     */
    String COLUMNNAME_WStoreUser = "WStoreUser";
    /**
     * Column name WStoreUserPW
     */
    String COLUMNNAME_WStoreUserPW = "WStoreUserPW";
    /**
     * Column name W_Store_UU
     */
    String COLUMNNAME_W_Store_UU = "W_Store_UU";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getC_PaymentTerm_ID();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

    I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

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
     * Get EMail Footer. Footer added to EMails
     */
    String getEMailFooter();

    /**
     * Set EMail Footer. Footer added to EMails
     */
    void setEMailFooter(String EMailFooter);

    /**
     * Get EMail Header. Header added to EMails
     */
    String getEMailHeader();

    /**
     * Set EMail Header. Header added to EMails
     */
    void setEMailHeader(String EMailHeader);

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
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Menu Assets. Show Menu Assets
     */
    void setIsMenuAssets(boolean IsMenuAssets);

    /**
     * Get Menu Assets. Show Menu Assets
     */
    boolean isMenuAssets();

    /**
     * Set Menu Contact. Show Menu Contact
     */
    void setIsMenuContact(boolean IsMenuContact);

    /**
     * Get Menu Contact. Show Menu Contact
     */
    boolean isMenuContact();

    /**
     * Set Menu Interests. Show Menu Interests
     */
    void setIsMenuInterests(boolean IsMenuInterests);

    /**
     * Get Menu Interests. Show Menu Interests
     */
    boolean isMenuInterests();

    /**
     * Set Menu Invoices. Show Menu Invoices
     */
    void setIsMenuInvoices(boolean IsMenuInvoices);

    /**
     * Get Menu Invoices. Show Menu Invoices
     */
    boolean isMenuInvoices();

    /**
     * Set Menu Orders. Show Menu Orders
     */
    void setIsMenuOrders(boolean IsMenuOrders);

    /**
     * Get Menu Orders. Show Menu Orders
     */
    boolean isMenuOrders();

    /**
     * Set Menu Payments. Show Menu Payments
     */
    void setIsMenuPayments(boolean IsMenuPayments);

    /**
     * Get Menu Payments. Show Menu Payments
     */
    boolean isMenuPayments();

    /**
     * Set Menu Registrations. Show Menu Registrations
     */
    void setIsMenuRegistrations(boolean IsMenuRegistrations);

    /**
     * Get Menu Registrations. Show Menu Registrations
     */
    boolean isMenuRegistrations();

    /**
     * Set Menu Requests. Show Menu Requests
     */
    void setIsMenuRequests(boolean IsMenuRequests);

    /**
     * Get Menu Requests. Show Menu Requests
     */
    boolean isMenuRequests();

    /**
     * Set Menu RfQs. Show Menu RfQs
     */
    void setIsMenuRfQs(boolean IsMenuRfQs);

    /**
     * Get Menu RfQs. Show Menu RfQs
     */
    boolean isMenuRfQs();

    /**
     * Set Menu Shipments. Show Menu Shipments
     */
    void setIsMenuShipments(boolean IsMenuShipments);

    /**
     * Get Menu Shipments. Show Menu Shipments
     */
    boolean isMenuShipments();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getM_PriceList_ID();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setM_PriceList_ID(int M_PriceList_ID);

    I_M_PriceList getM_PriceList() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Stylesheet. CSS (Stylesheet) used
     */
    String getStylesheet();

    /**
     * Set Stylesheet. CSS (Stylesheet) used
     */
    void setStylesheet(String Stylesheet);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get URL. Full URL address - e.g. http://www.idempiere.org
     */
    String getURL();

    /**
     * Set URL. Full URL address - e.g. http://www.idempiere.org
     */
    void setURL(String URL);

    /**
     * Get Web Context. Web Server Context - e.g. /wstore
     */
    String getWebContext();

    /**
     * Set Web Context. Web Server Context - e.g. /wstore
     */
    void setWebContext(String WebContext);

    /**
     * Get Web Store Info. Web Store Header Information
     */
    String getWebInfo();

    /**
     * Set Web Store Info. Web Store Header Information
     */
    void setWebInfo(String WebInfo);

    /**
     * Get Web Order EMail. EMail address to receive notifications when web orders were processed
     */
    String getWebOrderEMail();

    /**
     * Set Web Order EMail. EMail address to receive notifications when web orders were processed
     */
    void setWebOrderEMail(String WebOrderEMail);

    /**
     * Get Web Parameter 1. Web Site Parameter 1 (default: header image)
     */
    String getWebParam1();

    /**
     * Set Web Parameter 1. Web Site Parameter 1 (default: header image)
     */
    void setWebParam1(String WebParam1);

    /**
     * Get Web Parameter 2. Web Site Parameter 2 (default index page)
     */
    String getWebParam2();

    /**
     * Set Web Parameter 2. Web Site Parameter 2 (default index page)
     */
    void setWebParam2(String WebParam2);

    /**
     * Get Web Parameter 3. Web Site Parameter 3 (default left - menu)
     */
    String getWebParam3();

    /**
     * Set Web Parameter 3. Web Site Parameter 3 (default left - menu)
     */
    void setWebParam3(String WebParam3);

    /**
     * Get Web Parameter 4. Web Site Parameter 4 (default footer left)
     */
    String getWebParam4();

    /**
     * Set Web Parameter 4. Web Site Parameter 4 (default footer left)
     */
    void setWebParam4(String WebParam4);

    /**
     * Get Web Parameter 5. Web Site Parameter 5 (default footer center)
     */
    String getWebParam5();

    /**
     * Set Web Parameter 5. Web Site Parameter 5 (default footer center)
     */
    void setWebParam5(String WebParam5);

    /**
     * Get Web Parameter 6. Web Site Parameter 6 (default footer right)
     */
    String getWebParam6();

    /**
     * Set Web Parameter 6. Web Site Parameter 6 (default footer right)
     */
    void setWebParam6(String WebParam6);

    /**
     * Get Web Store EMail. EMail address used as the sender (From)
     */
    String getWStoreEMail();

    /**
     * Set Web Store EMail. EMail address used as the sender (From)
     */
    void setWStoreEMail(String WStoreEMail);

    /**
     * Get Web Store. A Web Store of the Client
     */
    int getW_Store_ID();

    /**
     * Set Web Store. A Web Store of the Client
     */
    void setW_Store_ID(int W_Store_ID);

    /**
     * Get WebStore User. User ID of the Web Store EMail address
     */
    String getWStoreUser();

    /**
     * Set WebStore User. User ID of the Web Store EMail address
     */
    void setWStoreUser(String WStoreUser);

    /**
     * Get WebStore Password. Password of the Web Store EMail address
     */
    String getWStoreUserPW();

    /**
     * Set WebStore Password. Password of the Web Store EMail address
     */
    void setWStoreUserPW(String WStoreUserPW);

    /**
     * Get W_Store_UU
     */
    String getW_Store_UU();

    /**
     * Set W_Store_UU
     */
    void setW_Store_UU(String W_Store_UU);
}
