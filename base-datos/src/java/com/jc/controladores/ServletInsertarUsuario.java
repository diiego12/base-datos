package com.jc.controladores;

import com.jc.model.DAOUsuarioLives;
import com.jc.model.UsuarioLives;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletInsertarUsuario extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="no insertado";
        //Pedimos los valores
        
    int id =   Integer.parseInt(request.getParameter("id"));
    String nombre =    request.getParameter("nombre");
    int edad = Integer.parseInt(request.getParameter("edad"));
    String password =    request.getParameter(request.getParameter("password"));
    
    
    UsuarioLives u = new UsuarioLives(id,nombre, edad, password);
    u.setId(id);
    u.setNombre(nombre);
    u.setEdad(edad);
    u.setPassword(password);
   
    DAOUsuarioLives dao = new DAOUsuarioLives();
        try {
            dao.insertar(u);
            mensaje="Usuario Guardado";
        } catch (Exception ex) {
                mensaje=ex.getMessage();
        }
                out.println(mensaje);    
    }
}