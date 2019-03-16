package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_BOMProduct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_BOMProduct {

    /**
     * TableName=M_BOMProduct
     */
    String Table_Name = "M_BOMProduct";

    /**
     * AD_Table_ID=801
     */
    int Table_ID = 801;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name BOMProductType
     */
    String COLUMNNAME_BOMProductType = "BOMProductType";
    /**
     * Column name BOMQty
     */
    String COLUMNNAME_BOMQty = "BOMQty";
    /**
     * Column name IsPhantom
     */
    String COLUMNNAME_IsPhantom = "IsPhantom";
    /**
     * Column name LeadTimeOffset
     */
    String COLUMNNAME_LeadTimeOffset = "LeadTimeOffset";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_BOMAlternative_ID
     */
    String COLUMNNAME_M_BOMAlternative_ID = "M_BOMAlternative_ID";
    /**
     * Column name M_BOM_ID
     */
    String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
    /**
     * Column name M_BOMProduct_ID
     */
    String COLUMNNAME_M_BOMProduct_ID = "M_BOMProduct_ID";
    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name M_ProductBOM_ID
     */
    String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
    /**
     * Column name M_ProductOperation_ID
     */
    String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Component Type. BOM Product Type
     */
    String getBOMProductType();

    /**
     * Set Component Type. BOM Product Type
     */
    void setBOMProductType(String BOMProductType);

    /**
     * Set BOM Quantity. Bill of Materials Quantity
     */
    void setBOMQty(BigDecimal BOMQty);

    /**
     * Set Phantom. Phantom Component
     */
    void setIsPhantom(boolean IsPhantom);

    /**
     * Get Lead Time Offset. Optional Lead Time offset before starting production
     */
    int getLeadTimeOffset();

    /**
     * Set Lead Time Offset. Optional Lead Time offset before starting production
     */
    void setLeadTimeOffset(int LeadTimeOffset);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Alternative Group. Product BOM Alternative Group
     */
    int getBOMAlternativeGroupId();

    /**
     * Get BOM. Bill of Material
     */
    int getBOMId();

    /**
     * Get BOM Component. Bill of Material Component (Product)
     */
    int getBOMProductId();

    /**
     * Get BOM Product. Bill of Material Component Product
     */
    int getProductBOMId();

    /**
     * Set BOM Product. Bill of Material Component Product
     */
    void setProductBOMId(int M_ProductBOM_ID);

    /**
     * Get Product Operation. Product Manufacturing Operation
     */
    int getProductOperationId();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
