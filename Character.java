/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;
import java.util.ArrayList;
/**
 *
 * @author alunodev10
 */
public class Character {
    String[] insetos = {"Besouro","Abelha","Borboleta","Aranha"};
    String raca;
    String name;
    int maxHealth;
    int health;
    int damage;  
    
    protected String getRaca() {
       //System.out.println(insetos.length);
        int numSortido = (int)(Math.random() * insetos.length);
        this.raca = insetos[numSortido];
        switch(numSortido) {
            case 0:
                this.maxHealth = 35;
                this.damage = 2;
            case 1:
                this.maxHealth = 15;
                this.damage = 8;
            case 2:
                this.maxHealth = 20;
                this.damage = 5;
            case 3:
               this.maxHealth = 30;
               this.damage = 3;
        }  
        return this.raca;
    }
    
    
}
