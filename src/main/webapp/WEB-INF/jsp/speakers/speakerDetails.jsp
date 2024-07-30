<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">This Speaker Person</h1>
        </div>
    </div>
</section>

<section class="container speaker-container">

    <table>
            <c:forEach items="${speakers}" var="speaker">
                <tr onclick="window.location.href = '/?id=${speaker.id}'" class="clickable-row">
                    <td>${speaker.id}</td>
                    <td>${speaker.firstName}</td>
                    <td>${speaker.lastName}</td>
                    <td>${speaker.organization}</td>
                    <td>${speaker.title}</td>
                    <td>${speaker.about}</td>
                </tr>
            </c:forEach>
