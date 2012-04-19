package com.vpower.webapp.action;

import com.opensymphony.xwork2.Preparable;
import com.vpower.service.GenericManager;
import com.vpower.model.VpCustomerNew;
import com.vpower.webapp.action.BaseAction;

import java.util.List;

public class VpCustomerNewAction extends BaseAction implements Preparable {
    private GenericManager<VpCustomerNew, Long> vpCustomerNewManager;
    private List vpCustomerNews;
    private VpCustomerNew vpCustomerNew;
    private Long seq;
    private String query;

    public void setVpCustomerNewManager(GenericManager<VpCustomerNew, Long> vpCustomerNewManager) {
        this.vpCustomerNewManager = vpCustomerNewManager;
    }

    public List getVpCustomerNews() {
        return vpCustomerNews;
    }

    /**
     * Grab the entity from the database before populating with request parameters
     */
    public void prepare() {
        if (getRequest().getMethod().equalsIgnoreCase("post")) {
            // prevent failures on new
            String vpCustomerNewId = getRequest().getParameter("vpCustomerNew.seq");
            if (vpCustomerNewId != null && !vpCustomerNewId.equals("")) {
                vpCustomerNew = vpCustomerNewManager.get(new Long(vpCustomerNewId));
            }
        }
    }

    public void setQ(String q) {
        this.query = q;
    }

    public String list() {
        vpCustomerNews = vpCustomerNewManager.search(query, VpCustomerNew.class);
        return SUCCESS;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public VpCustomerNew getVpCustomerNew() {
        return vpCustomerNew;
    }

    public void setVpCustomerNew(VpCustomerNew vpCustomerNew) {
        this.vpCustomerNew = vpCustomerNew;
    }

    public String delete() {
        vpCustomerNewManager.remove(vpCustomerNew.getSeq());
        saveMessage(getText("vpCustomerNew.deleted"));

        return SUCCESS;
    }

    public String edit() {
        if (seq != null) {
            vpCustomerNew = vpCustomerNewManager.get(seq);
        } else {
            vpCustomerNew = new VpCustomerNew();
        }

        return SUCCESS;
    }

    public String save() throws Exception {
        if (cancel != null) {
            return "cancel";
        }

        if (delete != null) {
            return delete();
        }

        boolean isNew = (vpCustomerNew.getSeq() == null);

        vpCustomerNewManager.save(vpCustomerNew);

        String key = (isNew) ? "vpCustomerNew.added" : "vpCustomerNew.updated";
        saveMessage(getText(key));

        if (!isNew) {
            return INPUT;
        } else {
            return SUCCESS;
        }
    }
}