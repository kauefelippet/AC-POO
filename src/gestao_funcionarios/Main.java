package gestao_funcionarios;

import gestao_funcionarios.departamento.Departamento;
import gestao_funcionarios.funcionarios.Diretor;
import gestao_funcionarios.funcionarios.Funcionario;
import gestao_funcionarios.funcionarios.Gerente;

public class Main {

    public static void main(String[] args) {

        Departamento tecnologia = new Departamento("Tecnologia");

        Funcionario f1 = new Funcionario("João", 3_000);
        Gerente g1 = new Gerente("Maria", 5_000, 20);
        Diretor d1 = new Diretor("Carlos", 10_000, 30, 2_000);

        tecnologia.adicionarFuncionario(g1);
        tecnologia.adicionarFuncionario(d1);
        tecnologia.adicionarFuncionario(f1);

        tecnologia.imprimirSalariosFuncionarios();

        System.out.printf("\nFolha de pagamento -> %s", tecnologia.getNome() +
                        ": R$" + tecnologia.calcularFolhaPagamento() + "\n\n");

        Funcionario f2 = new Funcionario("José", 3_000);

        tecnologia.adicionarFuncionario(f2);
        tecnologia.exibirFuncionarios();

        System.out.printf("\nFolha de pagamento -> %s", tecnologia.getNome() +
                ": R$" + tecnologia.calcularFolhaPagamento() + "\n\n");

        tecnologia.removerFuncionario(f2);
        tecnologia.exibirFuncionarios();
    }
}
