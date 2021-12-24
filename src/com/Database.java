package com;
import com.fasterxml.jackson.core.JsonProcessingException;
import nosqlite.utilities.Utils;

import java.sql.*;


public class Database {

    private Connection conn;

    public Database() {

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:NewsFeed.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Articles getArticle(int id, String name){
        Articles article = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article\n" +
                    "WHERE Article.article_id = ? AND Article.name = ?");

            stmt.setInt(1,id);
            stmt.setString(2,name);

            ResultSet rs = stmt.executeQuery();

            Articles[] articleFromRs = (Utils.resultSetToObject(rs,Articles[].class));

            article = articleFromRs [0];

            return article;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return article;
    }

    public void createArticle(Articles article){
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO Article (name, content)\n" +
                    "VALUES(?, ?)");
            stmt.setString(1,article.getName());
            stmt.setString(2,article.getContent());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
