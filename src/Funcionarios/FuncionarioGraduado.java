package Funcionarios;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio{
    private String universidade;

    public FuncionarioGraduado(String nome, int codFuncional, String escola, String universidade, Comissao comissao) {
        super(nome, codFuncional, escola, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public double getRendaTotal(){
        return (rendaBasica * 1.10 * 1.50 * 2.0) + getComissao().getValorAdicional();
    }

    @Override
    public String toString(){
        return super.toString().replace("Ensino Médio", "Graduação")
                + "\nUniversidade: " + universidade;
    }
}
