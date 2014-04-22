package com.jc.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAutenticar extends HttpServlet {


    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //paso 1, por medio del request pedir un parametro, en este caso
        //el nombre
          String name=request.getParameter("usuario");
          String pas=request.getParameter("contraseña");
          out.println("Bienvenido "+name);
      
          if(pas.equals("Datos Correctos")){
          RequestDispatcher despachar = request.getRequestDispatcher("Correcto.html");
          despachar.forward(request, response);
          }else{
              request.setAttribute("valor", "Datos Incorrectos");
              RequestDispatcher despachar = request.getRequestDispatcher("index.jsp");
          despachar.forward(request, response);
          }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
