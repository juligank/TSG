/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class UserDAO {
    DBConnection access;
    public UserDAO(){
    }
    
    //devolver un empleado objeto
    public User getUserByName(String name){
    User user = null;
    DBConnection access = new DBConnection();
    access.getConnection();
        try {//dni,name,username
            
          //PreparedStatement ps = access.conn.prepareStatement("SELECT dni, name, lastname, username, passwd, birth , email, phone, cellphone, status2  FROM HR.users WHERE name = ?");
            PreparedStatement ps = access.conn.prepareStatement("SELECT dni, name, lastname, username, passwd,  email, phone, cellphone FROM HR.users WHERE name = ?");
            ps.setString(1, name);        
            ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                user = new User();
                user.setDni(rs.getString(1));
                user.setName(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setUsername(rs.getString(4));
                user.setPasswd(rs.getString(5));
                user.setDateOfBirth(rs.getString(6));
                user.setEmail(rs.getString(7)); 
                user.setPhone(rs.getString(8));
                user.setCellPhone(rs.getString(9));
               // user.setStatus2(rs.getString(10));
                                
                return user;
                }
        } catch (Exception e) {
        }
    return user;
    }
    
    public String createUser(String dni, String name, String lastname, String username, String passwd, String email, String phone, String cellphone, String enable, String dateofbirth){
      Date fecha;
        String respuesta = null;
      DBConnection acceso = new DBConnection();
      acceso.getConnection();
        try {
            PreparedStatement ps = acceso.conn.prepareStatement("INSERT INTO HR.USERS (USER_ID, DNI, NAME, LASTNAME, USERNAME, PASSWD, EMAIL, PHONE, CELLPHONE, ENABLE, DATEOFBIRTH) VALUES (hr.users_seq1.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    ps.setString(1, dni);
                    ps.setString(2, name);
                    ps.setString(3, lastname);
                    ps.setString(4, username);
                    ps.setString(5, passwd);
                    //ps.setDate(6, birth);
                 //   ps.setDate(6, new java.sql.Date(birth.getTime()));
                    //ps.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
                    
                    
                   
                    ps.setString(6, email);
                    ps.setString(7, phone);
                    ps.setString(8, cellphone);
                    ps.setString(9, enable);
                    ps.setString(10, dateofbirth);
                 
                    
                     int rs = ps.executeUpdate();
                     System.out.println(rs);
                     
                      if (rs > 0) {
        respuesta = "registro exitoso";
      }
    } catch (SQLException localSQLException) {
     
    }
    return respuesta;
                     
                     
    }
            
    
    
    //ingresar los datos de un empleado
    //asignar roll a un empleado

   
}
