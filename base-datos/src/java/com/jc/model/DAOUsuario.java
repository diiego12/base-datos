package com.jc.model;


import java.sql.*;
import java.util.ArrayList;


public class DAOUsuario {
    static Conexion con;
    
    public DAOUsuario(){
        con=new Conexion();
    }
    
    public void insertar(Usuario u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call insertar_usuario(?,?,?)}");
   callate.setInt(1,u.getId());
   callate.setString(2,u.getLogin());
   callate.setString(3, u.getPassword());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se inserto el registro con exito");
    
 }
    
    public static ArrayList<Usuario> buscarTodos()throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Connection conexion = con.conectarse(); //conectamos a la base de datos
        Statement st = conexion.createStatement();//Crear statement de sql
        ResultSet res = st.executeQuery("SELECT * FROM usuario1");
        
        
        while (res.next()){
            
            int id = res.getInt(1);
            String login = res.getString(2);
            String password = res.getString(3);
            Usuario us = new Usuario(id,login,password);
            usuarios.add(us);
                    
        }
            
    return usuarios;
    }
}
