<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="j" uri="/jodd" %>
<html>
<head>
    <title>All Articles</title>
</head>
<body>
<h1>All Articles</h1>

<j:iter items="${allArticles}" var="article">
    <h2>${article.title}</h2>
    <%--<div>${article.summary}</div>--%>
    <div>${article.text}</div>
</j:iter>

<p><a href="index.html">Back</a></p>

</body>
</html>