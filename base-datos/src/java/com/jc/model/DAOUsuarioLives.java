package com.jc.model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DiiegOO
 */
public class DAOUsuarioLives {
        static Conexion con;
    
        public DAOUsuarioLives(){
            con = new Conexion();
        }
        
public void insertar(UsuarioLives u) throws Exception{
    Connection cone = con.conectarse();
    CallableStatement callate=  cone.prepareCall("{call insertar_usuariolives(?,?,?)}");
   callate.setInt(1,u.getId());
   callate.setString(2,u.getNombre());
   callate.setInt(4, u.getEdad());
   callate.setString(3, u.getPassword());
   callate.executeUpdate();
   callate.close();
   cone.close();
   
   
   System.out.println("Usuario Ingresado con Exito");
} 
    
}
