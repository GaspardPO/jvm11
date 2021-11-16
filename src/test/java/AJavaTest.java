import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

class AJavaTest {

    @Test
    void a_failing_test(){
        fail();
    }

    @Test
    void a_passing_test(){
        assertThat(true).isTrue();
    }



}
