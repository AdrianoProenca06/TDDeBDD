public class CalculadoraDescontoTDD {

    public double calcularValorFinal(
            double valorItens, boolean vip) {

        if (valorItens <= 0) {
            throw new IllegalArgumentException(
                    "O valor dos itens deve ser maior que zero.");
        }

        double valorFinal = valorItens;

        if (valorItens > 1000) {
            valorFinal *= 0.80;
        } else if (valorItens > 500) {
            valorFinal *= 0.90;
        }

        if (vip) {
            valorFinal *= 0.95;
        }

        if (valorFinal < 100) {
            valorFinal += 15;
        }

        return valorFinal;
    }
}
