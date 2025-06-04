package br.com.escola.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    private String data;

    public Date format(String data) throws ParseException {
        Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        return dataFormatada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
