package com.interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void check() {
        assertThat(new Solution().check()).isEqualTo(1);
    }
}
