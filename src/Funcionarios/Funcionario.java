package Funcionarios;

public class Funcionario {
    private String nome;
    private int codFuncional;
    protected double rendaBasica = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, int codFuncional, Comissao comissao) {
        this.nome = nome;
        this.codFuncional = codFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFuncional() {
        return codFuncional;
    }

    public void setCodFuncional(int codFuncional) {
        this.codFuncional = codFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double getRendaTotal(){
        return rendaBasica + comissao.getValorAdicional();
    }

    @Override
    public String toString(){
        String nomeComissao;
        if (comissao instanceof Gerente) {
            nomeComissao = "Gerente";
        } else if (comissao instanceof Supervisor) {
            nomeComissao = "Supervisor";
        } else if (comissao instanceof Vendedor) {
            nomeComissao = "Vendedor";
        } else if (comissao instanceof ComissaoFixa) {
            nomeComissao = "Comissão Fixa";
        } else {
            nomeComissao = "Desconhecida";
        }

        return "Nome: " + nome + "\nCódigo funcional: " + codFuncional +
                "\nComissão: " + nomeComissao + " (R$ " + String.format("%.2f", comissao.getValorAdicional()) + ")" +
                "\nRenda total: R$ " + String.format("%.2f", getRendaTotal());
    }
}
