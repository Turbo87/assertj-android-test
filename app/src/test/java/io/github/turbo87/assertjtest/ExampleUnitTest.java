package io.github.turbo87.assertjtest;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertThat(2 + 2).isEqualTo(4);
    }
}
