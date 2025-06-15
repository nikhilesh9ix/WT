<?php
session_start();
$conn = mysqli_connect("localhost", "root", "", "test");
$username = $_POST['username'];
$password = $_POST['password'];

$_SESSION['username'] = $username;
$_SESSION['password'] = $password;

$q = mysqli_query($conn, "SELECT * FROM users WHERE username='$username'");
if (mysqli_num_rows($q) > 0) {
    $row = mysqli_fetch_assoc($q);
    if ($row['password'] == $password)
        echo "Welcome, " . $row['fullname'];
    else
        echo "Password mismatch";
} else {
    header("Location: register.html");
}
?>
