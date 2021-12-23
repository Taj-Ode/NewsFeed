package server;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private Connection conn;

    public Database() {

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:NewsFeed.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
