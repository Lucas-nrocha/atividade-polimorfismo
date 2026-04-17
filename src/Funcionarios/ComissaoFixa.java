package Funcionarios;

public class ComissaoFixa extends Comissao {
    private double valor;

    public ComissaoFixa(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorAdicional() {
        return valor;
    }
}