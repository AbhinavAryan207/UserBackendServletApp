# UserBackendServletApp
A Java Servlet backend deployed on Apache Tomcat.

# Structure
D:.
│   UserBackendServletApp.war
│
├───build
│   ├───servlets
│   │       RegisterServlet.class
│   │
│   └───utils
│           DBUtil.class
│
├───dist
│   └───WEB-INF
│       │   web.xml
│       │
│       └───classes
│           ├───servlets
│           │       RegisterServlet.class
│           │
│           └───utils
│                   DBUtil.class
│
├───lib
│       postgresql-42.7.5.jar
│
├───src
│   ├───servlets
│   │       RegisterServlet.java
│   │
│   └───utils
│           DBUtil.java
│
├───web
│   └───WEB-INF
│           web.xml
│
└───WEB-INF
    └───classes
        ├───servlets
        │       RegisterServlet.class
        │
        └───utils
                DBUtil.class
