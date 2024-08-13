<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<link rel="stylesheet" href="/assets/css/signup-login.css">



<div id="main-wrapper" class="container">
    <div class="row" style="background: #8fc0a9;">
        <div class="col-md-6 g-0" id="signup">
            <div class="card-body form-container p-5" style="background: #7ca982; ">
                <h2 class="font-weight-bold text-theme">Sign Up</h2>
                <p class="text-muted mt-2 mb-5">Sign up by entering your email address and password.</p>
                <form autocomplete="off" action="/account/create-account" method="post">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <div class="form-group mb-5">
                        <label for="communityName">Community Name</label>
                        <input type="text" name="communityName" class="form-control" id="communityName">
                    </div>
                    <div class="form-group">
                        <label for="email1">Email address</label>
                        <input type="email" class="form-control" name="email" id="email1">
                    </div>
                    <div class="form-group mb-5" >
                        <label for="password1">Password</label>
                        <input type="password" name="password" class="form-control" id="password1">
                    </div>
                    <button type="submit" class="btn submit"  onclick="alert('Welcome to Greenify')">Sign Up</button>
                </form>
                <p class="text-muted text-center mt-3 mb-0">Already have an account? <a href="/account/login"
                                                                                      class="text-primary ml-1">Log in.</a>
                </p>
            </div>
        </div>
    </div>
</div>

