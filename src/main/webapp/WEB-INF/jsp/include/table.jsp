<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="table-container">
<table class="table table-hover table-bordered">
    <thead>
    <tr>
        <th>Type</th>
        <th>Link</th>
        <th>Description</th>
        <sec:authorize access="isAuthenticated()">
        <th>Save</th>
        </sec:authorize>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${resource}" var="resource">
        <tr>
            <td>${resource.type}</td>
            <td>${resource.link}</td>
            <td>${resource.description}</td>
            <sec:authorize access="isAuthenticated()">
            <td class="text-center align-content-center"><button onclick="addToList()">+</button></td>
            </sec:authorize>
        </tr>
    </c:forEach>

    </tbody>
</table>

</div>