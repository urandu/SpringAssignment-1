<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: obiero
  Date: 5/8/2015
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>View Drugs</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

</head>
<body class="body">


<div>
    <a href="/drug">Drug list</a>&NonBreakingSpace;<a href="/">Home</a>
</div>
<br>
<table class="table " >
    <tr>
        <th >Drug</th>
        <th >Patient ID</th>
        <th >Patient Name</th>
        <th >Date of Birth</th>
    </tr>
<c:forEach var="drug_patient" items="${drugPatient}">


      <tr>
          <td>${drug_patient.dname}</td>
        <td>${drug_patient.patient.id}</td>
        <td>${drug_patient.patient.fname} ${dp.patient.lname}</td>
        <td>${drug_patient.patient.dob}</td>
      </tr>

</c:forEach>
</table>
</body>
</html>
