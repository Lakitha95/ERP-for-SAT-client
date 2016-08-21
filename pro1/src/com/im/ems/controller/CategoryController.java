/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.ems.controller;

import com.im.ems.model.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lakitha
 */
public class CategoryController {

    public static boolean create(Category category) {

        String createsql = "INSERT INTO category(category_name) VALUES('" + category.getName() + "')";
        try {
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "";

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, un, pw);

            Statement stmt = c.createStatement();
            stmt.executeUpdate(createsql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean update(Category category) {
        String updatesql = "UPDATE category SET category_name = '+category.getName()+' WHERE category_id='+category.getId()+'";
        try {
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "";

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, un, pw);

            Statement stmt = c.createStatement();
            stmt.executeUpdate(updatesql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static Category retrievecat(int id) {
        Category category = new Category();
        try {
            String retrievesql = "select * from  category where id = '" + id + "'";
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "";

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, un, pw);

            Statement stmt = c.createStatement();
            ResultSet rslt = stmt.executeQuery(retrievesql);

            if (rslt.next()) {
                String name = rslt.getString("category_name");
                category.setName(name);
                category.setId(id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    public static boolean delete(Category category) {
        String deletesql = "DELETE FROM category WHERE category_name = '+category.getName()+'";
        try {
            String url = "jdbc:mysql://localhost:3306/dbems";
            String un = "root";
            String pw = "";

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, un, pw);

            Statement stmt = c.createStatement();
            stmt.executeUpdate(deletesql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
