<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agendamento de transferências</title>
</head>
<body>
	
	<form method="post" action="${linkTo[TransferenciaController].adicionaTransferencia(null)}">
	
		<label for="contaOrigem">Conta de origem:</label>
		<input type="text" name="transferencia.contaOrigem" id="contaOrigem" /><br/>
		
		
		<label for="contaDestino">Conta de destino:</label>
		<input type="text" name="transferencia.contaDestino" id="contaDestino" /><br/>
		
		<label for="valor">Valor:</label>
		<input type="text" name="transferencia.valor" id="valor" /><br/>
		
		<label for="dataAgendamento">Data do agendamento:</label>
		<input type="text" name="transferencia.dataAgendamento" id="dataAgendamento" /><br/>
	
		<label for="tipoTransferencia">Tipo de taxa</label>
		<select name="transferencia.tipoTransferenciaEnum">
	 		<c:forEach items="${tiposTransferencia}" var="tipo">  
				<option value="${tipo}">${tipo.tipo}</option>  
            </c:forEach>
		</select>
		
		<input type="submit" value="Enviar" />	
	
	</form>
	
	<table style="border:1px double #000;">
		<tr>
			<td>Conta Origem</td>
			<td>Conta Destino</td>
			<td>Valor da transferência</td>
			<td>Taxa</td>
			<td>Data do agendamento</td>
			<td>Data do cadastro</td>
			<td>Tipo</td>
		</tr>
		<c:forEach items="${transferencias}" var="transferencia">
			<tr>
				<td>${transferencia.contaOrigem}</td>
				<td>${transferencia.contaDestino}</td>
				<td>${transferencia.valor}</td>
				<td>${transferencia.taxa}</td>
				<td><fmt:formatDate type="date" value="${transferencia.dataAgendamento.time}"/></td>
				<td><fmt:formatDate type="date" value="${transferencia.dataCadastro.time}"/></td>
				<td>${transferencia.tipoTransferenciaEnum}</td>
			</tr>
		</c:forEach>
	
	</table>
	
	
</body>
</html>