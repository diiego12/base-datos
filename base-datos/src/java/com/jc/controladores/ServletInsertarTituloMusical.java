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
public class ServletInsertarTituloMusical extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="No se pudo insertar";
       
    int ID =   Integer.parseInt(request.getParameter("ID"));
    String Titulo =    request.getParameter("Titulo");
    String Genero =    request.getParameter("Genero");
    String Nomb_banda =    request.getParameter("Nombre banda");
    int Año = Integer.parseInt(request.getParameter("Año"));
    String Autor =    request.getParameter("Autor");
    float Precio  =    Integer.parseInt(request.getParameter("Precio"));
    
    
    TituloMusical t = new TituloMusical(ID, Titulo, Genero, Nomb_banda, Año, Autor, Precio);
    t.setID(ID);
    t.setTitulo(Titulo);
    t.setGenero(Genero);
    t.setNomb_banda(Nomb_banda);
    t.setAño(Año);
    t.setAutor(Autor);
    t.setPrecio(Precio);
   
    DAOTitMusLL dao = new DAOTitMusLL();
        try {
            dao.insertar(t);
            mensaje="Registro Guardado";
        } catch (Exception ex) {
                mensaje=ex.getMessage();
        }
          
       }      
 }