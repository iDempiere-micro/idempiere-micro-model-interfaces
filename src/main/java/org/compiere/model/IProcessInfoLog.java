package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface IProcessInfoLog {
    Timestamp getPDate();

    BigDecimal getPNumber();

    String getPMsg();

    int getPId();

    int getLogId();

    int getPTableId();

    int getRecordId();
}
