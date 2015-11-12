package io.github.turbo87.assertjtest;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertThat(2 + 2).isEqualTo(4);
    }

    @Test
    public void testExceptions() throws Exception {
        assertThatThrownBy(new ThrowableAssert.ThrowingCallable() {
            @Override
            public void call() throws Throwable {
                throw new IllegalArgumentException("foo");
            }
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("foo");
    }
}
