/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;

/**
 *
 * @author alunodev10
 */
public class Player extends Character{
    public Player() {
        try {
            for(int i = 0; i<3; i++) {
            System.out.printf("%n                                                                         %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                @@@@@@@@@@m                                  %n" +
"                              @@@        @@@                                %n" +
"                            @@@▒▒▒▒        @@@                              %n" +
"                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n" +
"                          @@@▒▒▒▒▒▒      ▒▒▒▒@@@                            %n" +
"                        @@@  ▒▒▒▒        ▒▒▒▒▒▒@@@                          %n" +
"                        @@@                ▒▒▒▒@@@                          %n" +
"                      @@@▒▒      ▒▒▒▒▒▒          @@@                        %n" +
"                      @@@      ▒▒▒▒▒▒▒▒▒▒        @@@                        %n" +
"                      @@@      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒@@@                        %n" +
"                      @@@▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒@@@                        %n" +
"                        @@@▒▒▒▒  ▒▒▒▒▒▒    ▒▒▒▒@@@                          %n" +
"                        @@@▒▒▒▒            ▒▒▒▒@@@                          %n" +
"                          @@@▒▒              @@@                            %n" +
"                            MMMMMMM        MMMM                              %n" +
"                                @@@@@@@@@@@@                                  %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                                                          ");
        Thread.sleep(500);
                            System.out.printf("%n                                                                         %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                @@@@@@@@@@m                                  %n" +
"                              @@@        @@@                                %n" +
"                            @@@            @@@                              %n" +
"                          @@@                @@@                            %n" +
"                          @@@                  @@@                            %n" +
"                        @@@                     @@@                          %n" +
"                        @@@                     @@@                          %n" +
"                      @@@                         @@@                        %n" +
"                      @@@                         @@@                        %n" +
"                      @@@                         @@@                        %n" +
"                      @@@                         @@@                        %n" +
"                        @@@                     @@@                          %n" +
"                        @@@                     @@@                          %n" +
"                          @@@                @@@                            %n" +
"                            MMMMMMM        MMMM                              %n" +
"                                @@@@@@@@@@@@                                  %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                                                          ");
        Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            
        }
        System.out.printf("%n                                                                         %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                                                  %n" +
"                                                                         %n" +
"                                             @                              %n" +
"                          @                ??@@@                            %n" +
"                          @@@             ?    @@@                            %n" +
"                        @@@  ?           ?      @@@                          %n" +
"                        @@@   ??    ?????       @@@                          %n" +
"                      @@@       ? ??              @@@                        %n" +
"                      @@@        ?                @@@                        %n" +
"                      @@@        ?                @@@                        %n" +
"                      @@@                         @@@                        %n" +
"                        @@@                     @@@                          %n" +
"                        @@@                     @@@                          %n" +
"                          @@@                @@@                            %n" +
"                            MMMMMMM        MMMM                              %n" +
"                                @@@@@@@@@@@@                                  %n" +
"                                                                          %n" +
"                                                                          %n" +
"                                                                          ");
        super.getRaca();
        System.out.printf("%nParabens, você ganhou um(a) %s%n",super.raca);
        
    }
        
    }
    

