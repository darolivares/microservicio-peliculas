package com.peliculas.peliculas;

public class Pelicula {
    private int id;
    private String titulo;
    private String year;
    private String director;
    private String genero;
    private String sinopsis;
    
    public Pelicula(int id, String titulo, String year, String director, String genero, String sinopsis){
        this.id = id;
        this.titulo = titulo;
        this.year = year;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public int getId(){
        return id;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public String getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }

    public String getGenero()
    {
        return genero;
    }

    public String getSinopsis()
    {
        return sinopsis;
    }
}
