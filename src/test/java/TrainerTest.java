import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TrainerTest {
    @Test
    public void testCreate() {
        //Given
        Trainer trainer = new Trainer("Vass István");

        //When
        String name = trainer.getName();

        //Then
        assertThat(name, equalTo("Vass István"));

    }

}