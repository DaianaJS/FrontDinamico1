package com.DaianaPortfolio.Mystic.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tituloproyecto;

    @Lob
    private String descripción;

    private String imagenproyecto;

    public Proyecto() {
    }

    public Proyecto(int id, String tituloproyecto, String descripción, String imagenproyecto) {
        this.id = id;
        this.tituloproyecto = tituloproyecto;
        this.descripción = descripción;
        this.imagenproyecto = imagenproyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloproyecto() {
        return tituloproyecto;
    }

    public void setTituloproyecto(String tituloproyecto) {
        this.tituloproyecto = tituloproyecto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getImagenproyecto() {
        return imagenproyecto;
    }

    public void setImagenproyecto(String imagenproyecto) {
        this.imagenproyecto = imagenproyecto;
    }
}
