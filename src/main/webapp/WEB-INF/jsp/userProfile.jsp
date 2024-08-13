<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="include/header.jsp" />

<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

<h1 class="page-title">Your Dashboard</h1>



<div class="table-container">
    <h3> Saved Resources: </h3>
    <table class="table table-bordered">
<thead>
<tr>
    <th>Type</th>
    <th>Description</th>
    <th>Link</th>
    <th></th>
</tr>
</thead>
<tbody>
    <c:forEach items="${userResources}" var="userResource">
        <tr>
            <td>${userResource.resource.type}</td>
            <td>${userResource.resource.description}</td>
            <td><a href=${userResource.resource.link}>${userResource.resource.link}</a></td>
            <td class="text-center align-content-center">
                <a class="material-symbols-outlined" id="remove-button" href="/user/${userResource.id}/remove" >remove</a></td>

        </tr>
    </c:forEach>
</tbody>
    </table>
</div>
<h3>Contacted Speakers: </h3>
<jsp:include page="include/footer.jsp" />
