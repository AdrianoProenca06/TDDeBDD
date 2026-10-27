public class CalculadoraDescontoTDD {

    public double calcularValorFinal(
            double valorItens, boolean vip) {

        validarValor(valorItens);

        double valorFinal = aplicarDesconto(valorItens);

        if (vip) {
            valorFinal *= 0.95;
        }

        if (valorFinal < 100) {
            valorFinal += 15;
        }

        return valorFinal;
    }

    private void validarValor(double valorItens) {
        if (valorItens <= 0 || !Double.isFinite(valorItens)) {
            throw new IllegalArgumentException(
                    "O valor deve ser maior que zero e finito.");
        }
    }

    private double aplicarDesconto(double valorItens) {
        if (valorItens > 1000) {
            return valorItens * 0.80;
        }

        if (valorItens > 500) {
            return valorItens * 0.90;
        }

        return valorItens;
    }
}
