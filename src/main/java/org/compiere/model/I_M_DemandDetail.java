package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DemandDetail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DemandDetail {

    /**
     * TableName=M_DemandDetail
     */
    String Table_Name = "M_DemandDetail";

    /**
     * AD_Table_ID=721
     */
    int Table_ID = 721;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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
     * Column name M_DemandDetail_ID
     */
    String COLUMNNAME_M_DemandDetail_ID = "M_DemandDetail_ID";
    /**
     * Column name M_DemandDetail_UU
     */
    String COLUMNNAME_M_DemandDetail_UU = "M_DemandDetail_UU";
    /**
     * Column name M_DemandLine_ID
     */
    String COLUMNNAME_M_DemandLine_ID = "M_DemandLine_ID";
    /**
     * Column name M_ForecastLine_ID
     */
    String COLUMNNAME_M_ForecastLine_ID = "M_ForecastLine_ID";
    /**
     * Column name M_RequisitionLine_ID
     */
    String COLUMNNAME_M_RequisitionLine_ID = "M_RequisitionLine_ID";
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
     * Get Sales Order Line. Sales Order Line
     */
    int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setC_OrderLine_ID(int C_OrderLine_ID);

    I_C_OrderLine getC_OrderLine() throws RuntimeException;

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
     * Get Demand Detail. Material Demand Line Source Detail
     */
    int getM_DemandDetail_ID();

    /**
     * Set Demand Detail. Material Demand Line Source Detail
     */
    void setM_DemandDetail_ID(int M_DemandDetail_ID);

    /**
     * Get M_DemandDetail_UU
     */
    String getM_DemandDetail_UU();

    /**
     * Set M_DemandDetail_UU
     */
    void setM_DemandDetail_UU(String M_DemandDetail_UU);

    /**
     * Get Demand Line. Material Demand Line
     */
    int getM_DemandLine_ID();

    /**
     * Set Demand Line. Material Demand Line
     */
    void setM_DemandLine_ID(int M_DemandLine_ID);

    I_M_DemandLine getM_DemandLine() throws RuntimeException;

    /**
     * Get Forecast Line. Forecast Line
     */
    int getM_ForecastLine_ID();

    /**
     * Set Forecast Line. Forecast Line
     */
    void setM_ForecastLine_ID(int M_ForecastLine_ID);

    I_M_ForecastLine getM_ForecastLine() throws RuntimeException;

    /**
     * Get Requisition Line. Material Requisition Line
     */
    int getM_RequisitionLine_ID();

    /**
     * Set Requisition Line. Material Requisition Line
     */
    void setM_RequisitionLine_ID(int M_RequisitionLine_ID);

    I_M_RequisitionLine getM_RequisitionLine() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
