package com.example.correcionenviarydevolverinformacion.modelos;

import java.io.Serializable;

public class BiciModel implements Serializable {
    private String marca;
    private int pulgada;

    public BiciModel(String marca, int pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }
}
