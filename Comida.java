/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;

import java.util.ArrayList;

/**
 *
 * @author alunolab10
 */
public class Comida {

    ArrayList<Comida> comidas = new ArrayList<>();
    int cura;
    int humor;
    String[] nomes = {"Bolo", "Batata", "Feijão", "Flor"};
    String nome;

    private Comida setAtributos() {
        if (this.nome.equals(nomes[0])) {
            this.cura = 25;
            this.humor = 0;
        } else if (this.nome.equals(nomes[1])) {
            this.cura = 20;
            this.humor = 0;
        } else if (this.nome.equals(nomes[2])) {
            this.cura = 15;
            this.humor = 1;
        } else if (this.nome.equals(nomes[3])) {
            this.cura = 12;
            this.humor = 1;
        }
        return this;
    }

    private String sortear() {
        int num = (int) (Math.random() * nomes.length);
        this.nome = nomes[num];
        setAtributos();
        return this.nome;
    }

    public Comida() {
        this.nome = sortear();
    }

}
