package org.example.modelos;

public class Cliente
{
    private String nombres;

    private String documentoIdentificacion;

    private String direccion;

    private Integer edad;

    private String correo;

    public Cliente() {
    }

    public Cliente(String nombres, String documentoIdentificacion, String direccion, Integer edad, String correo) {
        this.nombres = nombres;
        this.documentoIdentificacion = documentoIdentificacion;
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
