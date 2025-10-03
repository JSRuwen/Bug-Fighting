/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alunodev10
 */
public class Player extends Character {

    String name;
    boolean special = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Comida> bolsa = new ArrayList<>();

    public Player() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%n                                                                         %n"
                        + "                                                                          %n"
                        + "                                                                          %n"
                        + "                                @@@@@@@@@@m                                  %n"
                        + "                              @@@        @@@                                %n"
                        + "                            @@@▒▒▒▒        @@@                              %n"
                        + "                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n"
                        + "                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n"
                        + "                        @@@  ▒▒▒▒        ▒▒▒▒▒▒@@@                          %n"
                        + "                        @@@                ▒▒▒▒@@@                          %n"
                        + "                      @@@▒▒      ▒▒▒▒▒▒          @@@                        %n"
                        + "                      @@@      ▒▒▒▒▒▒▒▒▒▒        @@@                        %n"
                        + "                      @@@      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒@@@                        %n"
                        + "                      @@@▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒@@@                        %n"
                        + "                        @@@▒▒▒▒  ▒▒▒▒▒▒    ▒▒▒▒@@@                          %n"
                        + "                        @@@▒▒▒▒            ▒▒▒▒@@@                          %n"
                        + "                          @@@▒▒              @@@                            %n"
                        + "                            MMMMMMM        MMMM                              %n"
                        + "                                @@@@@@@@@@@@                                  %n"
                        + "                                                                          %n"
                        + "                                                                          %n"
                        + "                                                                          ");
                Thread.sleep(500);
                System.out.printf("%n                                                                         %n"
                        + "                                                                          %n"
                        + "                                                                          %n"
                        + "                                @@@@@@@@@@m                                  %n"
                        + "                              @@@        @@@                                %n"
                        + "                            @@@            @@@                              %n"
                        + "                          @@@                @@@                            %n"
                        + "                          @@@                  @@@                            %n"
                        + "                        @@@                     @@@                          %n"
                        + "                        @@@                     @@@                          %n"
                        + "                      @@@                         @@@                        %n"
                        + "                      @@@                         @@@                        %n"
                        + "                      @@@                         @@@                        %n"
                        + "                      @@@                         @@@                        %n"
                        + "                        @@@                     @@@                          %n"
                        + "                        @@@                     @@@                          %n"
                        + "                          @@@                @@@                            %n"
                        + "                            MMMMMMM        MMMM                              %n"
                        + "                                @@@@@@@@@@@@                                  %n"
                        + "                                                                          %n"
                        + "                                                                          %n"
                        + "                                                                          ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.printf("%n                                                                         %n"
                + "                                                                          %n"
                + "                                                                          %n"
                + "                                                                  %n"
                + "                                                                         %n"
                + "                                             @                              %n"
                + "                          @                ??@@@                            %n"
                + "                          @@@             ?    @@@                            %n"
                + "                        @@@  ?           ?      @@@                          %n"
                + "                        @@@   ??    ?????       @@@                          %n"
                + "                      @@@       ? ??              @@@                        %n"
                + "                      @@@        ?                @@@                        %n"
                + "                      @@@        ?                @@@                        %n"
                + "                      @@@                         @@@                        %n"
                + "                        @@@                     @@@                          %n"
                + "                        @@@                     @@@                          %n"
                + "                          @@@                @@@                            %n"
                + "                            MMMMMMM        MMMM                              %n"
                + "                                @@@@@@@@@@@@                                  %n"
                + "                                                                          %n"
                + "                                                                          %n"
                + "                                                                          ");

        System.out.printf("%n%n>`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n"
                + ": Parabéns, você ganhou um(a) %s!!%n"
                + ">`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n"
                + "%n"
                + "%s%n", this.raca,this.sprite.get(1));

        System.out.printf(
                "%n$$$XXXXXXXxxxxxxx=======+++++++;;;;;;;:::::::.......%n"
                + ":                                %n"
                + ": @     Qual nome seu inseto terá?%n"
                + ":                                %n"
                + "$$$XXXXXXXxxxxxxx=======+++++++;;;;;;;:::::::.......%n"
                + "%n"
                + "> ");
        String nome = scanner.next();
        name = nome;
        Comida c1 = new Comida();
        Comida c2 = new Comida();
        bolsa.add(c1);
        bolsa.add(c2);
   

    }

    protected String setHumor() {
        if (this.health >= this.maxHealth) {
            this.humor = humorList[0];
            this.special = true;
        } else if (this.health >= this.maxHealth * 0.75 & this.health <= this.maxHealth) {
            this.humor = humorList[0];
            this.special = true;
        } else if (this.health <= this.maxHealth * 0.75 & this.health >= this.maxHealth * 0.66) {
            this.humor = humorList[1];
            this.special = false;
        } else if (this.health >= this.maxHealth * 0.4 & this.health <= this.maxHealth * 0.66) {
            this.humor = humorList[2];
            this.special = false;
        } else if (this.health > 0 & this.health <= this.maxHealth * 0.4) {
            this.humor = humorList[3];
            this.special = false;
        }

        return this.humor;
    }

    public Character setComer() {
        if (bolsa.isEmpty()) {
            System.out.printf(
                    "%n _______________________________________________________ %n"
                    + ":                                                       :%n"
                    + ":            Você não tem mais alimentos!               :%n"
                    + ":                                                       :%n"
                    + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                    + "%n");
        } else {
            int cura = bolsa.get(0).cura;
            int humor = bolsa.get(0).humor;
            this.health += cura;

            if (this.health > this.maxHealth) {
                int vidaLimite = this.health;
                this.health = vidaLimite + 5 - cura;
            }

            if (this.humor.equals("Médio")) {
                this.humor = humorList[0];
            } else if (this.humor.equals("Muito Ruim")) {
                this.humor = humorList[2];
            } else {
                this.humor = humorList[humor];
            }

            System.out.printf(
                    "%n _______________________________________________________ %n"
                    + ":                                                       :%n"
                    + ":        Você comeu um %s ! Faltam %d alimentos                               %n"
                    + ":                                                       :%n"
                    + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                    + "%n", bolsa.get(0).nome, bolsa.size() - 1);
            bolsa.remove(0);
        }
        return this;
    }

    public String setBrincar() {
        for (int i = 0; i < humorList.length; i++) {
            if (humor.equalsIgnoreCase(humorList[i])) {
                if (this.humor.equals("Bem")) {
                    System.out.printf(":    %s está muito feliz! :D", name);
                    break;
                } else {
                    this.humor = humorList[i - 1];
                    System.out.printf(":    Você brincou com o pet!! ");
                    break;
                }
            }
        }
        if (this.humor.equals("Bem")) {
            this.special = true;
        }
        return this.humor;
    }

    public int special(Character enemy) {
        int danoAntigo = this.damage;
        if (special == true) {
            this.damage += this.damage * 0.5;
        }
        System.out.printf(":    %s Usou o especial!!%n", name);
        givingDamage(enemy);
        this.damage = danoAntigo;
        return this.damage;
    }

    @Override
    protected int givingDamage(Character enemy) {
        System.out.printf(":    %s Atacou!!     +%d dmg%n", name, this.damage);
        enemy.gettingHurt(this.damage);
        return this.damage;
    }

    @Override
    protected int gettingHurt(int dmg) {
        this.health -= dmg;
        setHumor();
        return this.health;
    }

    public void getPlayerStatus() {
        while (true) {
            System.out.printf(
                    " %n"
                    + " %n"
                    + " ______________________________________________________ %n"
                    + "%n"
                    + "%n"
                    + "%s" //aqui vai o sprite
                    + "%n"
                    + " %s     [ HP: %d ]       [ Humor: %s ]%n"
                    + " _______________________________________________________ %n"
                    + ":  digite sua proxima ação!                             :%n"
                    + ":                                                       :%n"
                    + ":        [a]Alimentar : [b]Brincar : [x]Sair            :%n"
                    + ":                                                       :%n"
                    + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                    + "%n"
                    + "> ", this.sprite.get(1), name, this.health, this.humor
            );

            String value = scanner.next();
            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Alimentar")) {
                System.out.printf(
                        " %n"
                        + " %n"
                        + " ______________________________________________________ %n"
                        + "%n"
                        + "%n"
                        + "%s" //aqui vai o sprite
                        + "%n",
                        this.sprite.get(1));
                setComer();

            } else if (value.equalsIgnoreCase("b") || value.equalsIgnoreCase("brincar")) {
                setBrincar();
            } else if (value.equalsIgnoreCase("x") || value.equalsIgnoreCase("sair")) {
                return;
            }
        }
    }

}