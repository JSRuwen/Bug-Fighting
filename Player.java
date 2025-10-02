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

    Scanner scanner = new Scanner(System.in);
    ArrayList<Comida> bolsa = new ArrayList<>();

    public Player() {
        //System.out.println(this.humor);
//        try {
//            for (int i = 0; i < 3; i++) {
//                System.out.printf("%n                                                                         %n"
//                        + "                                                                          %n"
//                        + "                                                                          %n"
//                        + "                                @@@@@@@@@@m                                  %n"
//                        + "                              @@@        @@@                                %n"
//                        + "                            @@@▒▒▒▒        @@@                              %n"
//                        + "                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n"
//                        + "                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n"
//                        + "                        @@@  ▒▒▒▒        ▒▒▒▒▒▒@@@                          %n"
//                        + "                        @@@                ▒▒▒▒@@@                          %n"
//                        + "                      @@@▒▒      ▒▒▒▒▒▒          @@@                        %n"
//                        + "                      @@@      ▒▒▒▒▒▒▒▒▒▒        @@@                        %n"
//                        + "                      @@@      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒@@@                        %n"
//                        + "                      @@@▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒@@@                        %n"
//                        + "                        @@@▒▒▒▒  ▒▒▒▒▒▒    ▒▒▒▒@@@                          %n"
//                        + "                        @@@▒▒▒▒            ▒▒▒▒@@@                          %n"
//                        + "                          @@@▒▒              @@@                            %n"
//                        + "                            MMMMMMM        MMMM                              %n"
//                        + "                                @@@@@@@@@@@@                                  %n"
//                        + "                                                                          %n"
//                        + "                                                                          %n"
//                        + "                                                                          ");
//                Thread.sleep(500);
//                System.out.printf("%n                                                                         %n"
//                        + "                                                                          %n"
//                        + "                                                                          %n"
//                        + "                                @@@@@@@@@@m                                  %n"
//                        + "                              @@@        @@@                                %n"
//                        + "                            @@@            @@@                              %n"
//                        + "                          @@@                @@@                            %n"
//                        + "                          @@@                  @@@                            %n"
//                        + "                        @@@                     @@@                          %n"
//                        + "                        @@@                     @@@                          %n"
//                        + "                      @@@                         @@@                        %n"
//                        + "                      @@@                         @@@                        %n"
//                        + "                      @@@                         @@@                        %n"
//                        + "                      @@@                         @@@                        %n"
//                        + "                        @@@                     @@@                          %n"
//                        + "                        @@@                     @@@                          %n"
//                        + "                          @@@                @@@                            %n"
//                        + "                            MMMMMMM        MMMM                              %n"
//                        + "                                @@@@@@@@@@@@                                  %n"
//                        + "                                                                          %n"
//                        + "                                                                          %n"
//                        + "                                                                          ");
//                Thread.sleep(500);
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        System.out.printf("%n                                                                         %n"
//                + "                                                                          %n"
//                + "                                                                          %n"
//                + "                                                                  %n"
//                + "                                                                         %n"
//                + "                                             @                              %n"
//                + "                          @                ??@@@                            %n"
//                + "                          @@@             ?    @@@                            %n"
//                + "                        @@@  ?           ?      @@@                          %n"
//                + "                        @@@   ??    ?????       @@@                          %n"
//                + "                      @@@       ? ??              @@@                        %n"
//                + "                      @@@        ?                @@@                        %n"
//                + "                      @@@        ?                @@@                        %n"
//                + "                      @@@                         @@@                        %n"
//                + "                        @@@                     @@@                          %n"
//                + "                        @@@                     @@@                          %n"
//                + "                          @@@                @@@                            %n"
//                + "                            MMMMMMM        MMMM                              %n"
//                + "                                @@@@@@@@@@@@                                  %n"
//                + "                                                                          %n"
//                + "                                                                          %n"
//                + "                                                                          ")
//;

        System.out.printf("%n%n>`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n"
                + ": Parabéns, você ganhou um(a) %s!!%n"
                + ">`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n", this.raca);
        Comida c1 = new Comida();
        bolsa.add(c1);

    }

    public Character setComer(Comida c) {
        this.health += c.cura;
        return this;
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
                            + "[ HP: %d ]       [ Humor: %s ]%n"
                    + " _______________________________________________________ %n"
                    + ":  digite sua proxima ação!                             :%n"
                    + ":                                                       :%n"
                    + ":        [a]Alimentar : [b]Brincar : [x]Sair            :%n"
                    + ":                                                       :%n"
                    + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                    + "%n"
                    + "> ", this.sprite.get(1),this.health,this.humor
            );

            String value = scanner.next();
            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Alimentar")) {
                if(bolsa.isEmpty()) {
                    System.out.println(":   Você não tem alimentos!");
                } else {
                setComer(bolsa.get(0));
                bolsa.remove(0);
                }
            } else if (value.equalsIgnoreCase("b") || value.equalsIgnoreCase("brincar")) {

            } else if (value.equalsIgnoreCase("x") || value.equalsIgnoreCase("sair")) {
                return;
            }
        }
    }

    public String setBrincar() {

        return this.humor;
    }

}
