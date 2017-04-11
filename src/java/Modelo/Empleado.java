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


public class Empleado
{
  String dni;
  

  String nombres;
  

  String apellidos;
  

  String password;
  
  String privilegios;
  

  public Empleado()
  {
    dni = "";
    nombres = "";
    apellidos = "";
    password = "";
    privilegios = "";
  }
  



  public String getDni()
  {
    return dni;
  }
  
  public String getNombres() {
    return nombres;
  }
  
  public String getApellidos() {
    return apellidos;
  }
  
  public String getPassword() {
    return password;
  }
  
  public String getPrivilegios() {
    return privilegios;
  }
  
  public void setDni(String dni)
  {
    this.dni = dni;
  }
  
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  
  public void setApellidos(String apellidos)
  {
    this.apellidos = apellidos;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public void setPrivilegios(String privilegios) {
    this.privilegios = privilegios;
  }
}