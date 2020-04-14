<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="registrar" class="form-Registrar" method="post">

        <h4>REGISTRO DE EMPLEADOS</h4>

        <label for="codigo">Codigo</label>
        <input class="Empleado" type="text"  name="codigo" placeholder="Ingrese su código"><br>

        <label for="cedula">Cedula</label>
        <input class="Empleado" type="text"  name="cedula" placeholder="Ingrese su cedula"><br>
        
        <label for="cedula">Nombre</label>
        <input class="Empleado" type="text"  name="nombre" placeholder="Ingrese su nombre"><br>

        <label for="Fecha_de_nacimiento">Fecha de nacimiento</label>
        <input class="Empleado" type="date"  name="fecha_de_nacimiento" placeholder="año-mes-dia">><br>

        <label for="Fecha_de_ingreso">Fecha de ingreso</label>
        <input class="Empleado" type="date"  name="fecha_de_ingreso" placeholder="año-mes-dia"><br>

        <label for="Fecha_de_retiro">Fecha de retiro</label>
        <input class="Empleado" type="date"  name="fecha_de_retiro" placeholder="año-mes-dia">

    <p>
        <input class="Boton" type="submit" value="Registrar"> 
        
    </p>

        
        
    </form>

</body>
</html>