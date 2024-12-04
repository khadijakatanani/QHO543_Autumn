<%-- 
    Document   : welcome
    Created on : 18 Nov 2024, 00:46:04
    Author     : khadija katanani
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Model.User" %>
<%@ page import="Model.Product" %>
<%@ page import="Controller.ProductTypes" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GadgetHub - Online Electronics Store</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="navbar.jsp" />

        <div class="container mt-5">

            <%               
                String productName = (String)session.getAttribute("productName");
                String quantity = (String)session.getAttribute("quantity");
                if (productName != null){                
                    session.removeAttribute("productName");
                    session.removeAttribute("quantity");
            %>

            <!-- Product Details -->
            <div class="row" id="product-message">
                <div class="col-md-6">
                    <p>
                        <strong>Product Added: 
                            <label style="color: green;"><%= productName %> &#128522;</label><br>
                            Quantity: <label style="color: green;">&nbsp;<%= quantity %></label>
                        </strong>
                    </p>
                </div>
            </div>
            <script>
                // Automatically remove the message after 5 seconds
                setTimeout(() => {
                    document.getElementById("product-message").remove();
                }, 5000);
            </script>
            <% 
                } 
            %>

        </div>

        <!-- Hero Section -->
        <div class="container text-center mt-5">
            <h1>Welcome to GadgetHub</h1>
            <p class="lead">Explore the latest gadgets and accessories at unbeatable prices!</p>
        </div>

        <!-- Search Bar -->
        <div class="container mt-4">
            <form action="ProductDetailsServlet" method="get" class="d-flex">
                <input class="form-control me-2" type="search" name="query" placeholder="Search for products by Name or Brand" aria-label="Search">
                <button class="btn btn-primary" type="submit">Search</button>
            </form>
        </div>

        <!-- Featured Products -->
        <div class="container mt-5">
            <h2 class="text-center">Featured Products</h2>  
            <div class="row mt-4">
                <% 
                    Map<String, Product> products = (Map<String, Product>) request.getAttribute("products");
                    if (products != null) {
                        for (Map.Entry<String, Product> entry : products.entrySet()) {
                            Product product = entry.getValue();
                %>
                <div class="col-md-4">
                    <div class="card">
                        <img src="images/<%= entry.getKey() %>" class="card-img-top" alt="<%= product.getName() %>">
                        <div class="card-body">
                            <h5 class="card-title"><%= product.getName() %></h5>
                            <a href="ProductDetailsServlet?productId=<%= product.getProductId() %>" class="btn btn-primary">View Details</a>
                        </div>
                    </div>
                </div>
                <% 
                        }
                    } else {
                %>
                <p class="text-center">No products found.</p>
                <% 
                    }
                %>
            </div>

        </div>

        <!--        <div class="container mt-5">
                    <h2 class="text-center">Featured Products</h2>
                    <div class="row mt-4">
                        <div class="col-md-4">
                            <div class="card">
                                <img src="images/product1.jpg" class="card-img-top" alt="Product 1">
                                <div class="card-body">
                                    <h5 class="card-title">Smartphone Apple</h5>
                                    <p class="card-text">A cutting-edge smartphone with amazing features.</p>
                                    <a href="ProductDetails.jsp?productId=1" class="btn btn-primary">View Details</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card">
                                <img src="images/product2.jpg" class="card-img-top" alt="Product 2">
                                <div class="card-body">
                                    <h5 class="card-title">Wireless Headphones</h5>
                                    <p class="card-text">Crystal-clear sound and unmatched comfort.</p>
                                    <a href="ProductDetails.jsp?productId=2" class="btn btn-primary">View Details</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card">
                                <img src="images/product3.jpg" class="card-img-top" alt="Product 3">
                                <div class="card-body">
                                    <h5 class="card-title">Laptop HP</h5>
                                    <p class="card-text">Powerful performance for all your computing needs.</p>
                                    <a href="ProductDetails.jsp?productId=3" class="btn btn-primary">View Details</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>-->
        <!-- Footer -->
        <footer class="bg-light text-center text-lg-start mt-5">
            <div class="text-center p-3">
                © 2024 GadgetHub | All Rights Reserved.
            </div>
        </footer>

        <!-- Bootstrap JS Bundle -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
