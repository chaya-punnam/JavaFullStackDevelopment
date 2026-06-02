DAY 16 - Expression Language (EL) and JSTL

Overview
--------
Day 16 focuses on Expression Language (EL) and JSTL concepts used in JSP applications. EL simplifies data access in JSP pages without writing Java code.

Topics Covered
--------------
1. Expression Language (EL)
2. EL Syntax ${}
3. Request Attributes
4. Session Attributes
5. RequestDispatcher
6. Servlet to JSP Communication
7. JSTL Introduction
8. JSP Best Practices

Files Included
--------------
1. WelcomeServlet.java
2. welcome.jsp
3. web.xml

Project Flow
------------
Browser
   ↓
WelcomeServlet
   ↓
request.setAttribute("student","Chaya")
   ↓
RequestDispatcher
   ↓
welcome.jsp
   ↓
${student}
   ↓
Output

Key Learnings
-------------
- EL reduces Java code inside JSP.
- Request attributes can be displayed using EL.
- Servlet and JSP communication using RequestDispatcher.
- JSP acts as View in MVC architecture.

Outcome
-------
Successfully implemented a Servlet to JSP communication example using Expression Language.