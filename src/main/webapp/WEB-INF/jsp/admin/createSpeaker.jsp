<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Speaker</h1>
        </div>
    </div>
</section>

<section>
    <div class="container">
<%--        <div class="row pt-5 justify-content-center">--%>
<%--            <div class="col-auto justify-content-center">--%>
<%--                <form class="card" style="width: 500px;" action="submit" method="post">--%>
<%--                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
<%--                    <div class="card-body p-3">--%>
<%--                        <div>--%>
<%--                            <label for="emailId" class="col-form-label">Email</label>--%>
<%--                            <input type="text" id="emailId" name="email"--%>
<%--                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"--%>
<%--                                   value="${form.email}">--%>
<%--                            <c:if test="${bindingResult.hasFieldErrors('email')}">--%>
<%--                                <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">--%>
<%--                                    <div class="text-danger">${error.defaultMessage}</div>--%>
<%--                                </c:forEach>--%>
<%--                            </c:if>--%>
<%--                        </div>--%>

<%--                        <div>--%>
<%--                            <label for="firstName" class="col-form-label">First Name</label>--%>
<%--                            <input type="text" id="firstName" name="firstname" class="form-control"--%>
<%--                                   value="${form.firstname}">--%>
<%--                        </div>--%>
<%--                        <div>--%>
<%--                            <label for="lastName" class="col-form-label">Last Name</label>--%>
<%--                            <input type="text" id="lastName" name="lastname" class="form-control"--%>
<%--                                   value="${form.lastname}">--%>
<%--                        </div>--%>
<%--                        <div>--%>
<%--                            <label for="organization" class="col-form-label">Organization</label>--%>
<%--                            <input type="text" id="organization" name="organization" class="form-control">--%>
<%--                        </div>--%>
<%--                        <div>--%>
<%--                            <label for="title" class="col-form-label">Title</label>--%>
<%--                            <input id="title" name="title" class="form-control">--%>

<%--                        </div>--%>
<%--                        <div>--%>
<%--                            <label for="about" class="col-form-label">About</label>--%>
<%--                            <input type="text" id="about" name="extension" class="form-control">--%>
<%--                        </div>--%>

<%--                        <div class="mt-5">--%>
<%--                            <button type="submit" class="btn btn-success w-100">Submit</button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--        </div>--%>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>