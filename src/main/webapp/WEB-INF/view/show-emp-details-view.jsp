<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, you are Welcome!!!</h2>
<br>
<br>
<%--Your name: ${param.employeeName}--%>
<%--Your name: ${empNameAttribute} ${destription}--%>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}

<br><br>
Your car: ${employee.carBrand}
<br><br>
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang}</li>
    </c:forEach>
</ul>
<br><br>
PhoneNumber: ${employee.phoneNumber}
<br><br>
Email; ${employee.email}
<br>
</body>
</html>