package nl.timo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void attack_hits() {
        Pokemon pikachu = new Pokemon("Pika", 20, 3);
        Pokemon bulba = new Pokemon("Bulba", 25, 5);

        pikachu.attack(bulba, new DummyDie(15, 1));

        assertEquals(24, bulba.getCurrentHp());
    }

    @Test
    void attack_misses() {
        Pokemon pikachu = new Pokemon("Pika", 20, 3);
        Pokemon bulba = new Pokemon("Bulba", 25, 5);

        var result = pikachu.attack(bulba, new DummyDie(4, 8));

        assertTrue(result.contains("Miss!"));
    }

    @Test
    void attack_hits_and_dies() {
        Pokemon bulba = new Pokemon("Bulba", 25, 5);
        Pokemon caterpie = new Pokemon("Caterpie", 2, 1);

        bulba.attack(caterpie, new DummyDie(20, 8));

        assertEquals(0, caterpie.getCurrentHp());
        assertTrue(caterpie.isDead());

    }
}