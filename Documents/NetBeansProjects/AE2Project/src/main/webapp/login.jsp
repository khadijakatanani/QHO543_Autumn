<%-- 
    Document   : login
    Created on : 18 Nov 2024, 01:15:00
    Author     : khadija katanani
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login - GadgetHub</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <jsp:include page="navbar.jsp" />

        <!-- Login Form -->
        <div class="container mt-5">

            <%
                String wrongCredentials = (String) request.getAttribute("wrong_credentails");
                if (wrongCredentials != null){
                //out.println(wrongCredentials);   
            %>

            <h3 class="text-center" style="color: red"><%=  wrongCredentials  %></h3>

            <%
            }
            %>

            <h1 class="text-center">Welcome Back</h1>
            <p class="text-center text-muted">Log in to continue exploring GadgetHub!</p>

            <div class="row justify-content-center">
                <div class="col-md-6">
                    <form action="LoginServlet" method="get" class="needs-validation" novalidate>
                        <!-- Username -->
                        <div class="mb-3">
                            <label for="username" class="form-label">Username</label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter your username" required>
                            <div class="invalid-feedback">
                                Please enter your username.
                            </div>
                        </div>

                        <!-- Password -->
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                            <div class="invalid-feedback">
                                Please enter your password.
                            </div>
                        </div>

                        <!-- Submit Button -->
                        <button type="submit" class="btn btn-primary w-100">Login</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Footer -->
        <footer class="bg-light text-center text-lg-start mt-5">
            <div class="text-center p-3">
                © 2024 GadgetHub | All Rights Reserved.
            </div>
        </footer>

        <!-- Bootstrap JS Bundle -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
        <script>
            // Bootstrap form validation
            (function () {
                'use strict';
                var forms = document.querySelectorAll('.needs-validation');
                Array.prototype.slice.call(forms).forEach(function (form) {
                    form.addEventListener('submit', function (event) {
                        if (!form.checkValidity()) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            })();
        </script>
    </body>
</html>
