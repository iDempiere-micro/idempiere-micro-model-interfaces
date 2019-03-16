package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_Node_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Node_Para {

    /**
     * TableName=AD_WF_Node_Para
     */
    String Table_Name = "AD_WF_Node_Para";

    /**
     * AD_Table_ID=643
     */
    int Table_ID = 643;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Process_Para_ID
     */
    String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AttributeName
     */
    String COLUMNNAME_AttributeName = "AttributeName";
    /**
     * Column name AttributeValue
     */
    String COLUMNNAME_AttributeValue = "AttributeValue";

    /**
     * Get Process Parameter
     */
    int getProcessParameterId();

    /**
     * Set Process Parameter
     */
    void setProcessParameterId(int AD_Process_Para_ID);

    /**
     * Get Attribute Name. Name of the Attribute
     */
    String getAttributeName();

    /**
     * Set Attribute Name. Name of the Attribute
     */
    void setAttributeName(String AttributeName);

    /**
     * Get Attribute Value. Value of the Attribute
     */
    String getAttributeValue();

}
