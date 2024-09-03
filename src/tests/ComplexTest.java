package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

class ComplexTest {

    private Complex a;
    private Complex b;

    @Test
    void plus() {
        a = new Complex(1, 2);
        b = new Complex(3, 4);
        Complex expected = new Complex(4, 6);
        Complex actual = a.plus(b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minus() {
        a = new Complex(3, 4);
        b = new Complex(1, 2);
        Assertions.assertEquals(new Complex(2, 2), a.minus(b));
    }
}