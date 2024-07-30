
<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/assets/css/speakers.css">

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Speakers</h1>
        </div>
    </div>
</section>

<section class="container speaker-container">


    <div class="card">
        <div class="container img-container">
            <a href="">
                <img class="card-img-top"
                     src="https://images4.alphacoders.com/135/1351212.png"
                     alt="Speaker"></a>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">Speaker</h3>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
            <div class="speaker-details"><a href="/speakers/details?id=${speakers.id}">Learn More</a></div>
<%--  How it should be done:          <a href="/employee/details?employeeId=${employee.id}">See Customers</a>--%>
            <button type="button" class="speaker-contact">Contact</button>
        </div>
    </div>

<%--also how it should be done:--%>
<%--    <c:forEach items="${products}" var="product">--%>
<%--        <tr onclick="window.location.href = '/?id=${product.id}'" class="clickable-row">--%>
<%--            <td>${product.id}</td>--%>
<%--            <td>${product.productCode}</td>--%>
<%--            <td>${product.productName}</td>--%>
<%--            <td>${product.productDescription}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>


    <div class="card">
        <div class="container img-container">
            <a href="">
                <img class="card-img-top"
                     src="https://images4.alphacoders.com/135/1351212.png"
                     alt="Speaker"></a>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">Speaker</h3>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
            <div class="speaker-details"><a href="/speakers/details?id=${speakers.id}">Learn More</a></div>
            <button type="button" class="speaker-contact">Contact</button>
        </div>
    </div>


    <div class="card">
        <div class="container img-container">
            <a href="">
                <img class="card-img-top"
                     src="https://images4.alphacoders.com/135/1351212.png"
                     alt="Speaker"></a>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">Speaker</h3>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
            <div class="speaker-details"><a href="/speakers/details?id=${speakers.id}">Learn More</a></div>
            <button type="button" class="speaker-contact">Contact</button>
        </div>
    </div>


    <div class="card">
        <div class="container img-container">
            <a href="">
                <img class="card-img-top"
                     src="https://images4.alphacoders.com/135/1351212.png"
                     alt="Speaker"></a>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">Speaker</h3>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
            <div class="speaker-details"><p>Learn More</p></div>
            <button type="button" class="speaker-contact">Contact</button>
        </div>
    </div>


    <div class="card">
        <div class="container img-container">
            <a href="">
                <img class="card-img-top"
                     src="https://images4.alphacoders.com/135/1351212.png"
                     alt="Speaker"></a>
        </div>
        <div class="card-body">
            <h3 class="speaker-title">Speaker</h3>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Debitis id laboriosam natus, neque nihil ratione recusandae rerum sapiente tenetur totam?</p>
            <div class="speaker-details"><p>Learn More</p></div>
            <button type="button" class="speaker-contact">Contact</button>
        </div>
    </div>
</section>
<jsp:include page="../include/footer.jsp" />