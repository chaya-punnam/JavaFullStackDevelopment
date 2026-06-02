<html>
<head>
    <title>Add Student</title>
</head>

<body>

<h2>Add Student</h2>

<form action="addStudent" method="post">

    Student ID:
    <input type="number" name="id" required>

    <br><br>

    Student Name:
    <input type="text" name="name" required>

    <br><br>

    Course:
    <input type="text" name="course" required>

    <br><br>

    <input type="submit" value="Add Student">

</form>

<br>

<a href="viewStudents">View Students</a>

</body>
</html>