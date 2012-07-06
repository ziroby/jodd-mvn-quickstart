<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="j" uri="/jodd" %>
<html>
<head>
    <title>All Greetings</title>
</head>
<body>
<h1>All Greetings</h1>

<table>
    <tr>
        <th>Name</th>
        <th>Phrase</th>
    </tr>
<j:iter items="${allGreetings}" var="greeting">
    <tr>
        <td>${greeting.name}</td>
        <td>${greeting.phrase}</td>
    </tr>
</j:iter>
</table>
</body>
</html>