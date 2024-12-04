<%-- 
    Document   : shoppingPage
    Created on : 21 Nov 2024, 15:32:55
    Author     : Khadija Katanani
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ShoppingBasket.ShoppingCartManager" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1>Shopping Page</h1>
    <form method="post" action="shoppingPage.jsp">
        <div class="mb-3">
            <label for="productId" class="form-label">Product ID</label>
            <input type="text" id="productId" name="productId" class="form-control" required>
        </div>
        <div class="mb-3">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" id="quantity" name="quantity" class="form-control" required>
        </div>
        <button type="submit" name="add" class="btn btn-primary">Add to Cart</button>
        <button type="submit" name="remove" class="btn btn-danger">Remove from Cart</button>
    </form>

    <h2>Shopping Cart</h2>
    <ul class="list-group">
        <%
            ShoppingCartManager cartManager = ShoppingCartManager.getInstance();

            String productId = request.getParameter("productId");
            String quantityParam = request.getParameter("quantity");
            if (productId != null && quantityParam != null) {
                int quantity = Integer.parseInt(quantityParam);
                if (request.getParameter("add") != null) {
                    cartManager.addItem(productId, quantity);
                } else if (request.getParameter("remove") != null) {
                    cartManager.removeItem(productId);
                }
            }

            Map<String, Integer> cart = cartManager.getCart();
            for (Map.Entry<String, Integer> entry : cart.entrySet()) {
        %>
        <li class="list-group-item">
            Product ID: <%= entry.getKey() %> | Quantity: <%= entry.getValue() %>
        </li>
        <%
            }
        %>
    </ul>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
