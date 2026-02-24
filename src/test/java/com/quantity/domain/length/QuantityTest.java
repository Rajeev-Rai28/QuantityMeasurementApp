package com.quantity.domain.length;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    private static final double EPSILON = 1e-6;

    // ------------------------------
    // Addition Tests
    // ------------------------------

    @Test
    void testAddition_TargetFeet() {

        Quantity result = Quantity.add(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(12.0, LengthUnit.INCHES),
                LengthUnit.FEET
        );

        assertEquals(new Quantity(2.0, LengthUnit.FEET), result);
    }

    @Test
    void testAddition_TargetInches() {

        Quantity result = Quantity.add(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES
        );

        assertEquals(new Quantity(24.0, LengthUnit.INCHES), result);
    }

    @Test
    void testAddition_TargetYards() {

        Quantity result = Quantity.add(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        assertEquals(0.666666, result.getValue(), EPSILON);
        assertEquals(LengthUnit.YARDS, result.getUnit());
    }

    @Test
    void testAddition_Commutative() {

        Quantity r1 = Quantity.add(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        Quantity r2 = Quantity.add(
                new Quantity(12.0, LengthUnit.INCHES),
                new Quantity(1.0, LengthUnit.FEET),
                LengthUnit.YARDS
        );

        assertEquals(r1, r2);
    }

    @Test
    void testAddition_NegativeValues() {

        Quantity result = Quantity.add(
                new Quantity(5.0, LengthUnit.FEET),
                new Quantity(-2.0, LengthUnit.FEET),
                LengthUnit.INCHES
        );

        assertEquals(new Quantity(36.0, LengthUnit.INCHES), result);
    }

    @Test
    void testAddition_NullTargetUnit() {

        assertThrows(IllegalArgumentException.class,
                () -> Quantity.add(
                        new Quantity(1.0, LengthUnit.FEET),
                        new Quantity(12.0, LengthUnit.INCHES),
                        null
                ));
    }

    // ------------------------------
    // Conversion Tests
    // ------------------------------

    @Test
    void testConvertTo_Inches() {

        Quantity q = new Quantity(1.0, LengthUnit.FEET);
        Quantity result = q.convertTo(LengthUnit.INCHES);

        assertEquals(new Quantity(12.0, LengthUnit.INCHES), result);
    }

    @Test
    void testConvertTo_Yards() {

        Quantity q = new Quantity(3.0, LengthUnit.FEET);
        Quantity result = q.convertTo(LengthUnit.YARDS);

        assertEquals(new Quantity(1.0, LengthUnit.YARDS), result);
    }

    // ------------------------------
    // Equality Tests
    // ------------------------------

    @Test
    void testEquality_FeetAndInches() {

        assertEquals(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(12.0, LengthUnit.INCHES)
        );
    }

    @Test
    void testEquality_YardsAndFeet() {

        assertEquals(
                new Quantity(1.0, LengthUnit.YARDS),
                new Quantity(3.0, LengthUnit.FEET)
        );
    }

    @Test
    void testInequality() {

        assertNotEquals(
                new Quantity(1.0, LengthUnit.FEET),
                new Quantity(2.0, LengthUnit.FEET)
        );
    }
}