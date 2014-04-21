package com.jc.model;

import java.sql.CallableStatement;
import java.sql.*;


public class TestLive {
    public static void main(String args[])throws Exception{
        ConectLive c=new ConectLive();
        Connection con=c.conectarse();

    }    
}

