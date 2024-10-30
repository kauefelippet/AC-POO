package gestao_funcionarios.departamento;

import gestao_funcionarios.funcionarios.FuncionarioBase;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<FuncionarioBase> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Adicionado " + funcionario.getNome() + " ao departamento " + this.nome);
    }

    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
        System.out.println("Removido " + funcionario.getNome() + " do departamento " + this.nome);
    }

    public double calcularFolhaPagamento() {
        double somaPagamentos = 0;
        for (FuncionarioBase f : funcionarios) {
            somaPagamentos += f.calcularSalario();
        }
        return somaPagamentos;
    }

    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase f : funcionarios) {
            System.out.println("\n\nFuncionário: " + f.getNome() +
                                "\nSalário: R$" + f.calcularSalario());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
