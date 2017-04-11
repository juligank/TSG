/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpleadoDAO
{
  DBConnection acceso;
  
  public EmpleadoDAO() {}

 
public Empleado verificaUsuario(String dni, String password, String privilegios)
  {
    Empleado empleado = null;
    DBConnection acceso = new DBConnection();
    acceso.getConnection();
    try {
      PreparedStatement ps = acceso.conn.prepareStatement("select dni,password,privilegios,apellidos, nombres  from empleados where dni = ? and password = ? and privilegios = ? ");
      ps.setString(1, dni);
      ps.setString(2, password);
      ps.setString(3, privilegios);
      
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        empleado = new Empleado();
        empleado.setDni(rs.getString(1));
        empleado.setPassword(rs.getString(2));
        empleado.setPrivilegios(rs.getString(3));
        empleado.setApellidos(rs.getString(4));
        empleado.setNombres(rs.getString(5));
        
        return empleado;
      }
    }
    catch (SQLException localSQLException) {}
    
    return empleado;
  }
  
  public String registrarUsuario(String dni, String privilegios, String password, String nombres, String apellidos)
  {
    String respuesta = null;
    DBConnection acceso = new DBConnection();
    acceso.getConnection();
    try {
      PreparedStatement ps = acceso.conn.prepareStatement("insert into EMPLEADOS (dni,nombres,password,privilegios,apellidos)values(?,?,?,?,?)");
      ps.setString(1, dni);
      ps.setString(2, nombres);
      ps.setString(3, password);
      ps.setString(4, privilegios);
      ps.setString(5, apellidos);
      
      int rs = ps.executeUpdate();
      
      if (rs > 0) {
        respuesta = "registro exitoso";
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return respuesta;
  }
  

  public String resetPassword(String dni)
  {
    String respuesta = null;
    DBConnection acceso = new DBConnection();
    acceso.getConnection();
    try {
      PreparedStatement ps = acceso.conn.prepareStatement("UPDATE HR.EMPLEADOS SET PASSWORD = NULL where DNI = ?");
      ps.setString(1, dni);
      
      int rs = ps.executeUpdate();
      if (rs > 0) {
        respuesta = "registro exitoso";
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return respuesta;
  }
}