package db;

import model.Items;
import model.Users;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static Connection connection;

    public static void setConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlab_shop?useUnicode=true&serverTimezone=UTC","root","");
            System.out.println("successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Items> getAllItems(){
        List<Items> items=new ArrayList<>();
        try {
            PreparedStatement statement=connection.prepareStatement("select *from items");
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                Long id=resultSet.getLong("id");
                String name=resultSet.getString("name");
                String description=resultSet.getString("description");
                double price=resultSet.getDouble("price");
                items.add(new Items(id,name,description,price));
            }
        }catch (Exception e){e.printStackTrace();}
        return items;
    }

    public static Users getUser(String email){
        Users users=new Users();

        try {
            PreparedStatement statement=connection.prepareStatement("select *from users where email=?");
            statement.setString(1,email);
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next()){
               users=new Users(resultSet.getLong("id"),
                       resultSet.getString("email"),
                       resultSet.getString("password"),
                       resultSet.getString("full_name"));
            }else {
                users=null;
            }
        }catch (Exception e){e.printStackTrace();}
      return users;
    }

}
