package org.example.ayudas;

import java.time.LocalDate;

public class Licor {

    private String nombres;

    private String tipo;

    private String marca;

    private LocalDate fechaVencimiento;

    private Double porcentajeAlcohol;

    public Licor() {
    }

    public Licor(String nombres, String tipo, String marca, LocalDate fechaVencimiento, Double porcentajeAlcohol) {
        this.nombres = nombres;
        this.tipo = tipo;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
}

