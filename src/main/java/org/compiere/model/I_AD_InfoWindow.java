package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_InfoWindow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_InfoWindow {

    /**
     * TableName=AD_InfoWindow
     */
    String Table_Name = "AD_InfoWindow";

    /**
     * AD_Table_ID=895
     */
    int Table_ID = 895;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_InfoWindow_ID
     */
    String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
    /**
     * Column name AD_InfoWindow_UU
     */
    String COLUMNNAME_AD_InfoWindow_UU = "AD_InfoWindow_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FromClause
     */
    String COLUMNNAME_FromClause = "FromClause";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsDistinct
     */
    String COLUMNNAME_IsDistinct = "IsDistinct";
    /**
     * Column name isLoadPageNum
     */
    String COLUMNNAME_isLoadPageNum = "isLoadPageNum";
    /**
     * Column name IsShowInDashboard
     */
    String COLUMNNAME_IsShowInDashboard = "IsShowInDashboard";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name MaxQueryRecords
     */
    String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";
    /**
     * Column name OrderByClause
     */
    String COLUMNNAME_OrderByClause = "OrderByClause";
    /**
     * Column name OtherClause
     */
    String COLUMNNAME_OtherClause = "OtherClause";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Context Help
     */
    int getAD_CtxHelp_ID();

    /**
     * Set Context Help
     */
    void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

    I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

    /**
     * Get Info Window. Info and search/select Window
     */
    int getAD_InfoWindow_ID();

    /**
     * Set Info Window. Info and search/select Window
     */
    void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

    /**
     * Get AD_InfoWindow_UU
     */
    String getAD_InfoWindow_UU();

    /**
     * Set AD_InfoWindow_UU
     */
    void setAD_InfoWindow_UU(String AD_InfoWindow_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Sql FROM. SQL FROM clause
     */
    String getFromClause();

    /**
     * Set Sql FROM. SQL FROM clause
     */
    void setFromClause(String FromClause);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Distinct. Select Distinct
     */
    void setIsDistinct(boolean IsDistinct);

    /**
     * Get Distinct. Select Distinct
     */
    boolean isDistinct();

    /**
     * Set Load Page Num. When load data for info window, also load number of paging
     */
    void setisLoadPageNum(boolean isLoadPageNum);

    /**
     * Get Load Page Num. When load data for info window, also load number of paging
     */
    boolean isLoadPageNum();

    /**
     * Set Show in Dashboard. Show the dashlet in the dashboard
     */
    void setIsShowInDashboard(boolean IsShowInDashboard);

    /**
     * Get Show in Dashboard. Show the dashlet in the dashboard
     */
    boolean isShowInDashboard();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Max Query Records. If defined, you cannot query more records as defined - the query
     * criteria needs to be changed to query less records
     */
    int getMaxQueryRecords();

    /**
     * Set Max Query Records. If defined, you cannot query more records as defined - the query
     * criteria needs to be changed to query less records
     */
    void setMaxQueryRecords(int MaxQueryRecords);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sql ORDER BY. Fully qualified ORDER BY clause
     */
    String getOrderByClause();

    /**
     * Set Sql ORDER BY. Fully qualified ORDER BY clause
     */
    void setOrderByClause(String OrderByClause);

    /**
     * Get Other SQL Clause. Other SQL Clause
     */
    String getOtherClause();

    /**
     * Set Other SQL Clause. Other SQL Clause
     */
    void setOtherClause(String OtherClause);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

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
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

    /**
     * Set Sql WHERE. Fully qualified SQL WHERE clause
     */
    void setWhereClause(String WhereClause);
}
