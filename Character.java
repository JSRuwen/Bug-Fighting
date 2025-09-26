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

    String[] insetos = {"Besouro", "Abelha", "Borboleta", "Aranha"};
    String[] humorList = {"bom", "Médio", "Ruim", "Muito Ruim"};
    String raca;
    String name;
    int maxHealth;
    int health;
    int damage;

    String humor;

    public Character() {
        this.humor = humorList[1];

    }

    protected String getRaca() {
        int numSortido = (int) (Math.random() * insetos.length);
        this.raca = insetos[numSortido];
        switch (numSortido) {
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
    
    protected int givingDamage(Character enemy) {
        
        return damage;
    }
    
    protected int gettingHurt(Character enemy) {
        this.health -= enemy.damage;
        return this.health;
    }
    
    protected String setHumor(Comida alimento) {
        
        
        
        if (this.health >= this.maxHealth * 0.75 & this.health <= this.maxHealth) {
            this.humor = humorList[0];
        }
        else if (this.health <= this.maxHealth * 0.75 & this.health >= this.maxHealth * 0.66) {
            this.humor = humorList[1];
        }
        else if (this.health >= this.maxHealth * 0.4 & this.health <= this.maxHealth * 0.66) {
            this.humor = humorList[2];
        }
        else if (this.health > 0 & this.health <= this.maxHealth * 0.4) {
            this.humor = humorList[3];
        }
        return this.humor;
    }
    
    
    

}
