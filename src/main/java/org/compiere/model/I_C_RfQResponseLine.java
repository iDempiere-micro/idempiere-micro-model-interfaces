package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQResponseLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQResponseLine {

  /** TableName=C_RfQResponseLine */
  String Table_Name = "C_RfQResponseLine";

  /** AD_Table_ID=673 */
  int Table_ID = 673;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_RfQLine_ID */
  String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
  /** Column name C_RfQResponse_ID */
  String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";
  /** Column name C_RfQResponseLine_ID */
  String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";
  /** Column name C_RfQResponseLine_UU */
  String COLUMNNAME_C_RfQResponseLine_UU = "C_RfQResponseLine_UU";
  /** Column name DateWorkComplete */
  String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
  /** Column name DateWorkStart */
  String COLUMNNAME_DateWorkStart = "DateWorkStart";
  /** Column name DeliveryDays */
  String COLUMNNAME_DeliveryDays = "DeliveryDays";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSelectedWinner */
  String COLUMNNAME_IsSelectedWinner = "IsSelectedWinner";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get RfQ Line. Request for Quotation Line */
  int getC_RfQLine_ID();

  /** Set RfQ Line. Request for Quotation Line */
  void setC_RfQLine_ID(int C_RfQLine_ID);

  I_C_RfQLine getC_RfQLine() throws RuntimeException;

  /** Get RfQ Response. Request for Quotation Response from a potential Vendor */
  int getC_RfQResponse_ID();

  /** Set RfQ Response. Request for Quotation Response from a potential Vendor */
  void setC_RfQResponse_ID(int C_RfQResponse_ID);

  I_C_RfQResponse getC_RfQResponse() throws RuntimeException;

  /** Get RfQ Response Line. Request for Quotation Response Line */
  int getC_RfQResponseLine_ID();

  /** Set RfQ Response Line. Request for Quotation Response Line */
  void setC_RfQResponseLine_ID(int C_RfQResponseLine_ID);

  /** Get C_RfQResponseLine_UU */
  String getC_RfQResponseLine_UU();

  /** Set C_RfQResponseLine_UU */
  void setC_RfQResponseLine_UU(String C_RfQResponseLine_UU);

  /** Get Work Complete. Date when work is (planned to be) complete */
  Timestamp getDateWorkComplete();

  /** Set Work Complete. Date when work is (planned to be) complete */
  void setDateWorkComplete(Timestamp DateWorkComplete);

  /** Get Work Start. Date when work is (planned to be) started */
  Timestamp getDateWorkStart();

  /** Set Work Start. Date when work is (planned to be) started */
  void setDateWorkStart(Timestamp DateWorkStart);

  /** Get Delivery Days. Number of Days (planned) until Delivery */
  int getDeliveryDays();

  /** Set Delivery Days. Number of Days (planned) until Delivery */
  void setDeliveryDays(int DeliveryDays);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Selected Winner. The response is the selected winner */
  void setIsSelectedWinner(boolean IsSelectedWinner);

  /** Get Selected Winner. The response is the selected winner */
  boolean isSelectedWinner();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
