package JDBC_Java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class IUD_Data {
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

              //Run Query Here to UPDATE
               //String Insert = String.format("INSERT INTO Family_Detail(name,father_name,age) VALUES('%s', '%s', %o)","Rukkhi","paswan",25 );
             String Update = String.format("UPDATE Family_Detail SET Mobile_No = '%s' WHERE id = %o","8409074222",4);
             // String Delete = String.format("DELETE FROM family_detail where id = 6");


             //printing of data
             int result = statements.executeUpdate(Update); //change
             if(result > 0){
                System.out.println("Data Inserted Succesfully!!");
            }else {
                System.out.println("Data Not Inserted!!");
            }
            statements.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}