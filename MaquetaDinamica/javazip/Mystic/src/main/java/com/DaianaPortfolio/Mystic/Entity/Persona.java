package com.DaianaPortfolio.Mystic.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    private String residencia;
    
    private Long telefono;
    
    private String foto;
    
    private String email;
    
    @Lob
    private String textosobremi;
    
    private String fotobanner;
 
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String residencia, Long telefono, String foto, String email, String textosobremi, String fotobanner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.residencia = residencia;
        this.telefono = telefono;
        this.foto = foto;
        this.email = email;
        this.textosobremi = textosobremi;
        this.fotobanner = fotobanner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTextosobremi() {
        return textosobremi;
    }

    public void setTextosobremi(String textosobremi) {
        this.textosobremi = textosobremi;
    }

    public String getFotobanner() {
        return fotobanner;
    }

    public void setFotobanner(String fotobanner) {
        this.fotobanner = fotobanner;
    }
           
}
