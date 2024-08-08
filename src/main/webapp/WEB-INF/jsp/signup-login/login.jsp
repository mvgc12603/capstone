<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<link rel="stylesheet" href="/assets/css/signup-login.css">



<div id="main-wrapper" class="container" style="background: #467678;">
    <div class="row" style="background: violet;">


        <div class="col-md-6 g-0" id="login" style="background: #9ae9ed">
            <div class="card-body form-container p-5" style="background: #cdbeed; ">
                <h2 class="font-weight-bold text-theme">Login</h2>
                <p class="text-muted mt-2 mb-5">Log in by entering your email address and password.</p>
                <form action="/account/loginSubmit" method="post">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <div class="form-group">
                        <label for="email2">Email address</label>
                        <input type="email" name="username" class="form-control" id="email2">
<%--                        needs to be called username--%>
                    </div>
                    <div class="form-group mb-5">
                        <label for="password2">Password</label>
                        <input type="password" name="password" class="form-control" id="password2">
                    </div>
                    <button type="submit" class="btn submit">Login
                    </button>
                </form>
                <p class="text-muted text-center mt-3 mb-0">Don't have an account? <a href="/account/signup"
                                                                                      class="text-primary ml-1">Sign up.</a>
                </p>
            </div>
        </div>
    </div>
</div>
