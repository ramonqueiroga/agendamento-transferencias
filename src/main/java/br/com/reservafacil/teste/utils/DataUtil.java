package br.com.reservafacil.teste.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.joda.time.DateTime;

public class DataUtil {
	
	public static Calendar criaDataComString(String data){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataConvertida = Calendar.getInstance();
		try{
			dataConvertida.setTime(format.parse(data));
		}catch(ParseException e){
			e.printStackTrace();
		}
		return dataConvertida;
	}
	
	public static Calendar criaDataComSomatorioDeDias(Calendar data, int dias){
		DateTime dateTime = new DateTime(data);
		Calendar dataComDiasSomados = dateTime.plusDays(dias).toCalendar(Locale.getDefault());
		return dataComDiasSomados;
	}	

}
