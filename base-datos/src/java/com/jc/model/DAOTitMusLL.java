package com.jc.model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DiiegOO
 */
public class DAOTitMusLL {
    static Conexion con;
    
    public DAOTitMusLL(){
            con = new Conexion();
    }
    
    public void insertar(TituloMusical t) throws Exception{
    Connection cone = con.conectarse();
    CallableStatement callate=  cone.prepareCall("{call insertar_titulo_musical(?,?,?,?,?,?,?)}");
   callate.setInt(1,t.getID());
   callate.setString(2,t.getTitulo());
   callate.setString(3,t.getGenero());
   callate.setString(4,t.getNomb_banda());
   callate.setInt(5,t.getAño());
   callate.setString(6,t.getAutor());
   callate.setFloat(7,t.getPrecio());
   callate.executeUpdate();
   callate.close();
   cone.close();
   
   
   System.out.println("Registro de musica ingresado");
} 
}
