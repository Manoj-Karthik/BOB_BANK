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
        h1 {
            color: red;
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
    <center>
        <h1 style="color: red;">${closing}</h1>
    </center>
</div>

</body>
</html>
