package com.YJH.MyTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCal {
    @Test
    public void test() {
        Calculator calc = new Calculator();

        assertThat(calc.add(5, 10)).isEqualTo(15);
        assertThat(calc.sub(10, 5)).isEqualTo(5);
        assertThat(calc.mul(10, 5)).isEqualTo(50);
        assertThat(calc.div(10, 5)).isEqualTo(2);
        assertThat(calc.mod(10, 5)).isEqualTo(0);
        assertThat(calc.square(2, 3)).isEqualTo(8);
        assertThat(calc.arrangementSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(45);

    }

}
