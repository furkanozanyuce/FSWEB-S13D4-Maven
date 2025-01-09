package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point(0,0);

        System.out.println("distance(0,0)= " + first.distance()); // distance(0,0)= 7.810249675906654
        System.out.println("distance(second)= " + first.distance(second)); // distance(second)= 5.0
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // distance(2,2)= 5.0
        System.out.println("distance()= " + point.distance()); // distance()= 0.0

        System.out.println("------------------------");

        Player player1 = new Player("Furkan", 120, Weapon.SWORD);
        Player player2 = new Player("Divenmal", 100, Weapon.SPEAR);
        Player player3 = new Player("Dmal", -70, Weapon.BOW);
        Player player4 = new Player("ASD", 50, Weapon.AXE);

        System.out.println(player1.healthRemaining()); // 100
        System.out.println(player2.healthRemaining()); // 100
        System.out.println(player3.healthRemaining()); // 0
        System.out.println(player4.healthRemaining()); // 50

        player1.loseHealth(30);
        System.out.println(player1.healthRemaining()); // 70

        player1.loseHealth(100); // player has been knocked out of game

        player2.loseHealth(60);
        System.out.println(player2.healthRemaining()); // 40

        player3.restoreHealth(30);
        player3.restoreHealth(20);
        System.out.println(player3.healthRemaining()); // 50

        player4.restoreHealth(50);
        System.out.println(player4.healthRemaining()); // 100
    }
}