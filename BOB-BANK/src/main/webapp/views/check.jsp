<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="path/to/bootstrap/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 56px; /* Adjust based on your navbar height */
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #dee2e6;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #007bff; /* Blue header color */
            color: #ffffff; /* White text color */
        }
    </style>
    <!-- Include Bootstrap JS and jQuery -->
    <script src="path/to/jquery/jquery.min.js"></script>
    <script src="path/to/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light fixed-top">
    <a style="text-decoration: none;" class="navbar-brand" href="/">BOB_BANK</a>
</nav>

<div class="container mt-5">
    <table class="table">
        <thead>
            <tr>
                <th>Account_Number</th>
                <th>Name</th>
                <th>Password</th>
                <th>Previous Balance</th>
                <th>Current Balance</th>
                <th>Address</th>
                <th>Mobile Number</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${entity.account_Number}</td>
                <td>${entity.name}</td>
                <td>${entity.password}</td>
                <td>${entity.previous_Balance}</td>
                <td>${entity.current_Balance}</td>
                <td>${entity.address}</td>
                <td>${entity.mobile_Number}</td>
                <td>${entity.status}</td>
            </tr>
        </tbody>
    </table>
</div>

</body>
</html>
