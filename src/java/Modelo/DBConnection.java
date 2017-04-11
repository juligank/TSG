/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
/**
 *
 * @author usuario
 */
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.driver.OracleDriver;



public class DBConnection
{
  public Connection conn = null;
  public String user = "HR";
  public String db = "jdbc:oracle:thin:@localhost:1521:XE";
  public String password = "1234";
  public String driver = "oracle.jdbc.driver.OracleDriver";
  
  public DBConnection() {}
  
  public void getConnection() { try { Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("Where is your Oracle JDBC Driver?");
    }
    try
    {
      Driver reg = new OracleDriver();
      DriverManager.registerDriver(reg);
    } catch (Exception e) {
      System.out.println("fallo el registro");
      e.printStackTrace();
    }
    try
    {
      conn = DriverManager.getConnection(db, user, password);
    } catch (SQLException e) {
      System.out.println("conexion fallida");
      e.printStackTrace();
    }
    
    if (conn != null) {
      System.out.println("exito");
    }
    else {
      System.out.println("falla");
    }
  }
  

  public void createStatement(String sqlStatement)
  {
    try
    {
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sqlStatement);
      
      while (rs.next())
      {
        String co = rs.getString(1);
        

        String country_name = rs.getString(2);
        System.out.println("" + co + " " + country_name);
      }
      
      rs.close();
      stmt.close();
    } catch (SQLException ex) {
      Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public void insertar(String sqlStatement)
  {
    try {
      Statement stms = conn.createStatement();
      ResultSet localResultSet = stms.executeQuery(sqlStatement);
    }
    catch (Exception localException) {}
  }
}