/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Views;

import DAO.ProductDAO;
import Model.Product;
import Controller.ProductController;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deyanok
 */
@WebServlet(name = "ProductDetailsServlet", urlPatterns = {"/ProductDetailsServlet"})
public class ProductDetailsServlet extends HttpServlet {

    HashMap<String, Product> products;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductDetails</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductDetails at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // PrintWriter out = response.getWriter();
        int productId = Integer.parseInt(request.getParameter("productId")+".jpg");
       
        //Product product = ProductController.getProductById(productId);
        //request.setAttribute("product", product);
        
        request.getRequestDispatcher("productDetails.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void init() throws ServletException {

        // products = ProductDAO.initializeProducts();

    }

}
