package com.interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addsTwoNumbers() {
        assertThat(solution.add(2, 3)).isEqualTo(5);
    }
}
