/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class dbconnector {
        Connection cn;

    public dbconnector() {
        try{
        cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","");
        }catch(SQLException er){System.out.println("Cannot Connect To DB"+er.getMessage());}
    }
    
    public ResultSet getData(String sql) throws SQLException{
      Statement st = (Statement) cn.createStatement(); 
      ResultSet rs = st.executeQuery(sql); 
      return rs;
    }
    
}

    
