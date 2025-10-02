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
                + ":        [a]Atacar : [s]Especial : [x]Sair              :%n"
                + ":                                                       :%n"
                + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                + "> ", e.sprite.get(0), e.health, p.sprite.get(0), p.health
            );
            String value = scanner.next();
            System.out.printf("%n%s atacou!", e.raca);
            e.givingDamage(p);

            if (e.health <= 0) {
                System.out.printf("%s Ganhou!!", p.raca);
                break;
            }

            if (p.health <= 0) {
                System.out.printf("%s Ganhou!!", e.raca);
                break;
            }

            
            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Atacar")) {
                p.givingDamage(e);
            } else if (value.equalsIgnoreCase("s") || value.equalsIgnoreCase("Especial")) {

            } else if (value.equalsIgnoreCase("c") || value.equalsIgnoreCase("Comida")) {

            } else if (value.equalsIgnoreCase("x") || value.equalsIgnoreCase("sair")) {
                break;
            }

        }

    }

}
