<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<title>jQuery Mobile Web App</title>
<link href="jquery.mobile-1.0.min.css" rel="stylesheet" type="text/css"/>
<script src="jquery-1.6.4.min.js" type="text/javascript"></script>
<script src="jquery.mobile-1.0.min.js" type="text/javascript"></script>
    <script>
        /*$(document).ready(function(e){
        $("#login").click(function(){
            
          
        $.ajax({
                url:'MusicLive',
                type:'post',
                
                data:{
                    usuario:$().val(),
                    contraseña:$().val()
                },
                succes:function(){
                        $("#resultado").html(datos)
                },
                        failure:function(){
                            alert("Usuario Incorrecto");
                        }
            });
        });
       
    });       */

    
    </script>

</head> 

<body>


<div data-role="page" id="Inicio">
 
  <div data-role="header">
    		<h1>Level's Music</h1>
  		<a href="#Inicio" data-role="button" data-icon="home">Inicio</a> 
  		</div>
    
  
  <div data-role="content">
  		<center><h1>BIENVENIDO</h1></center><br>
  		<h2>Inicio se Sesión</h2>
                <form action="autenticar"  method="post">
                <h4>Usuario:</h4>
  		<div data-role="fieldcontain">
  		<input type="text" name="usuario" id="usuario" value="" />
    		</div>
  		<h4>Contraseña:</h4>
        	<div data-role="fieldcontain">
        	<input type="password" name="contraseña" id="contraseña" value="" />
        	</div>
                <br>
        	<a id="login" data-role="button" data-icon="star" >Login</a>
                <div id="resultado"></div>
                
                  </form>
                ${valor}
  </div>
  
   
                
                <div data-role="footer" data-position="fixed">
                <h4>Copyright ©</h4>
                </div>


</div>//div pagina inicio
					
    <div data-role="page" id="Usuario">
  						
        <div data-role="header">
        <h1>Level's Music</h1>
        <a href="#Inicio" data-role="button" data-icon="home">Inicio</a> 
        </div>
        <br>
        <br>
	
        <div data-role="content">
	<ul data-role="listview">
	<li><a href="#busqueda">Busqueda</a></li>
	<li><a href="#insert">Insertar</a></li>
	<li><a href="#admin">Administración</a></li>
        </ul>
        </div>
  
        <div data-role="footer" data-position="fixed">
    	<h4>Copyright ©</h4>
  	</div>
																		
</div>//div usuario



<div data-role="page" id="busqueda">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Level's Music</h1>
  			</div>
    
    
           		<div data-role="content">
 			puto
  			</div>
  
    
  			<div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div busqueda




<div data-role="page" id="insert">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Level's Music</h1>
  			</div>
  
  										
                        <div data-role="content">
 			puto2
  			</div>
  
    
                        <div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div insertar



<div data-role="page" id="admin">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Level's Music</h1>
  			</div>
  
    
                        <div data-role="content">
 			puto3
  			</div>
  
  
  			<div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div admin



</body>
</html>
