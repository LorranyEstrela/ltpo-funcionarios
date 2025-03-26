//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //Criando funcionarios manualmente
        Funcionarios[] funcionarios = {
                new Funcionarios("Ana", 3000.0, 170),
                new Funcionarios("Carlos", 2800.0, 160),
                new Funcionarios("Mariana", 3500.0, 180),
                new Funcionarios("João", 2500.0, 155)
        };
        //Exibição do relatório
        System.out.println("\nRelatório de Funcionários:");
        for (Funcionarios funcionario : funcionarios){
            funcionario.exibirdados();
        }
    }
}