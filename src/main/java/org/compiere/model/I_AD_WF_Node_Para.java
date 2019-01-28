package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_Node_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Node_Para {

  /** TableName=AD_WF_Node_Para */
  String Table_Name = "AD_WF_Node_Para";

  /** AD_Table_ID=643 */
  int Table_ID = 643;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_Process_Para_ID */
  String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_Node_Para_ID */
  String COLUMNNAME_AD_WF_Node_Para_ID = "AD_WF_Node_Para_ID";
  /** Column name AD_WF_Node_Para_UU */
  String COLUMNNAME_AD_WF_Node_Para_UU = "AD_WF_Node_Para_UU";
  /** Column name AttributeName */
  String COLUMNNAME_AttributeName = "AttributeName";
  /** Column name AttributeValue */
  String COLUMNNAME_AttributeValue = "AttributeValue";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

    /** Get Process Parameter */
  int getAD_Process_Para_ID();

  /** Set Process Parameter */
  void setAD_Process_Para_ID(int AD_Process_Para_ID);

    /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

    /** Get Attribute Name. Name of the Attribute */
  String getAttributeName();

  /** Set Attribute Name. Name of the Attribute */
  void setAttributeName(String AttributeName);

  /** Get Attribute Value. Value of the Attribute */
  String getAttributeValue();

}
