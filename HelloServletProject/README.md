# Servlet Assignment - Hussein Chreif

## Assignment Overview
Implementation of a basic Java Servlet deployed on Apache Tomcat, demonstrating servlet creation, compilation, deployment, and web integration.

## Software and Versions Used

| Software | Version | Purpose |
|----------|---------|---------|
| Operating System | Ubuntu 22.04 LTS | Development environment |
| Java JDK | OpenJDK 11 | Java runtime and compilation |
| Apache Maven | 3.6.3 | Build automation and dependency management |
| Apache Tomcat | 10.1.x | Servlet container / Web server |
| Text Editor | Nano / Vim | Code editing |

## Project Structure
```
HelloServletProject/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── hussein/
│       │           └── HelloServlet.java
│       └── webapp/
│           ├── WEB-INF/
│           └── index.html
├── target/
│   └── hello-servlet.war
├── pom.xml
└── README.md
```

## Installation Steps

### 1. Install Prerequisites
```bash
sudo apt update
sudo apt install default-jdk maven tomcat10 -y
```

### 2. Create Project Structure
```bash
mkdir -p HelloServletProject
cd HelloServletProject
mkdir -p src/main/java/com/hussein
mkdir -p src/main/webapp/WEB-INF
```

### 3. Create Project Files
- Created `pom.xml` for Maven configuration
- Implemented `HelloServlet.java` with @WebServlet annotation
- Created `index.html` as landing page with link to servlet

### 4. Compile the Project
```bash
mvn clean package
```

**Output:**
```
[INFO] Building war: target/hello-servlet.war
[INFO] BUILD SUCCESS
```

### 5. Deploy to Tomcat
```bash
sudo cp target/hello-servlet.war /var/lib/tomcat10/webapps/
sudo systemctl restart tomcat10
```

### 6. Test the Application

**Access URLs:**
- Home Page: `http://localhost:8081/hello-servlet/`
- Servlet: `http://localhost:8081/hello-servlet/hello`

## Servlet Implementation Details

### Key Features:
- Uses Jakarta Servlet API 5.0
- `@WebServlet` annotation for URL mapping
- Generates dynamic HTML response
- Includes CSS styling
- Displays server information

### URL Pattern:
- Servlet mapped to `/hello`
- Full URL: `http://localhost:8081/hello-servlet/hello`

## Testing Results

✅ Servlet compiles successfully  
✅ WAR file created (hello-servlet.war)  
✅ Deployed to Tomcat without errors  
✅ Index page accessible  
✅ Servlet responds to HTTP GET requests  
✅ HTML output renders correctly  

## Troubleshooting

### If servlet not accessible:
```bash

sudo systemctl status tomcat10

sudo tail -f /var/log/tomcat10/catalina.out

ls /var/lib/tomcat10/webapps/hello-servlet/
```

### If compilation fails:
```bash

mvn clean compile
mvn package
```

## Commands Reference
```bash

sudo systemctl start tomcat10

sudo systemctl stop tomcat10

sudo systemctl restart tomcat10

sudo journalctl -u tomcat10 -f

mvn clean package

sudo cp target/hello-servlet.war /var/lib/tomcat10/webapps/
```

## Conclusion

This assignment successfully demonstrates:
- Manual servlet development without IDE
- Maven-based project structure
- Servlet deployment on Apache Tomcat
- Integration of HTML and servlets
- Terminal-based Java web development workflow

## Author
Hussein Chreif  
USJ - Computer and Communications Engineering  
Date: February 2026