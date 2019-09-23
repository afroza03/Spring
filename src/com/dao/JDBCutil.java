/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class JDBCutil {
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Error "+ex);
        }
    }
    
    public static Connection getConnection() throws Exception{
    
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/eva","root", "root");
   
    }
    
}
