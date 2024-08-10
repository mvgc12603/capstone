<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/assets/css/speakers.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Speakers</h1>
        </div>
    </div>
</section>

<section class="container speaker-container">


    <%--also how it should be done:--%>
    <%--        <tr onclick="window.location.href = '/?id=${product.id}'" class="clickable-row">--%>

        <c:forEach items="${speakers}" var="speaker">
        <a href="/speakers/details?id=1">
            <div class="card">
                <a class="container img-container">
                    <img class="card-img-top"
                         src="https://images4.alphacoders.com/135/1351212.png"
                         alt="Speaker">
                        <%--                <img class="event-image" src=${event.imageURL} alt="">--%>
                </a>
                <div class="card-body">
                    <h3 class="speaker-title">${speaker.organization}</h3>
                    <p class="card-text">${speaker.about}Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                        Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
                    <div class="speaker-details"><a href="/speakers/details?id=${speaker.id}">Learn More</a></div>
                        <a href="/contact" type="submit" class="btn speaker-contact">Contact</a>


                    <sec:authorize access="hasAnyAuthority('ADMIN')">
                    <div class="row-5">
                    <button type="button" href="/speakers/edit" style="background-color: #ea1c2c; color:white">EDIT</button>
                    </div>
                    </sec:authorize>
                </div>
                </div>
        </a>
        </c:forEach>
<jsp:include page="../include/footer.jsp"/>