package com.interview;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void check() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        Solution.run(new PrintStream(output, true, UTF_8));

        assertThat(output.toString(UTF_8)).isEqualTo("check() = 1" + System.lineSeparator());
    }
}
