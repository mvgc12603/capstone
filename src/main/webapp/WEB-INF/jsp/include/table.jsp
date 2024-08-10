<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="table-container">
<table class="table table-hover table-bordered">
    <thead>
    <tr>
        <th>Type</th>
        <th>Description</th>
        <th>Link</th>

        <sec:authorize access="isAuthenticated()">
        <th>Save</th>
        </sec:authorize>
    </tr>
    </thead>
    <tbody>
<%--1st is key (List<Resource> linked from controller), second is element--%>
    <c:forEach items="${resources}" var="resource">
        <tr>
            <td>${resource.type}</td>
            <td>${resource.description}</td>
            <td>${resource.link}</td>
            <sec:authorize access="isAuthenticated()">
            <td class="text-center align-content-center"><a class="btn" href="/user/${userId}/resource/${resource.id}/add">+</a></td>
            </sec:authorize>
        </tr>
    </c:forEach>

    </tbody>
</table>

</div>