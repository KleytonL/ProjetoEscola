package br.com.escola.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    public static Date formatarParaDate(String data) throws ParseException {
        Date dataConvertida = formatador.parse(data);
        return dataConvertida;
    }

    public static String formatarParaString(Date data) {
        String dataConvertida = formatador.format(data);
        return dataConvertida;
    }

}
