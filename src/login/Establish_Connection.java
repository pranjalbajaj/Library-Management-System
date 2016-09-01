/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Pranjal
 */
public class Establish_Connection {
    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    public PreparedStatement pst1;
    public ResultSet rs;
    
    public  Establish_Connection()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","pranjal","pranjal");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
}
