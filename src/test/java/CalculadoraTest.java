import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {


    @Test
    void sumarTest(){
        int sumaActual = Calculadora.sumar(1, 2);
        int sumaEsperada = 3;
        assertEquals(sumaActual, sumaEsperada);
    }

    @Test
    void sumarTest2(){
        int sumaActual = Calculadora.sumar(0, -3);
        int sumaEsperada = -3;
        assertEquals(sumaActual, sumaEsperada);
    }

}
