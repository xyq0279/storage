<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>部门更新</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="update"><a href="#" onclick="formSubmit('update','_self');this.blur();">更新</a></li>
	<li id="back"><a href="#" onclick="window.history.go(-1);">后退</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    部门更新
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<tr class="odd">
		<td>部门编号</td>
		<td><input type="text" name="deptId" value="${dept.deptId}" readonly="readonly"></td>
	</tr>
	<tr class="odd">
		<td>部门名称</td>
		<td><input type="text" name="deptName" value="${dept.deptName}"></td>
	</tr>
	<tr class="odd">
		<td>上级部门</td>
		<td>
			<select style="width: 120px" name="parentDept.deptId">
				<option value="">---无上级---</option>
				<c:forEach items="${parentList}" var="p">
					<c:if test="${p.deptId != dept.deptId}">
						<option value="${p.deptId }" 
						<c:if test="${dept.parentDept.deptId==p.deptId}">selected="selected"</c:if>>
						${p.deptName}</option>
					</c:if>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr class="odd">
		<td>状态</td>
		<td><input type="radio" name="state" value="0" ${dept.state==0? "checked='checked'":""}>停用
		<input type="radio" name="state" value="1" 
			<c:if test="${dept.state==1}">checked="checked"</c:if>
		>启用</td>
	</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

