package gestao_funcionarios.funcionarios;

public class Diretor extends FuncionarioBase implements Beneficios {

    private double bonusPercentual;
    private double auxilioMoradia;

    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
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
        return valorFixado;
    }

    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }

    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public String toString() {
        return "Diretor: " + this.getNome();
    }
}
