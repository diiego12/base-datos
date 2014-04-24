package com.jc.controladores;

import com.jc.model.DAOTitMusLL;
import com.jc.model.TituloMusical;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DiiegOO
 */
public class ServletBuscarMusica extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

     try {
            for (TituloMusical u: DAOTitMusLL.buscarDiscos()){
                out.println(u.getTitulo());
            }
        } catch (Exception ex) {  }
 
    }
    
 }