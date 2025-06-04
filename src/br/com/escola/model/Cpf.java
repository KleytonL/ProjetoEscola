package br.com.escola.model;

public class Cpf implements Documento {
    private String valor;

    @Override
    public boolean validaDoc() {
        if (valor.length() == 14) {
            return true;
        }
        return false;
    }

    @Override
    public String getDocumento() {
        if (validaDoc() == true) {
            return valor;
        }
        return "Documento inválido!";
    }
}