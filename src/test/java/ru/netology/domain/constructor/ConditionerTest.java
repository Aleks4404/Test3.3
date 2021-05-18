package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    public ConditionerTest() {
    }

    @Test
    public void shouldUseConstructor() {
        Conditioner conditioner = new Conditioner(
                1,
                "Winter Cold",
                30,
                15,
                22,
                true
        );
        assertEquals("Winter Cold", conditioner.getName());
        assertEquals(30, conditioner.getMaxTemperature());
        assertEquals(15, conditioner.getMinTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Conditioner conditioner = new Conditioner();

        assertEquals("Winter Cold", conditioner.getName());
        assertEquals(30, conditioner.getMaxTemperature());
        assertEquals(15, conditioner.getMinTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
    }
}
