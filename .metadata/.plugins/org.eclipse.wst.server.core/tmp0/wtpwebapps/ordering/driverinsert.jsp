<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Important to make website responsive -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>

    <!-- Link our CSS file -->
    
    <link rel="stylesheet" href="homestyle.css">
     <link rel="stylesheet" href="driver.css">
     
     <style>
     .button {
            padding: 15px 30px;
            font-size: 18px;
            background-color: #333;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            text-decoration: none;
            margin: 10px;
        }
        .button:hover {
            background-color: #555;
        }
        </style>
   
</head>

<body>

<a href="interface.jsp" class="button">Go Back</a>

    <!-- Navbar Section Starts Here -->
    <section class="navbar">
        <div class="container">
            <div class="logo">
                <h1 font-colot>Driver Page</h1>
            </div>

            <div class="menu text-right">
                <ul>
                    <li>
                        <a href="driverinsert.jsp">Add Driver</a>
                    </li>
                    <li>
                        <a href="Home.jsp">Home</a>
                    </li>
                    <li>
                        <a href="driverlogin.jsp">Login</a>
                    </li>
                    
                </ul>
            </div>

            <div class="clearfix"></div>
        </div>
    </section>
    <!-- Navbar Section Ends Here -->

    <!-- fOOD sEARCH Section Starts Here -->
    <section class="food-search">
        <div class="container">
            
            <h2 class="text-center text-white">Add driver in System</h2>

            <form action="insertdri" method="post" class="order">
              
                
                <fieldset>
                    <legend>Add Driver</legend>
                    <div class="order-label">Full Name</div>
                    <input type="text" name="dname" placeholder="E.g. Ravindu Bandara" class="input-responsive" required>

                    <div class="order-label">Phone Number</div>
                    <input type="text" name="dphone" placeholder="E.g. 07130xxxxxx" class="input-responsive" required>

                    <div class="order-label">Email</div>
                    <input type="email" name="demail" placeholder="E.g. ravi@gmail.com" class="input-responsive" required>

                    <div class="order-label">Address</div>
                    <textarea name="daddress" rows="10" placeholder="E.g. Street, City, Country" class="input-responsive" required></textarea>

                    <input type="submit" name="submit" value="Create Account" class="btn btn-primary">
                </fieldset>

            </form>

        </div>
    </section>
    <!-- fOOD sEARCH Section Ends Here -->

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