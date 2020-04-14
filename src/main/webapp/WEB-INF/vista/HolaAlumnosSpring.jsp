<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola Alumnos Spring</title>
</head>
<body>
	Hola querido <c:out value="${param.nombreAlumno}" default="Nothing!"/>. Bienvenido al Curso de Spring


	<p>Texto ${param.nombreAlumno }. texto</p>
	<p>Texto ${mensajeClaro} texto</p>
	${pageContext.exception}
 
</body>
</html>