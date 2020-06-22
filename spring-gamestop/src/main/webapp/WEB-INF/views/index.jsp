<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina di ricerca</title>
</head>
<body>
<a href="new">Aggiungi Videogioco</a> &nbsp;
<div align="center">
<br><br>
Scegli cosa visualizzare:
<form action="risultato">
<input type="text" id="string" name="string"> <br><br>
		<input type="radio" name="scelta" value="0"> <label
			for="titolo">Titolo</label><br> <input type="radio"
			name="scelta" value="1"> <label for="prezzo">Prezzo</label><br>
		<input type="radio" name="scelta" value="2"> <label
			for="categoria">Categoria</label><br><input type="radio" name="scelta" value="3"> <label
			for="classificazione">Classificazione PEGI</label><br> <input type="submit"
			value="Scegli"><br>
		<br>
	</form>
	<br><br><br>
<table border="1">
		<tr>
		
			<th>ID Videogioco</th>
			<th>Titolo</th>
			<th>PEGI</th>
			<th>Prezzo</th>
			<th>Categoria</th>
			<th>Modifica</th>
			<th>Elimina</th>
		</tr>
		<c:forEach items="${listGiochi}" var="gioco">
		<tr>
			<td>${gioco.idGioco}</td>
			<td>${gioco.titolo}</td>
			<td>${gioco.pegi}</td>
			<td>${gioco.prezzo}</td>
			<td>${gioco.categoria}</td>
			<td><a href="edit?idGioco=${gioco.idGioco}">Modifica</a></td> 
			<td><a href="delete?idGioco=${gioco.idGioco}">Elimina </a></td>
		</tr>
		</c:forEach>
	</table>
	
	</div>
</body>
</html>