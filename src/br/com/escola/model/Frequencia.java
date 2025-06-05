package br.com.escola.model;

public class Frequencia {

    private int faltas;
    private int presenca;

    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public int getPresenca() {
        return presenca;
    }
    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }
    public int aplicaFalta(int nFalta){
       return this.faltas += nFalta;
    }
    public int abonaFalta(int nFalta){
        return this.faltas -=nFalta;
    }
    
}
