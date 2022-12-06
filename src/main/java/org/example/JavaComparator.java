package org.example;

import java.util.*;

public class JavaComparator {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = scanner.nextInt();
        Player player;
        ArrayList<Player> players = new ArrayList<>();

        do {
            String name = scanner.next().toLowerCase();
            int score = scanner.nextInt();
            player = new Player(name, score);
            players.add(player);
            count--;
        } while (count > 0);
        players.sort(new SortByScore());

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).name + " " + players.get(i).score);
        }
    }
}


class Player {
    public String name;
    public Integer score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class SortByScore implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        int nameCompare = o1.name.compareTo(
               o2.name);
        int scoreCompare = o2.score.compareTo(
                o1.score);

//        return (nameCompare == 0) ? nameCompare
//                :scoreCompare;
        int [] number = {1,2,3,4};

        /*

       ? nameCompare : scoreCompare
       insemana

     - daca scorul este egal cu 0 atunci returneaza valoarea celalata si ordoneazale crescator
         */
        return (scoreCompare == 0 ) ? nameCompare : scoreCompare;
    }
}