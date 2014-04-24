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
    
    public static ArrayList<TituloMusical> buscarDiscos()throws Exception {
        ArrayList<TituloMusical> registros = new ArrayList<TituloMusical>();
        Connection conexion = con.conectarse(); 
        Statement st = conexion.createStatement();
        ResultSet res = st.executeQuery("SELECT * FROM Discos");
        
        
        while (res.next()){
            
            int ID = res.getInt(1);
            String Titulo = res.getString(2);
            String  Genero= res.getString(3);
            String  Nomb_banda= res.getString(4);
            int Año= res.getInt(5);
            String  Autor= res.getString(6);
            float Precio= res.getFloat(7);
             TituloMusical tm = new TituloMusical(ID, Titulo, Genero, Nomb_banda, Año, Autor, Precio);
            registros.add(tm);
                    
        }
            
    return registros;
    }
}
