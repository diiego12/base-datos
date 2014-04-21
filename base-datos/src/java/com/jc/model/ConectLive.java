package com.jc.model;

import java.sql.*;
public class ConectLive {
    
    public static Connection conectarse()throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:XE";
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection(url,"DIIEGO12","Horizon13");
       return con;
    }
    
}
