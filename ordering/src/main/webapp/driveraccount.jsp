<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="dri" items="${driDetails}">
  
                    ${dri.did}<br>
                    ${dri.dname}<br>
                    ${dri.dphone}<br>
                      ${dri.demail}<br>
                        ${dri.daddress}<br>
                    
 
  
</c:forEach>

</body>
</html>