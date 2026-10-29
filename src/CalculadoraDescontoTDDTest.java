import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTDDTest {

    CalculadoraDescontoTDD calc =
            new CalculadoraDescontoTDD();

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
}