<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: obiero
  Date: 5/7/2015
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Drug</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

</head>
<body class="body">


<div>
    <a href="/drug">Drug list</a>&NonBreakingSpace;<a href="/">Home</a>
</div>
<br>
<c:if test="${empty msg}">
<div>
  <p>Name: ${patient.fname} ${patient.lname} </p>
    <p>Date Of Birth: ${patient.dob} </p>
    <br>
    <p>Allocate Drug</p>
    <form class="form" action="<c:url value='/save' />" method="post">
        <input type="hidden" name="patient_id" value="${patient.id}">
        <label for="dname">Drug Name:</label>
        <input type="text" name="dname" id="dname" required>
        <button>Issue Drug</button>
    </form>
</div>
</c:if>
<br/>
<c:if test="${!empty listDrug}">
    <p>List of Drugs</p>
    <table class="table" >
        <tr>
            <th >Drug ID</th>
            <th >Drug Name</th>

        </tr>
        <c:forEach items="${listDrug}" var="drug">
            <tr>
                <td>${drug.id}</td>
                <td>${drug.dname} </td>

            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
