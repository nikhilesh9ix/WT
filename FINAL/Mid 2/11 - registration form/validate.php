<?php
$name = $_POST['name'];
$password = $_POST['password'];
$email = $_POST['email'];
$phone = $_POST['phone'];

$errors = [];

// Name: Only alphabets and at least 6 characters
if (!preg_match("/^[a-zA-Z]{6,}$/", $name))
    $errors[] = "Name must be at least 6 alphabets.";

// Password: Minimum 6 characters
if (strlen($password) < 6)
    $errors[] = "Password must be at least 6 characters.";

// Email: Standard pattern
if (!filter_var($email, FILTER_VALIDATE_EMAIL))
    $errors[] = "Invalid email format.";

// Phone: Exactly 10 digits
if (!preg_match("/^[0-9]{10}$/", $phone))
    $errors[] = "Phone number must be exactly 10 digits.";

if (empty($errors)) {
    echo "All inputs are valid!";
} else {
    foreach ($errors as $e) echo "$e<br>";
}
?>