class Funcionarios {
    private String nome;
    private double salarioBase;
    private int horasTrabalhadas;

    //Construtor
    public Funcionarios(String nome, Double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //Método para calcular o salario final
    public double calcularSalarioFinal() {
        int horasNormais = 160;
        double valorHora = salarioBase / horasNormais;
        if (horasTrabalhadas > horasNormais) {
            int horasExtras = horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHora * 1.5);
        }
        return salarioBase;
    }

    //Método para exibir os dados do funcionário
    public void exibirdados() {
        System.out.printf("Funcionários: %s\n,", nome);
        System.out.printf("Salário Base: R$%.2f\n", salarioBase);
        System.out.printf("Horas Trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salário Final: R$%.2f\n", calcularSalarioFinal());
        System.out.println("-------------------------------------------------");
    }
}