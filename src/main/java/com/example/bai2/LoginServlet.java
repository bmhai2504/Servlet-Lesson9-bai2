package com.example.bai2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login-demo", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if ("admin".equals(userName) && "admin".equals(password)){
            writer.println("<h1>Welcome " + userName + " to website</h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if ("admin".equals(userName) && "admin".equals(password)){
            writer.println("<h1>Welcome " + userName + " to website</h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }
}
