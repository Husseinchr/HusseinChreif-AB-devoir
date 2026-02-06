package com.hussein;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <title>Hello Servlet</title>");
            out.println("    <style>");
            out.println("        body {");
            out.println("            font-family: Arial, sans-serif;");
            out.println("            max-width: 600px;");
            out.println("            margin: 50px auto;");
            out.println("            padding: 20px;");
            out.println("            background-color: #f0f0f0;");
            out.println("        }");
            out.println("        .container {");
            out.println("            background-color: white;");
            out.println("            padding: 30px;");
            out.println("            border-radius: 8px;");
            out.println("            box-shadow: 0 2px 10px rgba(0,0,0,0.1);");
            out.println("        }");
            out.println("        h1 { color: #007bff; }");
            out.println("        a {");
            out.println("            color: #007bff;");
            out.println("            text-decoration: none;");
            out.println("        }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='container'>");
            out.println("        <h1>Hello Hussein Chreif</h1>");
            out.println("        <p>This servlet is running successfully on Apache Tomcat!</p>");
            out.println("        <p><strong>Server Info:</strong> " + getServletContext().getServerInfo() + "</p>");
            out.println("        <p><a href='index.html'>&larr; Back to Home</a></p>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
