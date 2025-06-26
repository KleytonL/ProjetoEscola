package br.com.escola.model;

public class Cnpj implements Documento {

    private String valor;
    
    public Cnpj(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean validaDoc() {
        if(valor.length() == 18) {
            return true;
        }
        return false;
    }

    @Override
    public String getDocumento() {
        if(validaDoc() == true) {
            return valor;
        }
        return "Documento inválido!";
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
