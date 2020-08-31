<%--
  Created by IntelliJ IDEA.
  User: lv900
  Date: 2020/8/31
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>$Title$</title>
</head>
<body>
$END$
</body>
</html>
