## JDBC Connection

### MySql

*Driver Class : `com.mysql.cj.jdbc.Driver`* <br/>
&nbsp; `DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());` <br/>
&nbsp; `String url = "jdbc:mysql://localhost:3306/ontap";`

### MSSql Server

*Driver Class : `com.microsoft.sqlserver.jdbc.SQLServerDriver`* <br/>
&nbsp; `DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());` <br/>
&nbsp; `String url = "jdbc:sqlserver://localhost:1433/database=ontap;encrypt=true;trustServerCertificate=true";`
