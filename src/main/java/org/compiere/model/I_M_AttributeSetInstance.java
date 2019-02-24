package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_AttributeSetInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSetInstance {

    /**
     * TableName=M_AttributeSetInstance
     */
    String Table_Name = "M_AttributeSetInstance";

    /**
     * AD_Table_ID=559
     */
    int Table_ID = 559;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GuaranteeDate
     */
    String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name M_AttributeSet_ID
     */
    String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Lot_ID
     */
    String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
    /**
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Guarantee Date. Date when guarantee expires
     */
    Timestamp getGuaranteeDate();

    /**
     * Set Guarantee Date. Date when guarantee expires
     */
    void setGuaranteeDate(Timestamp GuaranteeDate);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

    /**
     * Set Attribute Set. Product Attribute Set
     */
    void setM_AttributeSet_ID(int M_AttributeSet_ID);

    /**
     * Get Attribute Set. Product Attribute Set
     */
    int getMAttributeSet_ID();

    I_M_AttributeSet getMAttributeSet() throws RuntimeException;

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    /**
     * Set Lot. Product Lot Definition
     */
    void setM_Lot_ID(int M_Lot_ID);

    /**
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

    /**
     * Set Serial No. Product Serial Number
     */
    void setSerNo(String SerNo);

}
