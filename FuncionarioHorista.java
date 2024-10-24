// Classe que representa um funcionário horista
class FuncionarioHorista extends Funcionario {
    private double totalAnualRecebido; // Atributo para armazenar o total anual recebido

    // Construtor para inicializar o total anual recebido
    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    // Implementação do método calcularBonus para funcionário horista
    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10; // Bônus de 10% do total anual recebido
    }
}