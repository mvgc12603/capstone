<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="method" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/assets/css/global.css">
    <link rel="stylesheet" href="/assets/css/navbar.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light">
    <a class="navbar-brand" href="#">
        <img src="\assets\img\favicon.png" style="width: 100px; padding-left: 10px;"/> </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navLinks" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="container-fluid" data-bs-target="#navbarSupportedContent"
         aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <div class="collapse navbar-collapse flex-grow-1" id="navbarSupportedContent">
            <ul class="navbar-nav mb-2 mb-lg-0 mx-auto">
                <li class="nav-item active">
                    <a class="nav-link  text-center" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link  text-center" href="/speakers/">Speakers</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link  dropdown-toggle text-center" href="/resources/" id="resourcesDropdown"
                       role="button"
                       data-toggle="dropdown"> Resources </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/resources/water">Water</a>
                        <a class="dropdown-item" href="/resources/energy">Energy</a>
                        <a class="dropdown-item" href="/resources/flora">Flora</a>
                        <a class="dropdown-item" href="/resources/construction">Construction</a>
                        <a class="dropdown-item" href="/resources/food">Food</a>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link  text-center" href="/contact">Contact</a>
                </li>
            </ul>

            <!-- Buttons to toggle forms -->
            <sec:authorize access="!isAuthenticated()">
                <div class="d-flex justify-content-center align-items-center" id="loginBtn">
                    <a class="btn btn-primary" id="signup-button" href="/account/signup">Sign Up</a>
                    <a class="btn btn-secondary" id="login-button" href="/account/login">Login</a>
                </div>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
            </sec:authorize>

            <sec:authorize access="hasAnyAuthority('USER')">
            <a class="btn btn-primary" href="/user/profile" style="width: auto"><sec:authentication
                    property="name"/></a>
        </div>
        </sec:authorize>


        <sec:authorize access="hasAnyAuthority('ADMIN')">
        <div class="dropdown">
            <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                Admin
            </button>
            <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                <li><a class="dropdown-item" href="/admin/createSpeaker">Create Speaker</a></li>
                <li><a class="dropdown-item" href="/speakers/">Edit Speaker</a></li>
            </ul>
        </div>


            </sec:authorize>

            <sec:authorize access="isAuthenticated()">
            <form id="hidden-form" action="/account/logout" method="post">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <input type="submit" class="btn-secondary" value="Log Out"/>
            </form>
            </sec:authorize>

</nav>

