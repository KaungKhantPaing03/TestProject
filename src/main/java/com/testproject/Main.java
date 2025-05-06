package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //1. Connection
    private Connection get_Db_Connection(){
        Connection con = null;
        String dataBaseUrl = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Checking Connector Driver
            con  = DriverManager.getConnection(dataBaseUrl,username,password);
            System.out.println("Database is connected");
        }
        catch (ClassNotFoundException cne){
            System.out.println(cne.getMessage());
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
         catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.get_Db_Connection();
        try{
            con.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


        //2. Statement
        //3. Resultset (Not for insert, delete) Index start at 1 not 0
        //4. Close
    }
}