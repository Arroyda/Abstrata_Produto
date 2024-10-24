// Classe principal para executar o sistema
public class Main {
    public static void main(String[] args) {
        // Cria uma instância de FuncionarioAssalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(50000.00);
        // Cria uma instância de FuncionarioHorista
        Funcionario funcionarioHorista = new FuncionarioHorista(60000.00);

        // Calcula e exibe o bônus do funcionário assalariado
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());
        // Calcula e exibe o bônus do funcionário horista
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}
