package JDBCLearn;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("JDBC Learn");
        String dbUrl = "jdbc:mysql://localhost:3306/demo";// demo si the name of the data base !!
        String user = "admin";
        String pass = "admin";
        Connection myConn = null;
        Statement myStm = null;
        ResultSet resultSet = null;
         try {
             myConn = DriverManager.getConnection(dbUrl,user,pass);
             System.out.println("Connection success !!!");

             DatabaseMetaData databaseMetaData = myConn.getMetaData();
             System.out.println("name:" + databaseMetaData.getDatabaseProductName() + "\n" +
                                "JDBC driver"+ databaseMetaData.getDriverVersion() + " " + databaseMetaData.getDriverName());
             /*Create a statement */
             myStm = myConn.createStatement();
             /*Method .executeQuery(Query SQL)
             * - return a result object */
             resultSet = myStm.executeQuery("select * from employees");

             String sql = "update employees set resume=?" +"where email='paul.smith@foo.com'";
             PreparedStatement myStmt = myConn.prepareStatement(sql);
             File file = new File("Contract_studii_licenta_engleza_2020_2021.pdf");
             System.out.println("Read file from :" + file.getAbsolutePath());
             FileInputStream input = new FileInputStream(file);
             myStmt.setBinaryStream(1,input);
             myStmt.executeUpdate();

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

         try{

             int rows = myStm.executeUpdate(
                     "insert into employees" +
                     "(last_name,first_name,email,department,salary)" +
                     "values" +
                     "('Mihai','Mihai','mihai@andrei@gmail.com','Software Developer','120000.0')");

             resultSet = myStm.executeQuery("select * from employees");
             while (resultSet.next()){
                 System.out.println(resultSet.getInt("id") +" " +
                         resultSet.getString("last_name")+ " " +
                         resultSet.getString("first_name") + " " +
                         resultSet.getString("email") + " " +
                         resultSet.getString("department") + " " +
                         resultSet.getString("salary"));
             }

//             myConn.setAutoCommit(false);
//
//             if (askUser()){
//                 myConn.commit();
//             }
//             else{
//                 myConn.rollback();
//
//             }





         }catch (Exception e){
             System.out.println(e);
         }
         finally {
             try {
                 myConn.close();
             }
             catch (Exception e){
                 System.out.println("Closing Connection:" + e);
             }
         }
    }

    public static boolean askUser(){
        System.out.println("Do you want to commit ?");
        String answer = scanner.nextLine();

        switch (answer){
            case "yes":{
                System.out.println("Commit");
                return  true;}
            case "no":{
                System.out.println("Not commit");
                return false;}
            default:{
                System.out.println("default");
                return false;}
        }
    }
}
