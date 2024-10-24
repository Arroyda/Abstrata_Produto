// Classe que representa um funcionário assalariado
class FuncionarioAssalariado extends Funcionario {
    private double salario; // Atributo para armazenar o salário do funcionário

    // Construtor para inicializar o salário
    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    // Implementação do método calcularBonus para funcionário assalariado
    @Override
    public double calcularBonus() {
        return 5000.00; // Bônus fixo de R$ 5.000,00
    }
}