<?php
session_start();
$conn = mysqli_connect("localhost", "root", "", "test");
$username = $_SESSION['username'];
$password = $_SESSION['password'];
$fullname = $_POST['fullname'];

mysqli_query($conn, "INSERT INTO users VALUES('$username', '$password', '$fullname')");
echo "Registered Successfully as $fullname";
?>
