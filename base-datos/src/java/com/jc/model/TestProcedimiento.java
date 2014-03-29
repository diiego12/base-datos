

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;


public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        try{
        CallableStatement callate2=con.prepareCall("{call insertar_usuario_1(?,?,?)}");
        callate2.registerOutParameter(1,java.sql.Types.INTEGER);
        callate2.setString(2,"Claudia");
        callate2.setString(3,"123");
      
        callate2.execute();
        int pk2=callate2.getInt(1);
        System.out.println("El status de inserción es:"+pk2);
        
        
        CallableStatement callate=con.prepareCall("{call autenticar_usuario_1(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"Claudia");
        callate.setString(3,"123");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El status de atenticación es:"+pk);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        }
    
}
