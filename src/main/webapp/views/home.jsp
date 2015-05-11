<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title>Patient Details</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

</head>
<body class="body">

<div>
    <a href="/drug">Drug list</a>&NonBreakingSpace;<a href="/">Home</a>
</div>
<br>

<form class="form" action="<c:url value='/create' />" method="post">
    <label for="fname">First Name:</label>
    <input type="text" name="fname" id="fname" required>

    <label for="lname">Last Name:</label>
    <input type="text" name="lname" id="lname" required>

    <label for="bdate">Date of birth:</label>
    <input type="date" name="bdate" id="bdate" required>
    <button>Submit</button>

</form>
<br/>

<c:if test="${!empty listPatient}">
    <table class="table" >
        <tr>
            <th >Patient ID</th>
            <th >Patient Name</th>
            <th >Date of Birth</th>
            <th >&nbsp;</th>
        </tr>
        <c:forEach items="${listPatient}" var="patient">
            <tr>
                <td>${patient.id}</td>
                <td>${patient.fname} ${patient.lname}</td>
                <td>${patient.dob}</td>
                <td><a href="<c:url value='/add_drug?patient_id=${patient.id}' />" >Add Drug</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
