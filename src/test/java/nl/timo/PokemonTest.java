package nl.timo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void attack_hits() {
        Pokemon pikachu = new Pokemon("Pika", 20, 3);
        Pokemon bulba = new Pokemon("Bulba", 25, 5);

        assertTrue(pikachu.attack(bulba, new DummyDie(15)).contains("Hit!"));
    }

    @Test
    void attack_misses() {
        Pokemon pikachu = new Pokemon("Pika", 20, 3);
        Pokemon bulba = new Pokemon("Bulba", 25, 5);

        var result = pikachu.attack(bulba, new DummyDie(4));

        assertTrue(result.contains("Miss!"));
    }
}