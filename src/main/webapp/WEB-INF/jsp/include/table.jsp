<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<div class="table-container">
<table class="table table-hover table-bordered">
    <thead>
    <tr>
        <th>Type</th>
        <th>Link</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${resource}" var="resource">
        <tr>
            <td>${resource.type}</td>
            <td>${resource.link}</td>
            <td>${resource.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</div>