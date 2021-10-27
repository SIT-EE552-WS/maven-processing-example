package edu.stevens.friccobo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    @Test
    public void testAdd() {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 4);

        Fraction result = fraction1.add(fraction2);

        assertEquals(new Fraction(1, 1), result);
    }

    @Test
    public void testAdd2() {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 4);

        Fraction result = fraction1.add(fraction2);

        // This is the easier syntax I was trying to write during class
        // I forgot that we needed one more dependency (Hamcrest) to make
        // it possible.
        assertThat(result, is(new Fraction(1, 1)));
    }
}