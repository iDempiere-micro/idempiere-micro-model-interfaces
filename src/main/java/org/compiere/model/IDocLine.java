package org.compiere.model;

import org.idempiere.icommon.model.IPO;

public interface IDocLine extends IPO {
    void setOrgId(int ad_org_id);

    Object getValue(int index);
}
