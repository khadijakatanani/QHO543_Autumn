<%-- 
    Document   : navbar
    Created on : 18 Nov 2024, 02:25:02
    Author     : khadija katanani
--%>

<%@ page import="Model.User" %>
<!-- navbar.jsp -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <!-- 
        
    -->
    <%
            User sessionUser = (User) session.getAttribute("sessionUser");
            String username = "";
        
            if (sessionUser != null) {
                username = sessionUser.getUsername(); 
                // out.println("SessionUser in JSP: " + username); 
            } else {
                username = "user";
                // out.println("SessionUser in JSP: null"); 
            }
    %>
    <div class="container-fluid">
        <a class="navbar-brand" href="#">GadgetHub</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="WelcomeServlet">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="BrowseProducts.jsp">Browse Products</a>
                </li>
                <%  
                    if (sessionUser == null){ %>
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Login</a>
                </li>              

                <li class="nav-item">
                    <a class="nav-link" href="register.jsp">Register</a>
                </li>
                <%}%>
                
            </ul>
            <span class="navbar-text ms-auto">
                Welcome <%= username %>
                <br>
                <%  
                if (sessionUser != null){ %>
                <a href="LogoutServlet" class="nav-link">Logout</a>
                <%}%>
            </span>

        </div>
    </div>
</nav>
