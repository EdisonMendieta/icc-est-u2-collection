package models;

import java.util.List;

public class Maquina {

    private String nombre;
    private String ip;
    private int subred;
    private int riesgo;
    private List<Integer> codigos;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
        this.riesgo = calcularRiesgo();
    }

    private int calcularSubred(){
        String[] partesIp = this.ip.split("\\.");
        return Integer.parseInt(partesIp[2]);
    }

    private int calcularRiesgo(){
        int riesgo = 0;
        for (Integer codigo : this.codigos) {
            riesgo += codigo;
        }
        return riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre + ", ip=" + ip + ", subred=" + subred + ", riesgo=" + riesgo + ", codigos="
                + codigos + "]";
    }
    
    


    

    
}
