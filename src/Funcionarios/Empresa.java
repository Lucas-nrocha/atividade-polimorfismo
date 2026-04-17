package Funcionarios;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        Comissao comissaoGerente = new Gerente();
        Comissao comissaoSupervisor = new Supervisor();
        Comissao comissaoVendedor = new Vendedor();

        funcionarios[0] = new FuncionarioEnsinoBasico("Ana", 101, "Escola A", comissaoVendedor);
        funcionarios[1] = new FuncionarioEnsinoBasico("Bruno", 102, "Escola B", comissaoVendedor);
        funcionarios[2] = new FuncionarioEnsinoBasico("Carlos", 103, "Escola C", comissaoVendedor);
        funcionarios[3] = new FuncionarioEnsinoBasico("Daniela", 104, "Escola D", comissaoVendedor);

        funcionarios[4] = new FuncionarioEnsinoMedio("Eduardo", 105, "Colegio A", comissaoSupervisor);
        funcionarios[5] = new FuncionarioEnsinoMedio("Fernanda", 106, "Colegio B", comissaoSupervisor);
        funcionarios[6] = new FuncionarioEnsinoMedio("Gabriel", 107, "Colegio C", comissaoSupervisor);
        funcionarios[7] = new FuncionarioEnsinoMedio("Helena", 108, "Colegio D", comissaoSupervisor);

        funcionarios[8] = new FuncionarioGraduado("Igor", 109, "Colegio E", "USP", comissaoGerente);
        funcionarios[9] = new FuncionarioGraduado("Juliana", 110, "Colegio F", "UNICAMP", comissaoGerente);

        double totalEmpresa = 0.0;
        double totalBasico = 0.0;
        double totalMedio = 0.0;
        double totalGraduado = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.getRendaTotal();
            totalEmpresa += renda;

            if (funcionario instanceof FuncionarioGraduado) {
                totalGraduado += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                totalMedio += renda;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                totalBasico += renda;
            }
        }

        System.out.println("Funcionarios: ");
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
            System.out.println();
        }

        System.out.println("Custo total da empresa: R$ " + String.format("%.2f", totalEmpresa));
        System.out.println("Custo com ensino basico: R$ " + String.format("%.2f", totalBasico));
        System.out.println("Custo com ensino medio: R$ " + String.format("%.2f", totalMedio));
        System.out.println("Custo com nivel superior: R$ " + String.format("%.2f", totalGraduado));
    }
}
