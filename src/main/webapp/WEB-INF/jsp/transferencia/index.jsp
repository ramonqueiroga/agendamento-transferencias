<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	
</body>
</html>