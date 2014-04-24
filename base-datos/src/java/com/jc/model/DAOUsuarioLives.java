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
   callate.setString(3,u.getPassword());
   callate.executeUpdate();
   callate.close();
   cone.close();
   
   
   System.out.println("Usuario Ingresado con Exito");
   
    

    } 
    

public static ArrayList<UsuarioLives> buscarTodos()throws Exception {
        ArrayList<UsuarioLives> usuariosl = new ArrayList<UsuarioLives>();
        Connection conexion = con.conectarse(); 
        Statement st = conexion.createStatement();
        ResultSet res = st.executeQuery("SELECT * FROM usuario_lives");
        
        
        while (res.next()){
            
            int id = res.getInt(1);
            String nombre = res.getString(2);
            int edad = res.getInt(3);
            String password = res.getString(4);
            UsuarioLives usl = new UsuarioLives(id, nombre, edad, password);
            usuariosl.add(usl);
                
          
            }
            
        return usuariosl;
        
    }
}

