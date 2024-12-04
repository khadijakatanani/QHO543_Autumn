<%-- 
    Document   : productDetails
    Created on : 19 Nov 2024, 00:22:15
    Author     : deyanok
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Model.Product" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Details</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="navbar.jsp" />
        
        <%
               String error = (String)(request.getAttribute("error"));
               if (error != null){
               out.println(error);
               } 
        %>
        
        <div class="container mt-5">

            <% 
                // Retrieve the product from the request scope
                Product product = (Product) request.getAttribute("product");
                if (product != null) {
            %>
            <!-- Product Details -->
            <div class="row">
                <div class="col-md-6">
                    <img src="images/<%= product.getImage() %>" alt="<%= product.getName() %>" class="img-fluid">
                </div>
                <div class="col-md-6">
                    <h2><%= product.getName() %></h2>
                    <p><%= product.getDescription() %></p>
                    <p><strong>Category:</strong> <%= product.getProductType() %></p><br>
                    <h3>£ <%= product.getProductPrice() %></h3>
                    <form action="AddToBasketServlet" method="get">
                        <input type="hidden" name="productId" value="<%= product.getId() %>">
                        <input type="hidden" name="productName" value="<%= product.getName() %>">
                        <div class="mb-3">
                            <label for="quantity" class="form-label">Quantity</label>
                            <input type="number" id="quantity" name="quantity" class="form-control" value="1" min="1" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Add to Basket</button>
                    </form>
                </div>
            </div>
            <% 
                } else { 
            %>
            <!-- If product is not found -->
            <div class="alert alert-danger text-center mt-5">
                <p>Product not found.</p>
            </div>
            <% 
                }
            %>

        </div>

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
