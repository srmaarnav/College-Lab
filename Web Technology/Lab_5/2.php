<?php
$servername = 'localhost';
$username = 'root';
$password = 'root';
$dbname = 'Student';

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection error: " . $conn->connect_error);
}

// SQL to create table 'Class'
$sqlClass = "CREATE TABLE IF NOT EXISTS Class (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
)";

if (mysqli_query($conn, $sqlClass)) {
    echo "Table 'Class' created successfully<br>";
} else {
    echo "Error creating table 'Class': " . mysqli_error($conn) . "<br>";
}

// SQL to create table 'Batch'
$sqlBatch = "CREATE TABLE IF NOT EXISTS Batch (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
)";

if (mysqli_query($conn, $sqlBatch)) {
    echo "Table 'Batch' created successfully<br>";
} else {
    echo "Error creating table 'Batch': " . mysqli_error($conn) . "<br>";
}

// Close connection
mysqli_close($conn);
?>