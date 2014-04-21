package com.jc.model;

import java.sql.CallableStatement;
import java.sql.*;


public class TestLive {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();

    }    
}

