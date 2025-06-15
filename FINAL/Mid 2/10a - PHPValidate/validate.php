<?php
  $servername = "localhost:3306";
  $username = "root";
  $password = "";
  $dbname = "webtech";

  $conn = new mysqli($servername,$username,$password,$dbname);

  if($conn->connect_error)
  {
      die("Connection failed: ".$conn->connect_error);
  }
 
  $stmt = $conn->prepare("SELECT * FROM peeps WHERE username=? and password=?");

  $stmt->bind_param("ss",$first,$last);
  $first = trim($_POST['username']);
  $last = trim($_POST['password']);

  $stmt->execute();

  $stmt->bind_result($u,$p);

  if($stmt->fetch()==false)
     echo "Sorry you are not an authorized user";
  else
     header("location:welcome.php");
 
  $stmt->close();
  $conn->close();
?>