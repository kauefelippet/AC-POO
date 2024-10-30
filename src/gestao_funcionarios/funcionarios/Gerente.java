package gestao_funcionarios.funcionarios;

public class Gerente extends FuncionarioBase implements Beneficios {

    private double bonusPercentual;

    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus(bonusPercentual);
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }

    @Override
    public double calcularBonus(double percentual) {
        return getSalarioBase() * (percentual * 0.01);
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0;
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }
}
