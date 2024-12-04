<%-- 
    Document   : register
    Created on : 18 Nov 2024, 00:48:46
    Author     : khadija katanani
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Register - GadgetHub</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="navbar.jsp" />
        <!-- Registration Form -->
        <div class="container mt-5">
            <h1 class="text-center">Create Your Account</h1>
            <p class="text-center text-muted">Join GadgetHub and explore amazing gadgets!</p>

            <div class="row justify-content-center">
                <div class="col-md-6">
                    <form action="RegisterServlet" method="post" class="needs-validation" novalidate>
                        <!-- Username -->
                        <div class="mb-3">
                            <label for="username" class="form-label">Username</label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter your username" required>
                            <div class="invalid-feedback">
                                Please enter a username.
                            </div>
                        </div>

                        <!-- Password -->
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                            <div class="invalid-feedback">
                                Please enter a password.
                            </div>
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email address" required>
                            <div class="invalid-feedback">
                                Please enter a valid email address.
                            </div>
                        </div>

                        <!-- Virtual Wallet Balance -->
                        <div class="mb-3">
                            <label for="walletBalance" class="form-label">Initial Wallet Balance</label>
                            <input type="number" class="form-control" id="walletBalance" name="walletBalance" placeholder="Enter your initial balance" min ="0" required>
                            <div class="invalid-feedback">
                                Please enter your initial wallet balance.
                            </div>
                        </div>

                        <!-- Submit Button -->
                        <button type="submit" class="btn btn-primary w-100">Register</button>
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
