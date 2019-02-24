package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

public interface IProcessInfo {
    String getTitle();

    void setTitle(String string);

    int getAD_PInstance_ID();

    int getRecord_ID();

    void setEstSeconds(int i);

    void setSummary(String translatedSummary, boolean error);

    String getClassName();

    void setClassName(String string);

    void setReportingProcess(boolean b);

    void setTransactionName(String trxName);

    IPO getPO();

    Integer getAD_User_ID();

    void setAD_User_ID(int anInt);

    Integer getClientId();

    int getTable_ID();

    IProcessInfoParameter[] getParameter();

    void setParameter(IProcessInfoParameter[] pars);

    void setADClientID(int anInt);

    int getAD_Process_ID();

    void setAD_Process_ID(int anInt);

    boolean isError();

    void setError(boolean b);

    void addLog(int id, Timestamp date, BigDecimal number, String msg, int tableId, int recordId);

    void addLog(int id, Timestamp date, BigDecimal number, String msg);

    void addLog(IProcessInfoLog logEntry);

    String getSummary();

    void setSummary(String processNoProcedure);

    IProcessInfoLog[] getLogs();

    void setLogList(ArrayList<IProcessInfoLog> logs);

}
