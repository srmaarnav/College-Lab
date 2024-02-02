<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Validation</title>
</head>

<body>

    <form id="myForm" action="process_form.php" method="post" onsubmit="return validateForm()">
        <label for="firstname">First Name:</label>
        <input type="text" id="firstname" name="firstname"><br><br>

        <label for="lastname">Last Name:</label>
        <input type="text" id="lastname" name="lastname"><br><br>

        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label><br><br>

        <label for="class">Class:</label>
        <select id="class" name="class">
            <option value="">Select Class</option>
            <option value="1">Class 1</option>
            <option value="2">Class 2</option>
            <!-- Add more class options as needed -->
        </select><br><br>

        <label for="rollnumber">Roll Number:</label>
        <input type="text" id="rollnumber" name="rollnumber" title="Please enter a 4-digit number"><br><br>

        <label for="batch">Batch:</label>
        <select id="batch" name="batch">
            <option value="">Select Batch</option>
            <option value="A">Batch A</option>
            <option value="B">Batch B</option>
            <!-- Add more batch options as needed -->
        </select><br><br>

        <input type="submit" value="Submit">
    </form>

    <script>
    function validateForm() {
        // Get values from the form
        const firstname = document.getElementById('firstname').value;

        const lastname = document.getElementById('lastname').value;

        // Get the selected class value
        const selectedClass = document.getElementById('class').value;

        // Get the roll number
        const rollnumber = document.getElementById('rollnumber').value;

        // Get the selected batch value
        const selectedBatch = document.getElementById('batch').value;

        // Detailed validation
        if (firstname === "" || lastname === "" || !gender || selectedClass === "" || rollnumber === "" ||
            selectedBatch === "") {
            alert("All fields must be filled out");
            return false;
        }


        return true;
    }
    </script>

</body>

</html>