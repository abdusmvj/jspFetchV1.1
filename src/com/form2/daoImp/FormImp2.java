/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form2.daoImp;

import com.form2.bean.Form2;
import com.form2.connection.Formconnect2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author skb
 */
public class FormImp2  {
    
    public  int saveDetails (Form2 ff)
    {
        
        
            int resultstatus = 0;
            Connection con = null;
            PreparedStatement ps = null;
            try {
                con = Formconnect2.fconnect();
                 ps = con.prepareStatement("select * from form2 where email=? and password=?");
               
               ps.setString(1, ff.getEmail());
               ps.setString(2, ff.getPd());  
                 
                 //ps.setString(1,"raj@gmail.com");
                 //ps.setString(2,"123");
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                ff.setUn(rs.getString("username"));
                
                
                }

            resultstatus = ps.executeUpdate();

            }catch (Exception exp) {
            System.out.println(exp);
            }
        return resultstatus;
    }
    
    public static void main(String[] args) {
        FormImp2 fi=new FormImp2();
        Connection con=null;
        con=Formconnect2.fconnect();
        System.out.println(con);
        
        Form2 f2=new  Form2();
        fi.saveDetails(f2);
        
        System.out.println(f2.getUn());
    }
}
    
