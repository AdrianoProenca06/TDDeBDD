import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTradicionalTest {

    CalculadoraDescontoTradicional calc =
            new CalculadoraDescontoTradicional();

    @Test
    void compraSemDesconto() {
        assertEquals(200.0,
                calc.calcularValorFinal(200, false), 0.001);
    }

    @Test
    void descontoDezPorCento() {
        assertEquals(540.0,
                calc.calcularValorFinal(600, false), 0.001);
    }

    @Test
    void descontoVintePorCento() {
        assertEquals(960.0,
                calc.calcularValorFinal(1200, false), 0.001);
    }

    @Test
    void descontoVIP() {
        assertEquals(912.0,
                calc.calcularValorFinal(1200, true), 0.001);
    }

    @Test
    void freteParaPedidoPequeno() {
        assertEquals(65.0,
                calc.calcularValorFinal(50, false), 0.001);
    }

    @Test
    void valorInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularValorFinal(0, false));
    }

    @Test
    void compraExatamente500() {
        assertEquals(500.0,
                calc.calcularValorFinal(500, false), 0.001);
    }

    @Test
    void compraExatamente1000() {
        assertEquals(900.0,
                calc.calcularValorFinal(1000, false), 0.001);
    }

    @Test
    void freteExatamente100() {
        assertEquals(100.0,
                calc.calcularValorFinal(100, false), 0.001);
    }

    @Test
    void valorNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularValorFinal(-50, false));
    }

    @Test
    void clienteVIPComFrete() {
        assertEquals(110.0,
                calc.calcularValorFinal(100, true), 0.001);
    }
}
