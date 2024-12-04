/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Views;

import Controller.UserController;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Author : khadija katanani
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("wrong_credentails", "Please type correct username and/or password!");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (UserController.userExists(username)) {
            User user = UserController.getUser(username);            
            if (password.equals(user.getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("sessionUser", user);
                
                request.removeAttribute("wrong_credentails");

                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
                // response.getWriter().println("Invalid credentials. Please try again.");
            }
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//
//        if (UserController.userExists(username)) {
//            User user = UserController.getUser(username);
//            if (password.equals(user.getPassword())) {
//                // Create cookies for username and password
//                Cookie userCookie = new Cookie("username", username);
//                userCookie.setMaxAge(60 * 60); // 1 hour
//                response.addCookie(userCookie);
//
//                // Redirect to WelcomeServlet
//                response.sendRedirect("WelcomeServlet");
//            } else {
//                response.getWriter().println("Invalid credentials. Please try again.");
//            }
//        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
