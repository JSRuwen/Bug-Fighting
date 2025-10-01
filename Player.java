/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho01poo;
import java.util.Scanner;
/**
 *
 * @author alunodev10
 */
public class Player extends Character {
    Scanner scanner = new Scanner(System.in);
    public Player() {
        //System.out.println(this.humor);
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
        super.setRaca();
        System.out.printf("%n>`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n"
                + ": Parabéns, você ganhou um(a) %s!!%n"
                + ">`,`,`,`,`,`,`,`,`,`.´,´,´,´,´,´,´,´,´<%n", super.raca);

    }

    public void getPlayerStatus() {
        System.out.printf(
                  " %n"
                + " %n"
                + " ______________________________________________________ %n"
                + " %n"
                + "Art by Joan G. Stark\n"
                + "\n"
                + "       ,_    /) (\\    _,\n"
                + "        >>  <<,_,>>  <<\n"
                + "       //   _0.-.0_   \\\\\n"
                + "       \\'._/       \\_.'/\n"
                + "        '-.\\.--.--./.-'\n"
                + "        __/ : :Y: : \\ _\n"
                + "';,  .-(_| : : | : : |_)-.  ,:'\n"
                + "  \\\\/.'  |: : :|: : :|  `.\\//\n"
                + "   (/    |: : :|: : :|    \\)\n"
                + "         |: : :|: : :;\n"
                + "        /\\ : : | : : /\\\n"
                + "       (_/'.: :.: :.'\\_)\n"
                + "        \\\\  `\"\"`\"\"`  //\n"
                + "    jgs  \\\\         //\n"
                + "         ':.     .:'"
                + "%n"
                + " _______________________________________________________ %n"
                + ":  digite sua proxima ação!                             :%n"
                + ":                                                       :%n"
                + ":        [a]Alimentar : [b]Brincar : [x]Sair            :"
                + ":                                                       :%n"
                + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                + " %n"
                + "> "
        );
        String value = scanner.next();
        if(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Alimentar")){
        
        }
        else if(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("Alimentar")){
        
        }
        else if(value.equalsIgnoreCase("x") || value.equalsIgnoreCase("sair")){
            Main.menu(scanner, this);
        }
        
    }

}
