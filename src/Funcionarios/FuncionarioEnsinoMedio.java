package Funcionarios;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico{

    public FuncionarioEnsinoMedio(String nome, int codFuncional, String escola, Comissao comissao) {
        super(nome, codFuncional, escola, comissao);
    }

    @Override
    public double getRendaTotal(){
        return (rendaBasica * 1.10 * 1.50) + getComissao().getValorAdicional();
    }

    @Override
    public String toString(){
        return super.toString().replace("Ensino Básico", "Ensino Médio");
    }
}
