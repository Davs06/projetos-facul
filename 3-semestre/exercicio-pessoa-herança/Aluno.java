public class Aluno extends Pessoa {

    private String ra;
    private int nota1;
    private int nota2;

    public int calculo(int media) {

         return media = (this.nota1 + this.nota2) / 2;
    }

    public void calculo(int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {

        this.ra = ra;
    }
}
