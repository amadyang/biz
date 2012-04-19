<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="vpCustomerNewList.title"/></title>
    <meta name="heading" content="<fmt:message key='vpCustomerNewList.heading'/>"/>
    <meta name="menu" content="VpCustomerNewMenu"/>
</head>

<div id="search">
<form method="get" action="${ctx}/vpCustomerNews" id="searchForm">
    <input type="text" size="20" name="q" id="query" value="${param.q}"
           placeholder="Enter search terms..."/>
    <input type="submit" value="<fmt:message key="button.search"/>"/>
</form>
</div>

<input type="button" style="margin-right: 5px" class="button" onclick="location.href='<c:url value="/editVpCustomerNew"/>'" value="<fmt:message key="button.add"/>"/>
<input type="button" class="button" onclick="location.href='<c:url value="/mainMenu"/>'" value="<fmt:message key="button.done"/>"/>

<display:table name="vpCustomerNews" class="table" requestURI="" id="vpCustomerNewList" export="true" pagesize="2"  >
    <display:column property="seq" sortable="true" href="editVpCustomerNew" media="html"
        paramId="seq" paramProperty="seq" titleKey="vpCustomerNew.seq"/>
    <display:column property="seq" media="csv excel xml pdf" titleKey="vpCustomerNew.seq"/>
    <display:column property="ABanktype" sortable="true" titleKey="vpCustomerNew.ABanktype"/>
    <display:column property="ABegindate" sortable="true" titleKey="vpCustomerNew.ABegindate"/>
    <display:column property="ABelongtoname" sortable="true" titleKey="vpCustomerNew.ABelongtoname"/>
    <display:column property="ACustid" sortable="true" titleKey="vpCustomerNew.ACustid"/>
    <display:column property="ACustname" sortable="true" titleKey="vpCustomerNew.ACustname"/>
    <display:column property="ACustnewold" sortable="true" titleKey="vpCustomerNew.ACustnewold"/>
    <display:column property="AFilldate" sortable="true" titleKey="vpCustomerNew.AFilldate"/>
    <display:column property="AFiller" sortable="true" titleKey="vpCustomerNew.AFiller"/>
    <display:column property="DResult" sortable="true" titleKey="vpCustomerNew.DResult"/>

    <display:setProperty name="paging.banner.item_name"><fmt:message key="vpCustomerNewList.vpCustomerNew"/></display:setProperty>
    <display:setProperty name="paging.banner.items_name"><fmt:message key="vpCustomerNewList.vpCustomerNews"/></display:setProperty>

    <display:setProperty name="export.excel.filename"><fmt:message key="vpCustomerNewList.title"/>.xls</display:setProperty>
    <display:setProperty name="export.csv.filename"><fmt:message key="vpCustomerNewList.title"/>.csv</display:setProperty>
    <display:setProperty name="export.pdf.filename"><fmt:message key="vpCustomerNewList.title"/>.pdf</display:setProperty>
</display:table>

<input type="button" style="margin-right: 5px" class="button" onclick="location.href='<c:url value="/editVpCustomerNew"/>'" value="<fmt:message key="button.add"/>"/>
<input type="button" class="button" onclick="location.href='<c:url value="/mainMenu"/>'" value="<fmt:message key="button.done"/>"/>

<script type="text/javascript">
    highlightTableRows("vpCustomerNewList");
</script>
