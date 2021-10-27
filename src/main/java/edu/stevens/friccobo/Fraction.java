package edu.stevens.friccobo;

import java.util.Objects;

public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other){
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).reduce();
    }
    /**
     * Reduces a fraction by dividing the numerator and denominator by the greatest
     * common factor.
     * @return a reduced fraction
     */
    public Fraction reduce(){
        int gcd = gcd(numerator, denominator); // Replace 0 with the correct calculation
        int newNumerator =  numerator/gcd; // Replace 0 with the correct calculation
        int newDenominator = denominator/gcd;

        return new Fraction(newNumerator, newDenominator);
    }

    private int gcd(int a, int b){
        // implement Euclid's algorithm
        while(b != 0)
        {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
