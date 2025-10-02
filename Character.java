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

    public ArrayList<String> sprite = new ArrayList<>();
    String[] insetos = {"Besouro", "Abelha", "Borboleta", "Aranha"};
    String[] humorList = {"Bem", "Médio", "Ruim", "Muito Ruim"};
    String raca;
    int maxHealth = 0;
    int health = 0;
    int damage = 0;
    String humor;

    protected ArrayList<String> spriteFunc(int num) {
        switch (num) {
            case 0:
                this.sprite.add(
                        "  !____!\n"
                        + "  (o  o)\n"
                        + " \\.'\\/'./\n"
                        + "-:  ::  :-\n"
                        + "/'..''..'\\"
                );
                this.sprite.add("       ,_    /) (\\    _,\n"
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
                );
            case 1:
                this.sprite.add(
                        "   .--.   \\_/    .--.\n"
                        + " .'    ', {_} ,'    '.\n"
                        + "<       =(@@@)=       >\n"
                        + " '.    .`/'''\\`.    .'\n"
                        + "   '--'  '-v-'\n"
                );
                this.sprite.add(
                        "              \\     /\n"
                        + "          \\    o ^ o    /\n"
                        + "            \\ (     ) /\n"
                        + " ____________(%%%%%%%)____________\n"
                        + "(     /   /  )%%%%%%%(  \\   \\     )\n"
                        + "(___/___/__/           \\__\\___\\___)\n"
                        + "   (     /  /(%%%%%%%)\\  \\     )\n"
                        + "    (__/___/ (%%%%%%%) \\___\\__)\n"
                        + "            /(       )\\\n"
                        + "          /   (%%%%%)   \\\n"
                        + "               (%%%)\n"
                        + "                 !");
            case 2:
                this.sprite.add(
                        "k\\     /j\n"
                        + "((^\\V/^))\n"
                        + " \\\\_|_//\n"
                        + " ((/|\\))");
                this.sprite.add(
                        "                           .oMc\n"
                        + "                        .MMMMMP\n"
                        + "                      .MM888MM\n"
                        + "....                .MM88888MP\n"
                        + "MMMMMMMMb.         d8MM8tt8MM\n"
                        + " MM88888MMMMc `:' dMME8ttt8MM\n"
                        + "  MM88tt888EMMc:dMM8E88tt88MP\n"
                        + "   MM8ttt888EEM8MMEEE8E888MC\n"
                        + "   `MM888t8EEEM8MMEEE8t8888Mb\n"
                        + "    \"MM88888tEM8\"MME88ttt88MM\n"
                        + "     dM88ttt8EM8\"MMM888ttt8MM\n"
                        + "     MM8ttt88MM\" \" \"MMNICKMM\"\n"
                        + "     3M88888MM\"      \"MMMP\"\n"
                        + "      \"MNICKM\"");
            case 3:
                this.sprite.add(
                        "    |\n"
                        + "  / | \\\n"
                        + "\\_\\(_)/_/\n"
                        + " _//\"\\\\_ \n"
                        + "  /   \\");
                this.sprite.add("           ____                      ,\n"
                        + "          /---.'.__             ____//\n"
                        + "               '--.\\           /.---'\n"
                        + "          _______  \\\\         //\n"
                        + "        /.------.\\  \\|      .'/  ______\n"
                        + "       //  ___  \\ \\ ||/|\\  //  _/_----.\\__\n"
                        + "      |/  /.-.\\  \\ \\:|< >|// _/.'..\\   '--'\n"
                        + "         //   \\'. | \\'.|.'/ /_/ /  \\\\\n"
                        + "        //     \\ \\_\\/\" ' ~\\-'.-'    \\\\\n"
                        + "       //       '-._| :H: |'-.__     \\\\\n"
                        + "      //           (/'==='\\)'-._\\     ||\n"
                        + "      ||                        \\\\    \\|\n"
                        + "      ||                         \\\\    '\n"
                        + "snd   |/                          \\\\\n"
                        + "                                   ||\n"
                        + "                                   ||\n"
                        + "                                   \\\\\n"
                        + "                                    '");
        }
        return this.sprite;
    }

    private Character setAtributos() {
        if (this.raca.equalsIgnoreCase("besouro")) {
            this.maxHealth = 35;
            this.health = this.maxHealth;
            this.damage = 3;
        } else if (this.raca.equalsIgnoreCase("abelha")) {
            this.maxHealth = 12;
            this.health = this.maxHealth;
            this.damage = 6;
        } else if (this.raca.equalsIgnoreCase("borboleta")) {
            this.maxHealth = 15;
            this.health = this.maxHealth;
            this.damage = 5;
        } else if (this.raca.equalsIgnoreCase("aranha")) {
            this.maxHealth = 25;
            this.health = this.maxHealth;
            this.damage = 4;
        }

        return this;
    }

    private String setRaca() {
        int numSortido = (int) (Math.random() * 4);
        //System.out.print(numSortido);
        this.raca = insetos[numSortido];
        setAtributos();
        spriteFunc(numSortido);
        return this.raca;
    }

    public Character() {
        this.raca = setRaca();
        this.humor = humorList[1];

    }

    protected int givingDamage(Character enemy) {
        System.out.printf(":    %s Atacou!!     +%d dmg%n",this.raca,this.damage);
        enemy.gettingHurt(this.damage);
        return this.damage;
    }

    protected int gettingHurt(int dmg) {
        this.health -= dmg;
        return this.health;
    }



}