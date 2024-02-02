<?php
$servername = 'localhost';
$username = 'root';
$password = '';
$dbname = 'test';
// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if (!$conn) {
    die("Connection Error: " . mysqli_connect_error());
}
$sql = "SELECT * FROM Student";
$query = mysqli_query($conn, $sql);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>
</head>

<body>
    <table border="1">
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Gender</th>
            <th>Class</th>
            <th>Roll-No</th>
            <th>Batch-no</th>
        </tr>
        <?php
        while ($row = mysqli_fetch_assoc($query)) {
        ?>
        <tr>
            <td><?php echo $row['firstname']; ?></td>
            <td><?php echo $row['lastname']; ?></td>
            <td><?php echo $row['gender']; ?></td>
            <td><?php echo $row['class']; ?></td>
            <td><?php echo $row['rollnumber']; ?></td>
            <td><?php echo $row['batch']; ?></td>
        </tr>
        <?php
        }
        ?>
    </table>
</body>
</html>
