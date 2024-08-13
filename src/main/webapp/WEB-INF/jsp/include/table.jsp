<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js">
</script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />



<div class="table-container">
<table class="table table-bordered">
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
            <td><a href=${resource.link}>${resource.link}</a></td>
            <sec:authorize access="isAuthenticated()">
            <td class="text-center align-content-center">
                <a class="material-symbols-outlined" id="add-button" value="${resource.id}" href="/user/${userId}/resource/${resource.id}/add">add</a></td>
            </sec:authorize>
        </tr>
    </c:forEach>

    </tbody>
</table>

    <script>

    </script>

</div>