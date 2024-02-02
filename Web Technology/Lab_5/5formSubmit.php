<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test"; 

// Create connection
$conn = mysqli_connect($servername, $username, $password);

// Check connection
if (!$conn) {
    die("Connection error: " . mysqli_connect_error());
}

// Create database if it doesn't exist
$sqlCreateDatabase = "CREATE DATABASE IF NOT EXISTS $dbname";
if (mysqli_query($conn, $sqlCreateDatabase)) {
    echo "Database created successfully or already exists<br>";
} else {
    echo "Error creating database: " . mysqli_error($conn) . "<br>";
}

// Select the database
mysqli_select_db($conn, $dbname);

// Create 'Student' table
$sqlCreateTable = "CREATE TABLE Student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    gender VARCHAR(10),
    class VARCHAR(255),
    rollnumber VARCHAR(20),
    batch VARCHAR(20)
)";

if (mysqli_query($conn, $sqlCreateTable)) {
    echo "Table created successfully or already exists<br>";
} else {
    echo "Error creating table: " . mysqli_error($conn) . "<br>";
}

// Check if the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $firstname = $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $gender = $_POST['gender'];
    $class = $_POST['class'];
    $rollnumber = $_POST['rollnumber'];
    $batch = $_POST['batch'];

    // Insert values into the 'Student' table
    $sqlInsert = "INSERT INTO Student (firstname, lastname, gender, class, rollnumber, batch)
                  VALUES ('$firstname', '$lastname', '$gender', '$class', '$rollnumber', '$batch')";

    // Check the insertion query
    if (mysqli_query($conn, $sqlInsert)) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $sqlInsert . "<br>" . mysqli_error($conn);
    }
}


// Close connection
mysqli_close($conn);
?>