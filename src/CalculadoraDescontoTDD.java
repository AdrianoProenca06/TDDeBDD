public class CalculadoraDescontoTDD {

    public double calcularValorFinal(
            double valorItens, boolean vip) {

        if (valorItens > 1000) {
            return valorItens * 0.80;
        }

        if (valorItens > 500) {
            return valorItens * 0.90;
        }

        return valorItens;
    }
}
