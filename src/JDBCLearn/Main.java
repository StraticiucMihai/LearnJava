package JDBCLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        System.out.println("JDBC Learn");
        String dbUrl = "jdbc:mysql://localhost:3306/demo";// demo si the name of the data base !!
        String user = "admin";
        String pass = "admin";
        Connection myConn;
        Statement myStm;
        ResultSet resultSet;
         try {
             myConn = DriverManager.getConnection(dbUrl,user,pass);
             System.out.println("Connection success !!!");
             /*Create a statement */
             myStm = myConn.createStatement();
             /*Method .executeQuery(Query SQL)
             * - return a result object */
             resultSet = myStm.executeQuery("select * from employees");

             /*
             * Method resultSet.next()
             * - moves forward one row
             * + return true if there are more rows to process*/
             while (resultSet.next()){
                 System.out.println(resultSet.getInt("id") +" " +
                                    resultSet.getString("last_name")+ " " +
                                    resultSet.getString("first_name") + " " +
                                    resultSet.getString("email") + " " +
                                    resultSet.getString("department") + " " +
                                    resultSet.getString("salary"));
             }

         }
         catch (Exception e)
         {
             System.out.println(e);
         }
    }
}
