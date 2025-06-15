<?php
$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
$op = $_POST['op'];

switch ($op) {
    case '+':
        $result = $num1 + $num2;
        break;
    case '-':
        $result = $num1 - $num2;
        break;
    case '*':
        $result = $num1 * $num2;
        break;
    case '/':
        $result = $num2 != 0 ? $num1 / $num2 : "Cannot divide by zero";
        break;
    case '%':
        $result = $num2 != 0 ? $num1 % $num2 : "Cannot divide by zero";
        break;
    default:
        $result = "Invalid operator";
}

echo "Result: $num1 $op $num2 = $result";
?>