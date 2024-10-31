package gestao_funcionarios.funcionarios;

public class Funcionario extends FuncionarioBase {

    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase();
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return this.getSalarioBase() + bonusAdicional;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNome();
    }
}
