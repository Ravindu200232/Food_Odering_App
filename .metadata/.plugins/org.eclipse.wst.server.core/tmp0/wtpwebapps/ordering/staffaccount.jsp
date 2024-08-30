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

<c:forEach var="stf" items="${stfDetails}">
  
                    ${stf.sid}<br>
                    ${stf.sname}<br>
                    ${stf.sphone}<br>
                      ${stf.semail}<br>
                        ${stf.saddress}<br>
                    
 
  
</c:forEach>

</body>
</html>