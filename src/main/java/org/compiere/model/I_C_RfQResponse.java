package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQResponse
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQResponse {

    /**
     * TableName=C_RfQResponse
     */
    String Table_Name = "C_RfQResponse";

    /**
     * AD_Table_ID=674
     */
    int Table_ID = 674;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CheckComplete
     */
    String COLUMNNAME_CheckComplete = "CheckComplete";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_RfQ_ID
     */
    String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
    /**
     * Column name C_RfQResponse_ID
     */
    String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";
    /**
     * Column name C_RfQResponse_UU
     */
    String COLUMNNAME_C_RfQResponse_UU = "C_RfQResponse_UU";
    /**
     * Column name DateInvited
     */
    String COLUMNNAME_DateInvited = "DateInvited";
    /**
     * Column name DateResponse
     */
    String COLUMNNAME_DateResponse = "DateResponse";
    /**
     * Column name DateWorkComplete
     */
    String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
    /**
     * Column name DateWorkStart
     */
    String COLUMNNAME_DateWorkStart = "DateWorkStart";
    /**
     * Column name DeliveryDays
     */
    String COLUMNNAME_DeliveryDays = "DeliveryDays";
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
     * Column name IsComplete
     */
    String COLUMNNAME_IsComplete = "IsComplete";
    /**
     * Column name IsSelectedWinner
     */
    String COLUMNNAME_IsSelectedWinner = "IsSelectedWinner";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name Price
     */
    String COLUMNNAME_Price = "Price";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ranking
     */
    String COLUMNNAME_Ranking = "Ranking";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

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
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

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
     * Get Check Complete
     */
    String getCheckComplete();

    /**
     * Set Check Complete
     */
    void setCheckComplete(String CheckComplete);

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get RfQ. Request for Quotation
     */
    int getC_RfQ_ID();

    /**
     * Set RfQ. Request for Quotation
     */
    void setC_RfQ_ID(int C_RfQ_ID);

    I_C_RfQ getC_RfQ() throws RuntimeException;

    /**
     * Get RfQ Response. Request for Quotation Response from a potential Vendor
     */
    int getC_RfQResponse_ID();

    /**
     * Set RfQ Response. Request for Quotation Response from a potential Vendor
     */
    void setC_RfQResponse_ID(int C_RfQResponse_ID);

    /**
     * Get C_RfQResponse_UU
     */
    String getC_RfQResponse_UU();

    /**
     * Set C_RfQResponse_UU
     */
    void setC_RfQResponse_UU(String C_RfQResponse_UU);

    /**
     * Get Invited. Date when (last) invitation was sent
     */
    Timestamp getDateInvited();

    /**
     * Set Invited. Date when (last) invitation was sent
     */
    void setDateInvited(Timestamp DateInvited);

    /**
     * Get Response Date. Date of the Response
     */
    Timestamp getDateResponse();

    /**
     * Set Response Date. Date of the Response
     */
    void setDateResponse(Timestamp DateResponse);

    /**
     * Get Work Complete. Date when work is (planned to be) complete
     */
    Timestamp getDateWorkComplete();

    /**
     * Set Work Complete. Date when work is (planned to be) complete
     */
    void setDateWorkComplete(Timestamp DateWorkComplete);

    /**
     * Get Work Start. Date when work is (planned to be) started
     */
    Timestamp getDateWorkStart();

    /**
     * Set Work Start. Date when work is (planned to be) started
     */
    void setDateWorkStart(Timestamp DateWorkStart);

    /**
     * Get Delivery Days. Number of Days (planned) until Delivery
     */
    int getDeliveryDays();

    /**
     * Set Delivery Days. Number of Days (planned) until Delivery
     */
    void setDeliveryDays(int DeliveryDays);

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
     * Set Complete. It is complete
     */
    void setIsComplete(boolean IsComplete);

    /**
     * Get Complete. It is complete
     */
    boolean isComplete();

    /**
     * Set Selected Winner. The response is the selected winner
     */
    void setIsSelectedWinner(boolean IsSelectedWinner);

    /**
     * Get Selected Winner. The response is the selected winner
     */
    boolean isSelectedWinner();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Price. Price
     */
    BigDecimal getPrice();

    /**
     * Set Price. Price
     */
    void setPrice(BigDecimal Price);

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
     * Get Ranking. Relative Rank Number
     */
    int getRanking();

    /**
     * Set Ranking. Relative Rank Number
     */
    void setRanking(int Ranking);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
