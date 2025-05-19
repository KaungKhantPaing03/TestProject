package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private String ip = "localhost";
    private String port = "3306";
    private String dbname = "testdb";
    private String username = "root";
    private String password = "";
    //1. Connection
    protected Connection db_connect() {

        Connection con = null;
        try {
            Thread.sleep(30000);
            Class.forName("com.mysql.cj.jdbc.Driver"); //Check for driver exists or not
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        int attempt = 1;

        while(true) {
            try {
                Thread.sleep(5000);
                con = DriverManager.getConnection("jdbc:mysql://"+ip+":"+port+"/"+dbname, username, password);
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
            if(con != null) {
                con.close();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


        //2. Statement
        //3. Resultset (Not for insert, delete) Index start at 1 not 0
        //4. Close
    }
}