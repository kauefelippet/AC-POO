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

        tecnologia.adicionarFuncionario(f1);
        tecnologia.adicionarFuncionario(g1);
        tecnologia.adicionarFuncionario(d1);

        tecnologia.imprimirSalariosFuncionarios();

        System.out.println("\n\nFolha de pagamento: R$" + tecnologia.calcularFolhaPagamento());
    }
}
