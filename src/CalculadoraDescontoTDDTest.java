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
}