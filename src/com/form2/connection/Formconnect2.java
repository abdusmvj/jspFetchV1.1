/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form2.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author skb
 */
public class Formconnect2 {
    
    static String driver = "oracle.jdbc.driver.OracleDriver";
    static String url ="jdbc:oracle:thin:@localhost:1521:xe";
    static String user_name="system";
    static String password="skb888";
    

public static Connection fconnect(){
        Connection con = null;
        try 
        {
              Class.forName(driver);
                      
              con = DriverManager.getConnection(url,user_name,password);
            }
                    catch(Exception exp)
                    {
                    System.out.println(exp);
                    }
            return con;
                                        
        }
}

