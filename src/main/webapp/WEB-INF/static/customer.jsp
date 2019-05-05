<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/1
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!-- 引入el标识所需要的标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <td>编号</td>
        <td>名称</td>
        <td>职业</td>
        <td>电话</td>
        <tr>${customer.user_id}</tr>
        <tr>${customer.user_code}</tr>
        <tr>${customer.user_id}</tr>
        <tr>${customer.user_id}</tr>
        <tr>${customer.user_id}</tr>
    </table>
</body>
</html>
