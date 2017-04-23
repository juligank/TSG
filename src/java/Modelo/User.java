/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import java.sql.Date;

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
 Date birth;
 String email;
 String phone;
 String cellphone;
 String Status;


public User(){
  dni = "";
  name = "";
  lastname = "";
  username = "";
  passwd = "";
  Date birth = null;
  email = "";
  phone = "";
  cellphone = "";
  Status = "";
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}