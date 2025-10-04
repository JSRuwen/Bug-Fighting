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
            return;
        }
    }

    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        String[] dicas = {
            "* Dica: Você pode abreviar ações pela letra dentro dos colchetes '[ ]'",
            "* Dica: Manter seu inseto bem humorado libera o ataque especial!",
            "* Dica: Comer durante a batalha pode liberar o Especial!",
            "* Dica: Separe o Output em uma janela para uma melhor experiência"};

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
            Character inimigo4 = new Character();
            Character inimigo5 = new Character();
            inimigos.add(inimigo1);
            inimigos.add(inimigo2);
            inimigos.add(inimigo3);
            inimigos.add(inimigo4);
            inimigos.add(inimigo5);
            //System.out.println("a: " + inimigos.size());

            while (true) {
                if (inimigos.get(0).health <= 0) {
                    inimigos.remove(0);
//                    if (i > 2) {
//                        Comida c1 = new Comida();
//                        Comida c2 = new Comida();
//                        player.bolsa.add(c1);
//                        player.bolsa.add(c2);
//                        System.out.printf(":   Ganhou 2 alimentos!%n");
//                    } else 
                        if (!inimigos.isEmpty()) {
                        Comida c1 = new Comida();
                        player.bolsa.add(c1);
                        i++;
                        System.out.printf(":   Ganhou 1 alimento!%n");
                    }
                }
                if (player.health <= 0 & !player.bolsa.isEmpty()) {
                    System.out.printf("%n:     Você prescisa curar seu pet, se não o jogo irar acabar!    ");
                } else if (player.health <= 0) {
                    System.out.printf(":     Fim de Jogo!    ");
                    break;
                }
                if (inimigos.isEmpty()) {
                    System.out.printf(
                            "%n$$$XXXXXXXxxxxxxx=======+++++++;;;;;;;:::::::.......%n"
                            + ":                                %n"
                            + ":                 Você venceu!!! %n"
                            + ":                                %n"
                            + "$$$XXXXXXXxxxxxxx=======+++++++;;;;;;;:::::::.......%n");
                    break;
                } else {
                    int numSortido = (int) (Math.random() * dicas.length);
                    System.out.printf("%n%s%n",dicas[numSortido]);
//                    System.out.printf("####: %d", i);
                    Main.menu(scanner, player, inimigos.get(0));

                }

            }
        }

    }
}
