
package modelo;

public class Yate {

    private int año;
    private String tipo;
    private String marca;
    private String modelo;
    private int motor;
    private boolean usado;
    private int horasUso;
    private double capAgua;
    private double capTanque;
    private double ancho;
    private double alto;
    private int numCam;
    private double vMax;
    private double vCru;
    private double valor;
    private int disponible;

    public Yate() {
    }

    public Yate(String pModelo) {
        modelo = pModelo;
    }

    public Yate(String modelo, int año, String tipo, String marca, int motor, boolean usado, int horasUso, double capAgua, double capTanque, double ancho, double alto, int numCam, double vMax, double vCru, double valor, int disponible) {
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.marca = marca;
        this.motor = motor;
        this.usado = usado;
        this.horasUso = horasUso;
        this.capAgua = capAgua;
        this.capTanque = capTanque;
        this.ancho = ancho;
        this.alto = alto;
        this.numCam = numCam;
        this.vMax = vMax;
        this.vCru = vCru;
        this.valor = valor;
        this.disponible = disponible;
    }

    //Set 
    public void setAño(int pAño) {
        año = pAño;
    }

    public void setTipo(String pT) {
        tipo = pT;
    }

    public void setMarca(String pM) {
        marca = pM;
    }

    public void setModelo(String pMod) {
        modelo = pMod;
    }

    public void setMotor(int pMot) {
        motor = pMot;
    }

    public void setUsado(boolean pU) {
        usado = pU;
    }

    public void setHorasUso(int pH) {
        horasUso = pH;
    }

    public void setCapAgua(double pCA) {
        capAgua = pCA;
    }

    public void setCapTanque(double pCT) {
        capTanque = pCT;
    }

    public void setAncho(double pA) {
        ancho = pA;
    }

    public void setAlto(double pAl) {
        alto = pAl;
    }

    public void setNumCamarotes(int pNC) {
        numCam = pNC;
    }

    public void setVMax(double pVM) {
        vMax = pVM;
    }

    public void setVCru(double pVC) {
        vCru = pVC;
    }

    public void setValor(double pV) {
        valor = pV;
    }

    public void setDis(int pD) {
        disponible = pD;
    }


    //Get
    public int getAño() {
        return año;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMotor() {
        return motor;
    }

    public boolean getUsado() {
        return usado;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public double getCapAgua() {
        return capAgua;
    }

    public double getCapTanque() {
        return capTanque;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public int getNumCamarotes() {
        return numCam;
    }

    public double getVMax() {
        return vMax;
    }

    public double getVCru() {
        return vCru;
    }

    public double getValor() {
        return valor;
    }

    public int getDis() {
        return disponible;
    }


//    devuelve los datos de un yate. 
    public String toString() {
        return "Yate" + "\nModelo=" + modelo + ", \nTipo=" + tipo + ", \nMarca=" + marca + ", \nAño=" + año + ", \nMotor=" + motor + ", \nUsado=" + usado + ", \nHorasUso=" + horasUso + ", \nCapAgua=" + capAgua + ", \nCapTanque=" + capTanque + ", \nAncho=" + ancho + ", \nAlto=" + alto + ", \nNumCam=" + numCam + ", \nVMax=" + vMax + ", \nVCru=" + vCru + ", \nValor=" + valor + ", \nDisponible=" + disponible;
    }

}
