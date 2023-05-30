## MySql

Driver Class : com.mysql.cj.jdbc.Driver
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	String url = "jdbc:mysql://localhost:3306/ontap";

## MSSql Server

Driver Class : com.microsoft.sqlserver.jdbc.SQLServerDriver
	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	String url = "jdbc:sqlserver://localhost:1433/database=ontap;encrypt=true;trustServerCertificate=true;";