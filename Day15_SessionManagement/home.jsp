<%@ page import=
"javax.servlet.http.*" %>

<html>
<body>

<%

String user =

(String)session.getAttribute(
        "username");

if(user != null) {

%>

<h2>

Welcome

<%= user %>

</h2>

<a href="logout">

Logout

</a>

<%

}
else {

response.sendRedirect(
        "login.jsp");

}

%>

</body>
</html>