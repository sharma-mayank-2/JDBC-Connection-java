# JDBC-Connection-java

working example of a JDBC connection to mysql.
there are in total 5 steps for connection

Step 1) initialize a Driver class at run time.

Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/xyz", "root", "password");
url = "jdbc:mysql://localhost/xyz", "root", "password"

url explained below

Step 2) creating a connection
* mysql -> is a database
* localhost -> is a server where mysql is running
* xyz -> is a name of a database
* root -> is a userName

step 3) creating a query

step 4) execute a query

step 5) connection close