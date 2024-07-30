<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<jsp:include page="../include/header.jsp"/>



    <section class="employee-details">
        <div class="container">
            <div class="row pt-5 pb-5">
                <h1 class="text-center">Speaker Details</h1>
            </div>
        </div>
    </section>

    <div class="container d-flex flex-column align-items-center">
        <div class="mt-2 d-inline px-5 p-4 pb-2 border mb-4 border-1 rounded-2">
            <h2 class="text-center fs-1 mb-4">${speaker.firstName} ${speaker.lastName}</h2>
            <p class="fs-5"><span class="fw-bold">ID: </span>${speaker.id}</p>
            <p class="fs-5"><span class="fw-bold">Email: </span>${speaker.organization}</p>
            <p class="fs-5"><span class="fw-bold">Job Title: </span>${speaker.title}</p>
            <p class="fs-5"><span class="fw-bold">About: </span>${speaker.about}</p>
        </div>
    </div>
</section>