/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author usuario
 */


@WebService(serviceName="WSUsers")
public class WSUsers
{
  public WSUsers() {}
  
  @WebMethod(operationName="validar")
  public Empleado validar(@WebParam(name="dni") String dni, @WebParam(name="password") String password, @WebParam(name="privilegios") String privilegios)
  {
    EmpleadoDAO emp = new EmpleadoDAO();
    Empleado empleado = emp.verificaUsuario(dni, password, privilegios);
    return empleado;
  }
  

  @WebMethod(operationName="registrar")
  public String registrar(@WebParam(name="dni") String dni, @WebParam(name="nombres") String nombres, @WebParam(name="password") String password, @WebParam(name="privilegios") String privilegios, @WebParam(name="apellidos") String apellidos)
  {
    EmpleadoDAO emp = new EmpleadoDAO();
    String respuesta = emp.registrarUsuario(dni, privilegios, password, nombres, apellidos);
    return respuesta;
  }
  
  @WebMethod(operationName="resetPassword")
  public String resetPassword(@WebParam(name="dni") String dni)
  {
    EmpleadoDAO emp = new EmpleadoDAO();
    String respuesta = emp.resetPassword(dni);
    

    return respuesta;
  }
}