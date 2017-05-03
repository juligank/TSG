/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import java.sql.Date;


import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Date;



/**
 *
 * @author usuario
 */
public class User {   
 String dni;
 String name;
 String lastname;
 String username;
 String passwd;
 String email;
 String phone;
 String cellphone;
 String enable;
 String dateofbirth;


public User(){
  dni = "";
  name = "";
  lastname = "";
  username = "";
  passwd = "";
  dateofbirth ="";
  email = "";
  phone = "";
  cellphone = "";
  enable = "";
}

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getDateOfBirth() {
        return dateofbirth;
    }

    public void setDateOfBirth(String birth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellphone;
    }

    public void setCellPhone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }
}