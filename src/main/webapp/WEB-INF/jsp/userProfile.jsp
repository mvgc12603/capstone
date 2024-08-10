<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="include/header.jsp" />

<h1 class="page-title">This is user profile JSP page</h1>

<h3> Saved Resources:

<c:forEach items="${userResources}" var="userResource">
    ${userResource.resource.id}
    ${userResource.resource.description}
    ${userResource.resource.link}
</c:forEach>
</h3>

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