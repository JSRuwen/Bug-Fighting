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
    String nome;

    public Comida() {
        int num = (int) (Math.random() * 3);
        switch(num) {
            case 0:
                this.nome = "Bolo";
                this.cura = 25;
                this.humor = 0;
            case 1:
                this.nome = "Batata";
                this.cura = 15;
                this.humor = 1;
            case 2:
                this.nome = "Feijão";
                this.cura = 10;
                this.humor = 1;
        }
    }

}