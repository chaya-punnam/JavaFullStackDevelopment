DAY 13 - JSP (JavaServer Pages)

## Overview

Day 13 focuses on learning JSP (JavaServer Pages), which is used to create dynamic web pages in Java web applications. JSP simplifies UI development by allowing HTML and Java code to be combined in a single file.

## Objectives

1. Understand JSP fundamentals.
2. Learn the difference between Servlets and JSP.
3. Create and run basic JSP pages.
4. Use JSP Scriptlets, Expressions, and Directives.
5. Build a simple user input application using JSP.
6. Understand the role of JSP in MVC Architecture.

## Topics Covered

1. Introduction to JSP
2. Servlet vs JSP
3. JSP Scriptlets (<% %>)
4. JSP Expressions (<%= %>)
5. JSP Directives (<%@ %>)
6. JSP Page Execution Flow
7. MVC Architecture Basics
8. Dynamic Content Generation

## Programs Implemented

1. hello.jsp

   * Displays a simple welcome message.

2. date.jsp

   * Displays the current date and time using Java code inside JSP.

3. index.jsp

   * Accepts user input through a form.

4. welcome.jsp

   * Retrieves and displays user input using request.getParameter().

## MVC Architecture

Model      -> Database Layer
View       -> JSP Pages
Controller -> Servlets

Flow:
Browser
↓
Servlet (Controller)
↓
Database (Model)
↓
JSP (View)
↓
Browser Response

## Key Learnings

* JSP is used for presentation (UI).
* Servlets are mainly used for request processing and business logic.
* JSP Expressions can directly display values.
* JSP Scriptlets allow embedding Java code.
* JSP Directives provide page-level configurations.
* JSP plays the View role in MVC Architecture.

## Outcome

Successfully learned JSP fundamentals and created dynamic web pages using JSP. Gained understanding of how JSP works with Servlets in Java Web Applications and how MVC architecture is implemented in real-world projects.
