/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab24_formandclass;

/**
 *
 * @author Edwin Caiza
 */
public class Cliente_Datos {
    private String name;
    private float sueldoHoras;
    private float horasTrabajadas;
    private float aporteSeguro;
    private final float valorAporte = (float) 0.0945;
    private float sueldoGanado;

    public Cliente_Datos() {
    }

    public Cliente_Datos(String name, float sueldoHoras, float horasTrabajadas, float aporteSeguro, float sueldoGanado) {
        this.name = name;
        this.sueldoHoras = sueldoHoras;
        this.horasTrabajadas = horasTrabajadas;
        this.aporteSeguro = aporteSeguro;
        this.sueldoGanado = sueldoGanado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSueldoHoras() {
        return sueldoHoras;
    }

    public void setSueldoHoras(float sueldoHoras) {
        this.sueldoHoras = sueldoHoras;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getAporteSeguro() {
        aporteSeguro = getSueldoHoras() * getHorasTrabajadas() * valorAporte;
        return aporteSeguro;
    }

    public void setAporteSeguro(float aporteSeeguro) {
        this.aporteSeguro = aporteSeeguro;
    }

    public float getSueldoGanado() {
        sueldoGanado = (getSueldoHoras() * getHorasTrabajadas()) - getAporteSeguro();
        return sueldoGanado;
    }

    public void setSueldoGanado(float sueldoGanado) {
        this.sueldoGanado = sueldoGanado;
    }
    
}
