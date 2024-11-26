package JDBC_Java;
import java.sql.*;

public class IUD_PreparedStatement {
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
            System.out.println("Driver Not Found"+ e.getMessage());
        }
        //Creating Connection
        try { Connection connect = DriverManager.getConnection(URL,Username,Password);
            String Insert = "INSERT INTO Family_Detail(Name, Father_Name, Age ,Mobile_No) VALUES(?,?,?,?)";
            PreparedStatement prepstate = connect.prepareStatement(Insert);
            prepstate.setString(1,"sudhir");
            prepstate.setString(2,"Kamlesh Paswan");
            prepstate.setInt(3,26);
            prepstate.setInt(4,620073675);

            int result = prepstate.executeUpdate(); //change
            if(result > 0){
                System.out.println("Data Inserted Succesfully!!");
            }else {
                System.out.println("Data Not Inserted!!");
            }
            connect.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}