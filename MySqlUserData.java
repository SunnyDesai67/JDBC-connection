package src.com.carproject;

/*  1. import jdbc.sql
 *  2. load and register driver ---> com.mysql.jdbc.driver
 *  3. Create connection
 *  4. Create statement
 *  5. execute a query
 *  6. process the result
 *  7. close
 */

import java.sql.*;

public class MySqlUserData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        String url = "jdbc:mysql://localhost:3307/userinfo";
        String U_NAME = "root";
        String DB_PASSWORD = "Desaisunny";
        String QUERY = "SELECT * FROM userinfodata";

        //LOAD AND REGISTER THE DRIVER
        Class.forName("com.mysql.jdbc.Driver");

        //ESTABLISHING THE CONNECTION
        Connection connection = DriverManager.getConnection(url, U_NAME, DB_PASSWORD);

        //EXECUTE THE QUERY STATEMENT
        Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery(QUERY);

        resultSet.next();
        // RETURN THE FINAL RESULT INTO THE STRING
        String finalResult = resultSet.getString("SocialNumber");

        System.out.println(finalResult);

        statement.close();
        connection.close();
    }
}
