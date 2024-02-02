<?php
$servername = 'localhost';
$username = 'root';
$password = 'root';
$dbname = 'Student';

// Create_Connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check_Connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// SQL to create table
$sql = "CREATE TABLE Table1 (
    ID int,
    Firstname Varchar(255),
    Lastname VARCHAR(255),
    Gender BOOLEAN,
    Semester int,
    Symbol VARCHAR(255),
    Batch int
)";

// Check if the table creation query was successful
if (mysqli_query($conn, $sql)) {
    echo "Table 'Table1' created successfully";
} else {
    echo "Error creating table: " . mysqli_error($conn);
}

// Close the connection
mysqli_close($conn);
?>