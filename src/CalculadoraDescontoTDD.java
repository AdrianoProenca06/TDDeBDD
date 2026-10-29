public class CalculadoraDescontoTDD {

    public double calcularValorFinal(
            double valorItens, boolean vip) {

        double valorFinal = valorItens;

        if (valorItens > 1000) {
            valorFinal *= 0.80;
        } else if (valorItens > 500) {
            valorFinal *= 0.90;
        }

        if (vip) {
            valorFinal *= 0.95;
        }

        return valorFinal;
    }
}
