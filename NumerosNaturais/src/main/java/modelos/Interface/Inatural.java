package modelos.Interface;

import modelos.classes.INatural;

public interface Inatural {

    public int getNumero();
    public void setNumero(int numero) throws Exception;
    public void setNumero(INatural objeto);
    public boolean eNumeroQuadradoPerfeito();
    public INatural calcularFatorial() throws Exception;
    public boolean calcularNumeroPerfeito();
    public boolean eprimo();
    public boolean capicua();
    public long base10para2() throws Exception;
    public long base10para8() throws Exception;
    public String base10para16() throws Exception;
    public INatural calcularMDC(int segundo) throws Exception;
    public INatural calcularMMC(int segundo) throws Exception;
    public boolean primosEntreSi(int segundo) throws Exception;

}
