<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Booking Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
        .return-button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s;
        }
        .return-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Booking Successful</h1>

    <p>Book Details:</p>
    <p>Book Id : ${bid}</p>
    <p>Name: ${bname}</p>
    <p>Phone: ${bphone}</p>
    <p>Email: ${bemail}</p>
    <p>Address: ${baddress}</p>
    <p>Food Type : ${fType}</p>
    <p>Quantity: ${qty}</p>
    <p>Total Price: ${totalPrice}</p>

    <!-- Return to Home button -->
    <a href="Home.jsp" class="return-button">Return to Home</a>
</body>
</html>
