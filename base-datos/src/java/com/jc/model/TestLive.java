package com.jc.model;

import java.sql.CallableStatement;
import java.sql.*;


public class TestLive {
    public static void main(String args[])throws Exception{
        ConectLive c=new ConectLive();
        Connection con=c.conectarse();

        CallableStatement callate=con.prepareCall("{call autenticar_usuario_1(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"");
        callate.setString(3,"");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El id insertado es:"+pk);
    
    }    
}

