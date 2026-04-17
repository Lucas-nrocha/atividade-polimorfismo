package Funcionarios;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escola;

    public FuncionarioEnsinoBasico(String nome, int codFuncional, String escola, Comissao comissao) {
        super(nome, codFuncional, comissao);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public double getRendaTotal(){
        return (rendaBasica * 1.10) + getComissao().getValorAdicional();
    }

    @Override
    public String toString(){
        return super.toString() + "\nEscola: " + escola + "\nEscolaridade: Ensino Básico";
    }
}