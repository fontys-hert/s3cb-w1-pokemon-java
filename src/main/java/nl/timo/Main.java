package nl.timo;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pika", 20, 3);
        Pokemon bulba = new Pokemon("Bulba", 25, 5);

        System.out.println(pikachu.attack(bulba, new DieImpl()));
    }
}