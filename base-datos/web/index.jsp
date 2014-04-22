<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<title>LL Music</title>
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
    		<h1>Lives & Levels Music</h1>
  		<a href="#Inicio" data-role="button" data-icon="home">Inicio</a> 
  		</div>
    
  
  <div data-role="content">
  		<center><h1>BIENVENIDO</h1></center><br>
                <center><img src="ll-logo.png" width="120" height="160"></center>
                <br>
  		<form action="autenticar"  method="post">
                <p>Usuario:<p>
  		<div data-role="fieldcontain">
  		<input type="text" name="usuario" id="usuario" value="" />
    		</div>
  		<p>Contraseña:<p>
        	<div data-role="fieldcontain">
        	<input type="password" name="contraseï¿½a" id="contraseña" value="" />
        	</div>
                <br>
                <a id="login" href="#Usuario" data-role="button" type="submit" >Login</a>
                
                
                  </form>
                ${valor}
  
                </div>
  
                 
                <div data-role="footer" data-position="fixed">
                <h4>Copyright ©</h4>
                </div>


</div>//div pagina inicio
					
    <div data-role="page" id="Usuario">
  						
        <div data-role="header">
        <h1>Lives & Levels Music</h1>
        <a href="#Inicio" data-role="button" data-icon="home">Inicio</a> 
        </div>
        <br>
        <br>
	
        <div data-role="content">
	<ul data-role="listview">
            <li><a href="#busqueda"><img src="Search-256.png" width="60" height="60">
                    Busqueda
                    <br>
                    <br>
                    <p>Archivos de música, titulos y más.</p>
                </a>
            </li>
            <li><a href="#insert"><img src="Data-256.png" width="60" height="60">
                    Insertar
                    <br>
                    <br>
                    <p>Nuevos registros de usuarios y musicales.</p>
                </a>
            </li>
            <li><a href="#admin"><img src="Settings-256.png" width="60" height="60">
                    Administración
                    <br>
                    <br>
                    <p>De usuarios (system's).</p>
                </a>
            </li>
        </ul>
        </div>
  
        <div data-role="footer" data-position="fixed">
    	<h4>Copyright ©</h4>
  	</div>
																		
</div>//div usuario



<div data-role="page" id="busqueda">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Lives & Levels Music</h1>
  			</div>
    
    
           		<div data-role="content">
                            <p>Ingresa tu busqueda:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="busquedamus" id="busquedamus" value="" />        	
                            </div>
  			</div>
  
    
  			<div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div busqueda




<div data-role="page" id="insert">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Lives & Levels Music</h1>
  			</div>
  
  										
                        <div data-role="content">
 		<ul data-role="listview">
                    <li><a href="#agrMusc"><img src="Vynil-256.png" width="60" height="60">
                    Agregar titulo musical.
                    <br>
                    <br>
                    <p>Solo Administrador.</p>
                </a>
            </li>
            <li><a href="#agrUsu"><img src="Note-256.png" width="60" height="60">
                    Agregar Usuario(s) [system(s)].
                    <br>
                    <br>
                    <p>Solo Administrador.</p>
                </a>
            </li>
            
        </ul>
  			</div>
  
    
                        <div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div insertar



<div data-role="page" id="admin">
  
  			<div data-role="header">
    			<a href="#Usuario" data-role="button" data-icon="back">Regresar</a> 
    			<h1>Lives & Levels Music</h1>
  			</div>
  
    
                        <div data-role="content">
 			
  			</div>
  
  
  			<div data-role="footer" data-position="fixed">
			<h4>Copyright ©</h4>
  			</div>

</div>// div admin


<div data-role="page" id="agrMusc">
 
  <div data-role="header">
    		<h1>Lives & Levels Music</h1>
  		<a href="#insert" data-role="button" data-icon="back">Regresar</a> 
  		</div>
    
  
  			<div data-role="content">
  		
                            <p>ID:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="id_disc" id="id_disc" value="" />        	
                            </div>
                            
                            <p>Titulo:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="titulo" id="titulo" value="" />        	
                            </div>
                            
                            <p>Genero:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="genero" id="genero" value="" />        	
                            </div>
                            
                            <p>Nombre de la Banda:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="nomb_band" id="nomb_band" value="" />        	
                            </div>   
                            
                            <p>Año:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="year" id="year" value="" />        	
                            </div>
                            
                            <p>Autor:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="autor" id="autor" value="" />        	
                            </div>
                            
                            <p>Precio:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="precio" id="precio" value="" />        	
                            </div>                            
                            <br>
                            <br>
                            <a href="" data-role="button" type="submmit">Ingresar a la Base de Datos</a> 
                	</div>
  
                 
                <div data-role="footer" data-position="fixed">
                <h4>Copyright ©</h4>
                </div>


</div>//div agregar musica

<div data-role="page" id="agrUsu">
 
  <div data-role="header">
    		<h1>Lives & Levels Music</h1>
  		<a href="#insert" data-role="button" data-icon="back">Regresar</a> 
  		</div>
    
  
  			<div data-role="content">
                            <p>ID:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="id_us" id="id_us" value="" />        	
                            </div>
                            
                            <p>Nombre:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="nomb_us" id="nomb_us" value="" />        	
                            </div>
                            
                            <p>Edad:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="edad_us" id="edad_us" value="" />        	
                            </div>
                            
                            <p>Contraseña:</p>
                            <div data-role="fieldcontain">
        	                 <input type="text" name="contra_us" id="contra_us" value="" />        	
                            </div>                            
  
                	</div>
  
                 
                <div data-role="footer" data-position="fixed">
                <h4>Copyright ©</h4>
                </div>


</div>//div agregar usuario



</body>
</html>
