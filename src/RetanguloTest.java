import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

class RetanguloTest {
    Retangulo retangulo;

    @BeforeEach
    void setup() {
        retangulo = new Retangulo(5.0, 3.0);
    }

    @Test
    void testCalcularPerimetro() {
        double perimetroEsperado = 16.0;
        double perimetroCalculado = retangulo.calcularPerimetro();
        assertEquals(perimetroEsperado, perimetroCalculado, 0.001);
    }

    @Test
    void testCalcularArea() {
        double areaEsperada = 15.0;
        double areaCalculada = retangulo.calcularArea();
        assertEquals(areaEsperada, areaCalculada, 0.001);
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.MILLISECONDS)
    void testConstrutorComBaseOuAlturaInvalida() {
        assertThrows(GeometriaException.class, () -> {new Retangulo(-2.0, 5.0);});
    }

    @ParameterizedTest
    @ValueSource(ints={2,4,6})
    public void testePar(int num) {
        assertTrue(num % 2 == 0);
    }
}