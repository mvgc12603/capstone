<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="include/header.jsp" />

<h1 class="page-title">This is user profile JSP page</h1>



<div class="table-container">
    <h3> Saved Resources: </h3>
    <table class="table table-hover table-bordered">
<thead>
<tr>
    <th>Type</th>
    <th>Description</th>
    <th>Link</th>
</tr>
</thead>
<tbody>
    <c:forEach items="${userResources}" var="userResource">
        <tr>
            <td>${userResource.resource.type}</td>
            <td>${userResource.resource.description}</td>
            <td>${userResource.resource.link}</td>
        </tr>
    </c:forEach>
</tbody>
    </table>
</div>
<h3>Contacted Speakers: </h3>
<jsp:include page="include/footer.jsp" />


<%--<tr>--%>
<%--    <td>${resource.type}</td>--%>
<%--    <td>${resource.description}</td>--%>
<%--    <td>${resource.link}</td>--%>
<%--    <sec:authorize access="isAuthenticated()">--%>
<%--        <td class="text-center align-content-center"><a class="btn" href="/user/${userId}/resource/${resource.id}/add">+</a></td>--%>
<%--    </sec:authorize>--%>
<%--</tr>--%>