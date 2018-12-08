package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_Topic
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_Topic {

  /** TableName=B_Topic */
  String Table_Name = "B_Topic";

  /** AD_Table_ID=679 */
  int Table_ID = 679;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name B_TopicCategory_ID */
  String COLUMNNAME_B_TopicCategory_ID = "B_TopicCategory_ID";
  /** Column name B_Topic_ID */
  String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
  /** Column name B_TopicType_ID */
  String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
  /** Column name B_Topic_UU */
  String COLUMNNAME_B_Topic_UU = "B_Topic_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DecisionDate */
  String COLUMNNAME_DecisionDate = "DecisionDate";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPublished */
  String COLUMNNAME_IsPublished = "IsPublished";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name TextDetails */
  String COLUMNNAME_TextDetails = "TextDetails";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name TopicAction */
  String COLUMNNAME_TopicAction = "TopicAction";
  /** Column name TopicStatus */
  String COLUMNNAME_TopicStatus = "TopicStatus";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Topic Category. Auction Topic Category */
  int getB_TopicCategory_ID();

  /** Set Topic Category. Auction Topic Category */
  void setB_TopicCategory_ID(int B_TopicCategory_ID);

  I_B_TopicCategory getB_TopicCategory() throws RuntimeException;

  /** Get Topic. Auction Topic */
  int getB_Topic_ID();

  /** Set Topic. Auction Topic */
  void setB_Topic_ID(int B_Topic_ID);

  /** Get Topic Type. Auction Topic Type */
  int getB_TopicType_ID();

  /** Set Topic Type. Auction Topic Type */
  void setB_TopicType_ID(int B_TopicType_ID);

  I_B_TopicType getB_TopicType() throws RuntimeException;

  /** Get B_Topic_UU */
  String getB_Topic_UU();

  /** Set B_Topic_UU */
  void setB_Topic_UU(String B_Topic_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Decision date */
  Timestamp getDecisionDate();

  /** Set Decision date */
  void setDecisionDate(Timestamp DecisionDate);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Published. The Topic is published and can be viewed */
  void setIsPublished(boolean IsPublished);

  /** Get Published. The Topic is published and can be viewed */
  boolean isPublished();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Details */
  String getTextDetails();

  /** Set Details */
  void setTextDetails(String TextDetails);

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Topic Action */
  String getTopicAction();

  /** Set Topic Action */
  void setTopicAction(String TopicAction);

  /** Get Topic Status */
  String getTopicStatus();

  /** Set Topic Status */
  void setTopicStatus(String TopicStatus);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
