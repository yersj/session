package db;

import model.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static Connection connection;

    public static void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlab_shop?useUnicode=true&serverTimezone=UTC", "root", "");
            System.out.println("DB connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Items> getItems() {
        List<Items> list=new ArrayList<>();
        try {
            PreparedStatement statement=connection.prepareStatement("select  * from items");
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                list.add(new Items(resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
