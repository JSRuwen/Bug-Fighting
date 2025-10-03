/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;

import java.util.Scanner;

/**
 *
 * @author SantWolf
 */
public class Batalha {

    public static void Batalha(Player p, Character e) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%n%n_______________________________________________________%n"
                    + " %n"
                    + "%s [ HP: %d ]"
                    + " %n"
                    + " %n"
                    + "%s [ HP: %d ]"
                    + " %n %n"
                    + " _______________________________________________________ %n"
                    + ":  digite sua proxima ação!                             :%n"
                    + ":                                                       :%n"
                    + ":    [a]Atacar : [s]Especial : [c] Comida : [x]Sair     :%n"
                    + ":                                                       :%n"
                    + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                    + "> ", e.sprite.get(0), e.health, p.sprite.get(0), p.health
            );
            String value = scanner.next();
            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Atacar")) {
                p.givingDamage(e);
            } else if (value.equalsIgnoreCase("s") || value.equalsIgnoreCase("Especial")) {
                p.special(e);
            } else if (value.equalsIgnoreCase("c") || value.equalsIgnoreCase("Comida")) {
                p.setComer();
            } else if (value.equalsIgnoreCase("x") || value.equalsIgnoreCase("sair")) {
                return;
                
            }
            
      
            
            if (e.health <= 0) {
                System.out.printf("%n%s Ganhou!!%n", p.name);
                return;
            }
            e.givingDamage(p);
            
            if (p.health <= 0) {
                System.out.printf("%n%s Ganhou!!%n", e.raca);
                    System.out.println("Você perdeu!!");
                return;
            }

        }

    }

}