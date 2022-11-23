public class Professor extends Pessoa {

    private String materia;
    private double salario;

    public double salario( double salarioComDesconto) {

         return salarioComDesconto = this.salario * 0.10 + this.salario;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {

        this.materia = materia;

    }


    public String getSalario() {
        return this.materia;
    }

    public void setSalario(double salario) {

        this.salario = salario;

    }

}
