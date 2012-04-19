package com.vpower.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import com.vpower.service.GenericManager;
import com.vpower.model.VpCustomerNew;
import com.vpower.webapp.action.BaseActionTestCase;
import org.compass.gps.CompassGps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VpCustomerNewActionTest extends BaseActionTestCase {
    private VpCustomerNewAction action;
    @Autowired
    private CompassGps compassGps;

    @Before
    public void onSetUp() {
        super.onSetUp();
        compassGps.index();

        action = new VpCustomerNewAction();
        GenericManager vpCustomerNewManager = (GenericManager) applicationContext.getBean("vpCustomerNewManager");
        action.setVpCustomerNewManager(vpCustomerNewManager);

        // add a test vpCustomerNew to the database
        VpCustomerNew vpCustomerNew = new VpCustomerNew();

        // enter all required fields

        vpCustomerNewManager.save(vpCustomerNew);
    }

    @Test
    public void testGetAllVpCustomerNews() throws Exception {
        assertEquals(action.list(), ActionSupport.SUCCESS);
        assertTrue(action.getVpCustomerNews().size() >= 1);
    }

    @Test
    public void testSearch() throws Exception {
        action.setQ("*");
        assertEquals(action.list(), ActionSupport.SUCCESS);
        assertEquals(4, action.getVpCustomerNews().size());
    }

    @Test
    public void testEdit() throws Exception {
        log.debug("testing edit...");
        action.setSeq(-1L);
        assertNull(action.getVpCustomerNew());
        assertEquals("success", action.edit());
        assertNotNull(action.getVpCustomerNew());
        assertFalse(action.hasActionErrors());
    }

    @Test
    public void testSave() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setSeq(-1L);
        assertEquals("success", action.edit());
        assertNotNull(action.getVpCustomerNew());

        VpCustomerNew vpCustomerNew = action.getVpCustomerNew();
        // update required fields

        action.setVpCustomerNew(vpCustomerNew);

        assertEquals("input", action.save());
        assertFalse(action.hasActionErrors());
        assertFalse(action.hasFieldErrors());
        assertNotNull(request.getSession().getAttribute("messages"));
    }

    @Test
    public void testRemove() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setDelete("");
        VpCustomerNew vpCustomerNew = new VpCustomerNew();
        vpCustomerNew.setSeq(-2L);
        action.setVpCustomerNew(vpCustomerNew);
        assertEquals("success", action.delete());
        assertNotNull(request.getSession().getAttribute("messages"));
    }
}