package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_ProductionLineMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductionLineMA extends IPO {

    /**
     * TableName=M_ProductionLineMA
     */
    String Table_Name = "M_ProductionLineMA";

    /**
     * AD_Table_ID=765
     */
    int Table_ID = 765;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name DateMaterialPolicy
     */
    String COLUMNNAME_DateMaterialPolicy = "DateMaterialPolicy";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_ProductionLine_ID
     */
    String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";

    /**
     * Get Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    Timestamp getDateMaterialPolicy();

    /**
     * Set Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    void setDateMaterialPolicy(Timestamp DateMaterialPolicy);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Set Production Line. Document Line representing a production
     */
    void setProductionLineId(int M_ProductionLine_ID);

}
