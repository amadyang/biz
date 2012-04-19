<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="vpCustomerNewDetail.title"/></title>
    <meta name="heading" content="<fmt:message key='vpCustomerNewDetail.heading'/>"/>
</head>

<s:form id="vpCustomerNewForm" action="saveVpCustomerNew" method="post" validate="true">
    <li style="display: none">
        <s:hidden key="vpCustomerNew.seq"/>
    </li>
    <s:textfield key="vpCustomerNew.ABanktype" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ABegindate" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ABelongtoname" required="false" maxlength="128" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.AContact" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.AContractno" required="false" maxlength="32" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ACustadd" required="false" maxlength="128" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ACustid" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ACustname" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ACustnewold" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ADept" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.AFilldate" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.AFiller" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.APhonenum" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPaymethod" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayothercust" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayotherfreq" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayothermethod" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayothernum" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayotherprice" required="false" maxlength="255" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayotherratio" required="false" maxlength="255" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayothertype" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselfcust" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselffreq" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselfnum" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselfprice" required="false" maxlength="255" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselfratio" required="false" maxlength="255" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.CPayselftype" required="false" maxlength="10" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.DResult" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ZBranchdeals" required="false" maxlength="64" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ZMktdealer" required="false" maxlength="20" cssClass="text medium"/>
    <s:textfield key="vpCustomerNew.ZZhuren" required="false" maxlength="10" cssClass="text medium"/>

    <li class="buttonBar bottom">
        <s:submit cssClass="button" method="save" key="button.save" theme="simple"/>
        <c:if test="${not empty vpCustomerNew.seq}">
            <s:submit cssClass="button" method="delete" key="button.delete"
                onclick="return confirmDelete('VpCustomerNew')" theme="simple"/>
        </c:if>
        <s:submit cssClass="button" method="cancel" key="button.cancel" theme="simple"/>
    </li>
</s:form>

<script type="text/javascript">
    Form.focusFirstElement($("vpCustomerNewForm"));
</script>
