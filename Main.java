/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabalho01poo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alunodev10
 */
public class Main {
    
    /* o jogo vai ser um pokemon de insetos, é possível batalhar, curar o inseto aliado e divertir-lo
        -criar a classe "Character" e instanciar o pet e o oponente como herdeiros de character
            -criar funçãos de humor e seus efeitos no personagem
            -criar os sistemas de darDano e receberDano
        -criar a classe de alimento
        -criar o sistema de batalha
     */
    public static void menu(Scanner s, Player p, Character e) {
        String valor;
        System.out.printf(
                " %n"
                + " %n"
                + " ______________________________________________________ %n"
                + " %n"
                + "\\'~~~-,%n"
                + " \\    '-,_ %n"
                + "  \\ /\\    `~'~''\\           %n"
                + "  _\\ \\\\          \\/~\\ %n"
                + "  \\__ \\\\[b]          \\   %n"
                + "     \\ \\\\.             \\  %n"
                + "      \\ \\ \\   [ ]       `~~%n"
                + "       '\\\\ \\.             /%n"
                + "        L \\  \\            |%n"
                + "         \\_\\  \\     [ ]   |             _.----,%n"
                + "               |           \\           !     /%n"
                + "              '._           \\_      __/    _/%n"
                + "                 \\_[ ]        ''--''    __/%n"
                + "                   \\.__   [ ]          |%n"
                + "                       ''.__  __.._   __\\%n"
                + "                            ''     './"
                + "%n"
                + " _______________________________________________________ %n"
                + ":  digite sua proxima ação!                             :%n"
                + ":                                                       :%n"
                + ":  [b] Batalhar : [s] Status : [x] Sair                 :%n"
                + ":                                                       :%n"
                + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                + " %n"
                + "> "
        );
        valor = s.next();
        if (valor.equalsIgnoreCase("Batalhar") || valor.equalsIgnoreCase("b")) {
            Batalha.Batalha(p, e);
        } else if (valor.equalsIgnoreCase("Status") || valor.equalsIgnoreCase("s")) {
            p.getPlayerStatus();
        } else if (valor.equalsIgnoreCase("x") || valor.equalsIgnoreCase("sair")) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf(" ______________________________________________________ %n"
                + ":                                                      :%n"
                + ":                   BUg Fighting                       :%n"
                + ":                                                      :%n"
                + " ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ %n"
                + ":                     [Iniciar]                        :%n"
                + "     %n"
                + "> ");
        String valor = scanner.next();
        
        if (valor.equalsIgnoreCase("Iniciar")) {
            Player player = new Player();
            ArrayList<Character> inimigos = new ArrayList<>();
            Character inimigo1 = new Character();
            Character inimigo2 = new Character();
            Character inimigo3 = new Character();

            inimigos.add(inimigo1);
            inimigos.add(inimigo2);
            inimigos.add(inimigo3);
            //System.out.println("a: " + inimigos.size());
            for (int i = 0; i < inimigos.size();i++) {
                //System.out.println("a: " + inimigos.size());
                Main.menu(scanner, player, inimigos.get(0));
                //System.out.println("a: " + inimigos.size());
                inimigos.remove(0);
            }

        }

    }
}
