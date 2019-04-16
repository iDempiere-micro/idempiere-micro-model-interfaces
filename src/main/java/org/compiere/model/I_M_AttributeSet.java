package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_AttributeSet
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSet {

    /**
     * TableName=M_AttributeSet
     */
    String Table_Name = "M_AttributeSet";

    /**
     * AD_Table_ID=560
     */
    int Table_ID = 560;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name GuaranteeDays
     */
    String COLUMNNAME_GuaranteeDays = "GuaranteeDays";
    /**
     * Column name IsAutoGenerateLot
     */
    String COLUMNNAME_IsAutoGenerateLot = "IsAutoGenerateLot";
    /**
     * Column name IsGuaranteeDate
     */
    String COLUMNNAME_IsGuaranteeDate = "IsGuaranteeDate";
    /**
     * Column name IsGuaranteeDateMandatory
     */
    String COLUMNNAME_IsGuaranteeDateMandatory = "IsGuaranteeDateMandatory";
    /**
     * Column name IsInstanceAttribute
     */
    String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
    /**
     * Column name IsLot
     */
    String COLUMNNAME_IsLot = "IsLot";
    /**
     * Column name IsLotMandatory
     */
    String COLUMNNAME_IsLotMandatory = "IsLotMandatory";
    /**
     * Column name IsSerNo
     */
    String COLUMNNAME_IsSerNo = "IsSerNo";
    /**
     * Column name IsSerNoMandatory
     */
    String COLUMNNAME_IsSerNoMandatory = "IsSerNoMandatory";
    /**
     * Column name LotCharEOverwrite
     */
    String COLUMNNAME_LotCharEOverwrite = "LotCharEOverwrite";
    /**
     * Column name LotCharSOverwrite
     */
    String COLUMNNAME_LotCharSOverwrite = "LotCharSOverwrite";
    /**
     * Column name MandatoryType
     */
    String COLUMNNAME_MandatoryType = "MandatoryType";
    /**
     * Column name M_AttributeSet_ID
     */
    String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
    /**
     * Column name M_LotCtl_ID
     */
    String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
    /**
     * Column name M_SerNoCtl_ID
     */
    String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
    /**
     * Column name SerNoCharEOverwrite
     */
    String COLUMNNAME_SerNoCharEOverwrite = "SerNoCharEOverwrite";
    /**
     * Column name SerNoCharSOverwrite
     */
    String COLUMNNAME_SerNoCharSOverwrite = "SerNoCharSOverwrite";
    /**
     * Column name UseGuaranteeDateForMPolicy
     */
    String COLUMNNAME_UseGuaranteeDateForMPolicy = "UseGuaranteeDateForMPolicy";

    /**
     * Get Guarantee Days. Number of days the product is guaranteed or available
     */
    int getGuaranteeDays();

    /**
     * Get IsAutoGenerateLot
     */
    boolean isAutoGenerateLot();

    /**
     * Set Guarantee Date. Product has Guarantee or Expiry Date
     */
    void setIsGuaranteeDate(boolean IsGuaranteeDate);

    /**
     * Get Guarantee Date. Product has Guarantee or Expiry Date
     */
    boolean isGuaranteeDate();

    /**
     * Set Mandatory Guarantee Date. The entry of a Guarantee Date is mandatory when creating a
     * Product Instance
     */
    void setIsGuaranteeDateMandatory(boolean IsGuaranteeDateMandatory);

    /**
     * Get Mandatory Guarantee Date. The entry of a Guarantee Date is mandatory when creating a
     * Product Instance
     */
    boolean isGuaranteeDateMandatory();

    /**
     * Set Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
     * or Guarantee Date)
     */
    void setIsInstanceAttribute(boolean IsInstanceAttribute);

    /**
     * Get Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
     * or Guarantee Date)
     */
    boolean isInstanceAttribute();

    /**
     * Set Lot. The product instances have a Lot Number
     */
    void setIsLot(boolean IsLot);

    /**
     * Get Lot. The product instances have a Lot Number
     */
    boolean isLot();

    /**
     * Set Mandatory Lot. The entry of Lot info is mandatory when creating a Product Instance
     */
    void setIsLotMandatory(boolean IsLotMandatory);

    /**
     * Get Mandatory Lot. The entry of Lot info is mandatory when creating a Product Instance
     */
    boolean isLotMandatory();

    /**
     * Set Serial No. The product instances have Serial Numbers
     */
    void setIsSerNo(boolean IsSerNo);

    /**
     * Get Serial No. The product instances have Serial Numbers
     */
    boolean isSerNo();

    /**
     * Set Mandatory Serial No. The entry of a Serial No is mandatory when creating a Product Instance
     */
    void setIsSerNoMandatory(boolean IsSerNoMandatory);

    /**
     * Get Mandatory Serial No. The entry of a Serial No is mandatory when creating a Product Instance
     */
    boolean isSerNoMandatory();

    /**
     * Get Lot Char End Overwrite. Lot/Batch End Indicator overwrite - default »
     */
    String getLotCharEOverwrite();

    /**
     * Get Lot Char Start Overwrite. Lot/Batch Start Indicator overwrite - default «
     */
    String getLotCharSOverwrite();

    /**
     * Get Mandatory Type. The specification of a Product Attribute Instance is mandatory
     */
    String getMandatoryType();

    /**
     * Set Mandatory Type. The specification of a Product Attribute Instance is mandatory
     */
    void setMandatoryType(String MandatoryType);

    /**
     * Get Attribute Set. Product Attribute Set
     */
    int getAttributeSetId();

    /**
     * Get Lot Control. Product Lot Control
     */
    int getLotControlId();

    /**
     * Get Serial No Control. Product Serial Number Control
     */
    int getSerialNoControlId();

    /**
     * Get SerNo Char End Overwrite. Serial Number End Indicator overwrite - default empty
     */
    String getSerNoCharEOverwrite();

    /**
     * Get SerNo Char Start Overwrite. Serial Number Start Indicator overwrite - default #
     */
    String getSerNoCharSOverwrite();

    /**
     * Get Use Guarantee Date for Material Policy
     */
    boolean isUseGuaranteeDateForMPolicy();

    boolean excludeTableEntry(int table_id, boolean soTrx);
}
