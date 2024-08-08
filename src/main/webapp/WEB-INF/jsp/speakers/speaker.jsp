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
    <%--    <c:forEach items="${products}" var="product">--%>
    <%--        <tr onclick="window.location.href = '/?id=${product.id}'" class="clickable-row">--%>

        <c:forEach items="${speakers}" var="speaker">
            <div class="card">
                <div class="container img-container">
                    <img class="card-img-top"
                         src="https://images4.alphacoders.com/135/1351212.png"
                         alt="Speaker">
                        <%--                <img class="event-image" src=${event.imageURL} alt="">--%>
                </div>
                <div class="card-body">
                    <h3 class="speaker-title">${speaker.organization}</h3>
                    <p class="card-text">${speaker.about}Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                        Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
                    <div class="speaker-details"><a href="/speakers/details?id=${speaker.id}">Learn More</a></div>
                    <button type="button" class="speaker-contact">Contact</button>
                    <div class="row">
                    <button type="button" href="/speakers/edit">EDIT</button>
                    </div>
                </div>
                </div>
        </c:forEach>
<jsp:include page="../include/footer.jsp"/>