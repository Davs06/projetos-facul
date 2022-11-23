class Funcionario {
    // atributos --------------------------------
    public String nome;
    public int idade;
    public int anoDeIngresso = 2021;
    public double salario = 2000.00;
    public int anoAtual = 2041;

    // metodo de aumento de salario anual -----------------------
    public double salarioAnual(double salario) {

        int quantidadeDeAnos = anoAtual - anoDeIngresso;
        double aumento = 0.005;

        return salario = (this.salario * aumento * quantidadeDeAnos) + this.salario;
    }

    // metodo de amento de salario quinquenal ----------------
    public double SalarioQuinquenal(double salario) {

        int quantidade5Anos = (anoAtual - anoDeIngresso) % 5;
        double aumento5 = 0.05;

        if (quantidade5Anos == 0 ) {

            salario = (this.salario * aumento5 * ((anoAtual - anoDeIngresso) / 5));

        }
        return salario;

    }

    // metodo de salario total -------------------
    public double salarioAtual(double salario) {

        return salario = salarioAnual(salario) + SalarioQuinquenal(salario);
    }
}

// int quantidadeDeAnos = anoAtual - anoDeIngresso;
// double aumento = 0.005;
// int quantidadeDe5Anos = (anoAtual - anoDeIngresso) % 5;
// double aumento5 = 0.05;

// if (quantidadeDeAnos > 1 && quantidadeDe5Anos != 0) {

// salario = (this.salario * aumento * quantidadeDeAnos) + this.salario;

// } else if (quantidadeDeAnos > 1 && quantidadeDe5Anos == 0) {

// salario = (this.salario * aumento * quantidadeDeAnos)
// + (this.salario * aumento5 * ((anoAtual - anoDeIngresso) / 5)) +
// this.salario;

// } else {
// System.out.println(this.salario);
// }