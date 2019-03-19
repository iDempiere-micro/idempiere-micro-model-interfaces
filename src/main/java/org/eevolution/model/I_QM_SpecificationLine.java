package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for QM_SpecificationLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_QM_SpecificationLine {

    /**
     * TableName=QM_SpecificationLine
     */
    String Table_Name = "QM_SpecificationLine";

    /**
     * AD_Table_ID=53041
     */
    int Table_ID = 53041;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AndOr
     */
    String COLUMNNAME_AndOr = "AndOr";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Attribute_ID
     */
    String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
    /**
     * Column name Operation
     */
    String COLUMNNAME_Operation = "Operation";
    /**
     * Column name QM_Specification_ID
     */
    String COLUMNNAME_QM_Specification_ID = "QM_Specification_ID";
    /**
     * Column name QM_SpecificationLine_ID
     */
    String COLUMNNAME_QM_SpecificationLine_ID = "QM_SpecificationLine_ID";
    /**
     * Column name QM_SpecificationLine_UU
     */
    String COLUMNNAME_QM_SpecificationLine_UU = "QM_SpecificationLine_UU";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get And/Or. Logical operation: AND or OR
     */
    String getAndOr();

    /**
     * Set And/Or. Logical operation: AND or OR
     */
    void setAndOr(String AndOr);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Attribute. Product Attribute
     */
    void setMAttributeID(int M_Attribute_ID);

    /**
     * Get Attribute. Product Attribute
     */
    int getProductAttributeId();

    org.compiere.model.I_M_Attribute getMAttribute() throws RuntimeException;

    /**
     * Get Operation. Compare Operation
     */
    String getOperation();

    /**
     * Set Operation. Compare Operation
     */
    void setOperation(String Operation);

    /**
     * Get Quality Specification
     */
    int getQualitySpecificationId();

    /**
     * Set Quality Specification
     */
    void setQualitySpecificationId(int QM_Specification_ID);

    org.eevolution.model.I_QM_Specification getQualitySpecification() throws RuntimeException;

    /**
     * Get QM Specification Line
     */
    int getQualitySpecificationLineId();

    /**
     * Set QM Specification Line
     */
    void setQualitySpecificationLineId(int QM_SpecificationLine_ID);

    /**
     * Get QM_SpecificationLine_UU
     */
    String getQualitySpecificationLine_UU();

    /**
     * Set QM_SpecificationLine_UU
     */
    void setQualitySpecificationLine_UU(String QM_SpecificationLine_UU);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    String getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(String ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
