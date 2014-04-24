package com.jc.model;

/**
 *
 * @author DiiegOO
 */
public class TituloMusical {
    private int ID;
    private String Titulo;
    private String Genero;
    private String Nomb_banda;
    private int Año;
    private String Autor;
    private float Precio;
 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNomb_banda() {
        return Nomb_banda;
    }

    public void setNomb_banda(String Nomb_banda) {
        this.Nomb_banda = Nomb_banda;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

        public TituloMusical(int ID, String Titulo, String Genero, String Nomb_banda, int Año, String Autor, float Precio) {
        this.ID = ID;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Nomb_banda = Nomb_banda;
        this.Año = Año;
        this.Autor = Autor;
        this.Precio = Precio;
    }
}
