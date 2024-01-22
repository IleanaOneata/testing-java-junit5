package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * @author ileanaoneata on 19.01.2024
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controllers")
public interface ControllerTests {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Lets do something here");
    }
}
