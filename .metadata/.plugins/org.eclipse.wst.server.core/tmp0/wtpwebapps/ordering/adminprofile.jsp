<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <!-- Important to make website responsive -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>



    <!-- Link our CSS file -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js">
    
    
    <link rel="stylesheet" href="profile.css">
     <link rel="stylesheet" href="homestyle.css">
     
     <style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
</style>
<title>Insert title here</title>
</head>
<body>

 
  
   <!-- Navbar Section Starts Here -->
    <section class="navbar">
        <div class="container">
            <div class="logo">
                <a href="#" title="Logo">
                    
                </a>
                
                <div class="customer-info">
            
            </div>
            </div>
            
            

            <div class="list-container">
             <ul>
            <li><a class="active" href="#home">Admin</a></li>
            <li><a href="Home.jsp">Web Site</a></li>
            <li><a href="driverinsert.jsp">Create Driver</a></li>
           <li><a href="staffinsert.jsp">Create Staff</a></li>
           </ul>


   
</div>

            <div class="clearfix"></div>
        </div>
    </section>
    <!-- Navbar Section Ends Here -->

    
    

    

    <!-- user profile Section Starts Here -->
    <section class="userp">
    
    <div class="container rounded bg-white mt-5 mb-5">
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold"><c:forEach var="adm" items="${admDetails}">${adm.aname}</p></span><span class="text-black-50">${adm.aemail}</c:forEach></span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
        
        
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Admin Profile Settings</h4>
                </div>
                
                <div class="row mt-3">
               
                  <c:forEach var="adm" items="${admDetails}"> 
                  
                  <c:set var="id" value="${adm.aid}"/>
                  <c:set var="name" value="${adm.aname}"/>
                  <c:set var="email" value="${adm.aemail}"/>
                  <c:set var="phone" value="${adm.aphone}"/>
                  <c:set var="username" value="${adm.ausername}"/>
                  <c:set var="password" value="${adm.apassword}"/>
                 
                       
                  
                   
                    <div class="col-md-12"><label class="labels">id</label><input type="text" class="form-control" placeholder="enter phone number" readonly="readonly" value="${adm.aid}"></div>
                    
                    <div class="col-md-12"><label class="labels">Name</label><input type="text" class="form-control"  readonly="readonly" value="${adm.aname}"></div>
                    <div class="col-md-12"><label class="labels">email</label><input type="text" class="form-control"  readonly="readonly" value="${adm.aemail}"></div>
                    <div class="col-md-12"><label class="labels">Phone</label><input type="text" class="form-control"  readonly="readonly" value="${adm.aphone}"></div>
                    <div class="col-md-12"><label class="labels">User name</label><input type="text" class="form-control"  readonly="readonly" value="${adm.ausername}"></div>
                    <div class="col-md-12"><label class="labels">Password</label><input type="text" class="form-control" readonly="readonly" value="${adm.apassword}"></div>
                    
                   </c:forEach>             
               
                </div>
              <c:url value="updateadmin.jsp" var="admupdate">
              <c:param name="id" value="${id}"/>
              <c:param name="name" value="${name}"/>
              <c:param name="email" value="${email}"/>
              <c:param name="phone" value="${phone}"/>
              <c:param name="uname" value="${username}"/>
              <c:param name="pass" value="${password}"/>
             </c:url>

            <div class="mt-5 text-center">
            <a href="${admupdate}">
            <button class="btn btn-primary profile-button" type="button">Update profile</button>
            </a>
            </div>
            
            
               <c:url value="deleteadmin.jsp" var="admdelete">
              <c:param name="id" value="${id}"/>
              <c:param name="name" value="${name}"/>
              <c:param name="email" value="${email}"/>
              <c:param name="phone" value="${phone}"/>
              <c:param name="uname" value="${username}"/>
              <c:param name="pass" value="${password}"/>
             </c:url>
 
            <div class="mt-5 text-center"><a href="${admdelete}"><button class="btn btn-primary profile-button" type="button">Delete Account</button></a></div>
            </div>
        </div>
        <div class="col-md-4">
            
        </div>
    </div>
</div>
</div>
</div>
    
        
    </section>
    <!-- fOOD Menu Section Ends Here -->

    <!-- social Section Starts Here -->
    <section class="social">
        <div class="container text-center">
            <ul>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/50/000000/facebook-new.png"/></a>
                </li>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/48/000000/instagram-new.png"/></a>
                </li>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/48/000000/twitter.png"/></a>
                </li>
            </ul>
        </div>
    </section>
    <!-- social Section Ends Here -->
    
    

    <!-- footer Section Starts Here -->
    <section class="footer">
        <div class="container text-center">
            <p>All rights reserved. Designed By <a href="#"></a></p>
        </div>
    </section>
    <!-- footer Section Ends Here -->

</body>
</html>