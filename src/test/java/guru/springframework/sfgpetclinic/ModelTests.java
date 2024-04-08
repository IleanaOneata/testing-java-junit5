package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * @author ileanaoneata on 19.01.2024
 */

@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName());
    }
}
