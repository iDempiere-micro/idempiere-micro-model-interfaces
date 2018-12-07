package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Chart
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Chart {

    /**
     * TableName=AD_Chart
     */
    String Table_Name = "AD_Chart";

    /**
     * AD_Table_ID=53284
     */
    int Table_ID = 53284;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Chart_ID
     */
    String COLUMNNAME_AD_Chart_ID = "AD_Chart_ID";
    /**
     * Column name AD_Chart_UU
     */
    String COLUMNNAME_AD_Chart_UU = "AD_Chart_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name ChartOrientation
     */
    String COLUMNNAME_ChartOrientation = "ChartOrientation";
    /**
     * Column name ChartType
     */
    String COLUMNNAME_ChartType = "ChartType";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DomainLabel
     */
    String COLUMNNAME_DomainLabel = "DomainLabel";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDisplayLegend
     */
    String COLUMNNAME_IsDisplayLegend = "IsDisplayLegend";
    /**
     * Column name IsTimeSeries
     */
    String COLUMNNAME_IsTimeSeries = "IsTimeSeries";
    /**
     * Column name RangeLabel
     */
    String COLUMNNAME_RangeLabel = "RangeLabel";
    /**
     * Column name TimeScope
     */
    String COLUMNNAME_TimeScope = "TimeScope";
    /**
     * Column name TimeUnit
     */
    String COLUMNNAME_TimeUnit = "TimeUnit";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WinHeight
     */
    String COLUMNNAME_WinHeight = "WinHeight";

    /**
     * Get Chart
     */
    int getAD_Chart_ID();

    /**
     * Set Chart
     */
    void setAD_Chart_ID(int AD_Chart_ID);

    /**
     * Get AD_Chart_UU
     */
    String getAD_Chart_UU();

    /**
     * Set AD_Chart_UU
     */
    void setAD_Chart_UU(String AD_Chart_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Orientation. The orientation of the chart.
     */
    String getChartOrientation();

    /**
     * Set Orientation. The orientation of the chart.
     */
    void setChartOrientation(String ChartOrientation);

    /**
     * Get Chart Type. Type of chart to render
     */
    String getChartType();

    /**
     * Set Chart Type. Type of chart to render
     */
    void setChartType(String ChartType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Domain Label. Label for the domain axis.
     */
    String getDomainLabel();

    /**
     * Set Domain Label. Label for the domain axis.
     */
    void setDomainLabel(String DomainLabel);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Display Legend. Display chart legend
     */
    void setIsDisplayLegend(boolean IsDisplayLegend);

    /**
     * Get Display Legend. Display chart legend
     */
    boolean isDisplayLegend();

    /**
     * Set Time Series. The domain data for the chart is organised by time.
     */
    void setIsTimeSeries(boolean IsTimeSeries);

    /**
     * Get Time Series. The domain data for the chart is organised by time.
     */
    boolean isTimeSeries();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Range Label. Label for the range axis.
     */
    String getRangeLabel();

    /**
     * Set Range Label. Label for the range axis.
     */
    void setRangeLabel(String RangeLabel);

    /**
     * Get Time Scope. The number of time units to include the chart result.
     */
    int getTimeScope();

    /**
     * Set Time Scope. The number of time units to include the chart result.
     */
    void setTimeScope(int TimeScope);

    /**
     * Get Time Unit. The unit of time for grouping chart data.
     */
    String getTimeUnit();

    /**
     * Set Time Unit. The unit of time for grouping chart data.
     */
    void setTimeUnit(String TimeUnit);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Window Height
     */
    int getWinHeight();

    /**
     * Set Window Height
     */
    void setWinHeight(int WinHeight);
}
