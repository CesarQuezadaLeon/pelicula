package com.example.peliculas.model;

import javax.persistence.*;

@Entity
@Table(name="m_peliculas")
public class peliculas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nombre;
    private String imagen;
    private String duracion;
    private String clasificacion;

    public peliculas(){

    }

    public peliculas(Long id, String nombre, String imagen, String duracion, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
