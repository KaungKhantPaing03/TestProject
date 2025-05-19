package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //1. Connection
    private Connection db_connect() {
        Connection con = null;
        try {
            Thread.sleep(30000);
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        int attempt = 1;

        while(true) {
            try {
                Thread.sleep(5000);
                con = DriverManager.getConnection("jdbc:mysql://db:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
                System.out.println("Successful connected.");
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Fail to connect, attempt = " + attempt);
                attempt++;
            }
        }

        return con;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.db_connect();
        Database_Read dr  = new Database_Read(con);
        dr.read();
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