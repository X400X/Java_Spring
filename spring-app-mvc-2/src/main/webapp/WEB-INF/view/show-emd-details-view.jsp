<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>show details</title>
    </head>

    <body>
        <h2>Dear employee, your are welcome</h2>
        <br><br><br>
        <p>Employee name: ${employee.name}</p>
        <p>Employee surname: ${employee.surname}</p>
        <p>Employee phone number: ${employee.phoneNumber}</p>
        <p>Employee email: ${employee.email}</p>
        <p>Employee salary: ${employee.salary}</p>
        <p>Employee department: ${employee.department}</p>
        <p>Employee car: ${employee.carBrand}</p>
        <p>Employee language(s):
            <ul>
                <c:forEach var="lang" items="${employee.languages}">
                    <li>${lang}</li>
                </c:forEach>
            </ul>
    </body>
</html>