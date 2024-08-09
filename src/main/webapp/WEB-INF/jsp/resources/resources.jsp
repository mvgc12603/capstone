<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/assets/css/speakers.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container-fluid resourceTypes-container">
<c:forEach items="${resources}" var="resource">
    <div class="card">
        <div class="container img-container">
            <img class="card-img-top"
                 src="https://images4.alphacoders.com/135/1351212.png"
                 alt="Resource">
                <%--                <img class="event-image" src=${event.imageURL} alt="">--%>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">${resource}</h3>
            <p class="card-text"></p>
        </div>
    </div>
</c:forEach>
</div>

    <jsp:include page="../include/footer.jsp"/>
