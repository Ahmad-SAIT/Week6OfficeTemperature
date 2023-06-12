<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Office Temperature</title>
        <link rel="stylesheet" href="office_temperature.css">
    </head>
    <body>
        <h1>Current Office Temperature</h1>
        <div>
            The temperature is <span class="${in_range ? 'normal' : 'error'}">${office_temperature.officeTemperature}</span>.
        </div>
        <c:if test="${not in_range}">
            <div>Error: Office temperature is out of range.</div>
        </c:if>
        

    </body>
</html>