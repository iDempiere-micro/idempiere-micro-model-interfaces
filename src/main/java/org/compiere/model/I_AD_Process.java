package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Process
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Process {

  /** TableName=AD_Process */
  String Table_Name = "AD_Process";

  /** AD_Table_ID=284 */
  int Table_ID = 284;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";
  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_Form_ID */
  String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /** Column name AD_PrintFormat_ID */
  String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
  /** Column name AD_Process_ID */
  String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
  /** Column name AD_Process_UU */
  String COLUMNNAME_AD_Process_UU = "AD_Process_UU";
  /** Column name AD_ReportView_ID */
  String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
  /** Column name AD_Workflow_ID */
  String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
  /** Column name Classname */
  String COLUMNNAME_Classname = "Classname";
  /** Column name CopyFromProcess */
  String COLUMNNAME_CopyFromProcess = "CopyFromProcess";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsBetaFunctionality */
  String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
  /** Column name IsDirectPrint */
  String COLUMNNAME_IsDirectPrint = "IsDirectPrint";
  /** Column name IsReport */
  String COLUMNNAME_IsReport = "IsReport";
  /** Column name IsServerProcess */
  String COLUMNNAME_IsServerProcess = "IsServerProcess";
  /** Column name JasperReport */
  String COLUMNNAME_JasperReport = "JasperReport";
  /** Column name ProcedureName */
  String COLUMNNAME_ProcedureName = "ProcedureName";
  /** Column name ShowHelp */
  String COLUMNNAME_ShowHelp = "ShowHelp";
  /** Column name Statistic_Count */
  String COLUMNNAME_Statistic_Count = "Statistic_Count";
  /** Column name Statistic_Seconds */
  String COLUMNNAME_Statistic_Seconds = "Statistic_Seconds";
    /** Column name WorkflowValue */
  String COLUMNNAME_WorkflowValue = "WorkflowValue";

  /** Get Data Access Level. Access Level required */
  String getProcessAccessLevel();

  /** Set Data Access Level. Access Level required */
  void setProcessAccessLevel(String AccessLevel);

  /** Get Context Help */
  int getAD_CtxHelp_ID();

    /** Get Special Form. Special Form */
  int getAD_Form_ID();

  /** Set Special Form. Special Form */
  void setAD_Form_ID(int AD_Form_ID);

    /** Get Print Format. Data Print Format */
  int getAD_PrintFormat_ID();

  /** Set Print Format. Data Print Format */
  void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    /** Get Process. Process or Report */
  int getAD_Process_ID();

    /** Get Report View. View used to generate this report */
  int getAD_ReportView_ID();

  /** Set Report View. View used to generate this report */
  void setAD_ReportView_ID(int AD_ReportView_ID);

    /** Get Workflow. Workflow or combination of tasks */
  int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  void setAD_Workflow_ID(int AD_Workflow_ID);

    /** Get Classname. Java Classname */
  String getClassname();

  /** Set Classname. Java Classname */
  void setClassname(String Classname);

    /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

    /** Set Beta Functionality. This functionality is considered Beta */
  void setIsBetaFunctionality(boolean IsBetaFunctionality);

  /** Get Beta Functionality. This functionality is considered Beta */
  boolean isBetaFunctionality();

  /** Set Direct print. Print without dialog */
  void setIsDirectPrint(boolean IsDirectPrint);

  /** Get Direct print. Print without dialog */
  boolean isDirectPrint();

  /** Set Report. Indicates a Report record */
  void setIsReport(boolean IsReport);

  /** Get Report. Indicates a Report record */
  boolean isReport();

  /** Set Server Process. Run this Process on Server only */
  void setIsServerProcess(boolean IsServerProcess);

  /** Get Server Process. Run this Process on Server only */
  boolean isServerProcess();

  /** Get Jasper Report */
  String getJasperReport();

  /** Set Jasper Report */
  void setJasperReport(String JasperReport);

    /** Get Procedure. Name of the Database Procedure */
  String getProcedureName();

  /** Set Procedure. Name of the Database Procedure */
  void setProcedureName(String ProcedureName);

  /** Get Show Help */
  String getShowHelp();

  /** Set Show Help */
  void setShowHelp(String ShowHelp);

  /** Get Statistic Count. Internal statistics how often the entity was used */
  int getStatistic_Count();

  /** Set Statistic Count. Internal statistics how often the entity was used */
  void setStatistic_Count(int Statistic_Count);

  /** Get Statistic Seconds. Internal statistics how many seconds a process took */
  int getStatistic_Seconds();

  /** Set Statistic Seconds. Internal statistics how many seconds a process took */
  void setStatistic_Seconds(int Statistic_Seconds);

}
