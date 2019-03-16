package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface IProcessInfoParameter {
    String getParameterName();

    Object getParameterTo();

    Object getParameter();

    boolean getParameterAsBoolean();

    int getParameterAsInt();

    BigDecimal getParameterAsBigDecimal();

    Timestamp getParameterAsTimestamp();

    String getParameterAsString();

}
