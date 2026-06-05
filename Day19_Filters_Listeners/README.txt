DAY 19 - Filters, Listeners and MVC Best Practices

Topics Covered
--------------
1. Filters
2. Filter Lifecycle
3. Filter Mapping
4. Listeners
5. ServletContextListener
6. MVC Architecture
7. Layered Architecture
8. Authentication Filters

Files Included
--------------
1. LoginFilter.java
2. MyListener.java
3. DashboardServlet.java
4. web.xml

Filter Flow
-----------
Client Request
      ↓
LoginFilter
      ↓
DashboardServlet
      ↓
Response

Listener Flow
-------------
Application Start
      ↓
contextInitialized()

Application Stop
      ↓
contextDestroyed()

Outcome
-------
Learned how Filters intercept requests,
how Listeners monitor application events,
and how MVC architecture is used in enterprise applications.