package com.example.sqllitetabanl;

public class Share {
    private int foto;
    private String yazi;

    public Share(int foto, String yazi) {
        this.foto = foto;
        this.yazi = yazi;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getYazi() {
        return yazi;
    }

    public void setYazi(String yazi) {
        this.yazi = yazi;
    }
}
