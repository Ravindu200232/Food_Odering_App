<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Select User Type</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #000;
            color: #fff;
            text-align: center;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
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
    <h1>Select User Type</h1>
    <a href="adminlogin.jsp" class="button">Admin</a>
    <a href="stafflogin.jsp" class="button">Staff</a>
    <a href="driverlogin.jsp" class="button">Driver</a>
</body>
</html>
