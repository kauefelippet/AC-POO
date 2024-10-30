package gestao_funcionarios.funcionarios;

public abstract class FuncionarioBase {

    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();

    public abstract double calcularSalario(double bonusAdicional);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
