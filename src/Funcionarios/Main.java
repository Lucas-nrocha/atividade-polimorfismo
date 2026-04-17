package Funcionarios;

public class Main {
    public static void main(String[] args) {
        Comissao c1 = new ComissaoFixa(100.00);
        Comissao c2 = new ComissaoFixa(150.00);
        Comissao c3 = new ComissaoFixa(200.00);
        Comissao c4 = new ComissaoFixa(250.00);

        Funcionario f1 = new Funcionario("Lucas", 101, c1);
        Funcionario f2 = new FuncionarioEnsinoBasico("Robson", 102, "Lenita correia camargo", c2);
        Funcionario f3 = new FuncionarioEnsinoMedio("Pedro", 115, "Colégio pedro", c3);
        Funcionario f4 = new FuncionarioGraduado("Matheus", 95, "São paulo tech school", "SPTECH", c4);

        System.out.println(f1);
        System.out.println();

        System.out.println(f2);
        System.out.println();

        System.out.println(f3);
        System.out.println();

        System.out.println(f4);

    }
}
