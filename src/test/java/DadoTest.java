import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DadoTest {

    private Dado dado;

    @BeforeEach
    void init(){
        dado = new Dado();
    }

    @Test
    void lanzarTest(){
        for (int i = 0; i < 100; i++) {
            dado.lanzar();
            int caraSuperior = dado.getCaraSuperior();
            assertTrue(caraSuperior > 0 && caraSuperior < 7);
        }
    }
}
