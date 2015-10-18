package br.com.reservafacil.teste.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class DataUtil {
	
	public static Date criaDataComString(String data){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataConvertida = null;
		try{
			dataConvertida = format.parse(data);
		}catch(ParseException e){
			e.printStackTrace();
		}
		return dataConvertida;
	}
	
	public static Date criaDataComSomatorioDeDias(Date data, int dias){
		DateTime dateTime = new DateTime(data);
		Date dataComDiasSomados = dateTime.plusDays(dias).toDate();
		return dataComDiasSomados;
	}	

}
