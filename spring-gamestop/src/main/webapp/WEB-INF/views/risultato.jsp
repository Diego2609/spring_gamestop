<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Risultato Ricerca</title>
</head>
<body>
<table border="1">
		<tr>
		
			<th>ID Videogioco</th>
			<th>Titolo</th>
			<th>Classificazione</th>
			<th>Prezzo</th>
			<th>Categoria</th>
			
		</tr>
		<c:forEach items="${listaRicerca}" var="gioco">
		<tr>
			<td>${gioco.idGioco}</td>
			<td>${gioco.titolo}</td>
			<td>${gioco.pegi}</td>
			<td>${gioco.prezzo}</td>
			<td>${gioco.categoria}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="indietro">Torna Indietro</a>
</body>
</html>