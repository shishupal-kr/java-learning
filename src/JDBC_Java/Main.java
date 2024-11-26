package JDBC_Java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/family"; //replace this with you DATABASE NAME
    private static final String Username = "root";
    private static final String Password = "shishupal";

    public static void main(String[] args){
        //Loading Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //Creating Connection
        try { Connection connection = DriverManager.getConnection(URL,Username,Password);
            Statement statements = connection.createStatement();
            //Run Query Here
            String query1 = "SELECT * FROM family_detail";

            //printing of data
            ResultSet result = statements.executeQuery(query1);
            while (result.next()) {
                int id = result.getInt("id");
                String Name = result.getString("Name");
                String Father_Name = result.getString("Father_Name");
                String Mobile_No = result.getString("Mobile_No");

                System.out.println("ID :" + id);
                System.out.println("Name :" + Name);
                System.out.println("Father_Name :" + Father_Name);
                System.out.println("Mobile_No :" + Mobile_No);
            }
            result.close();
            statements.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}