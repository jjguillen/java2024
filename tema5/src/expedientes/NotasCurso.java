package expedientes;

public class NotasCurso {

    private String materia;
    private int curso;
    private double nota1Ev;
    private double nota2Ev;
    private double nota3Ev;
    private double notaFinal;

    public NotasCurso(String materia, int curso) {
        this.materia = materia;
        this.curso = curso;
    }

    public NotasCurso(String materia, int curso, double nota1Ev, double nota2Ev, double nota3Ev) {
        this.materia = materia;
        this.curso = curso;
        this.nota1Ev = nota1Ev;
        this.nota2Ev = nota2Ev;
        this.nota3Ev = nota3Ev;
        this.notaFinal = calcularNotaFinal();
    }

    private double calcularNotaFinal() {
        return (this.nota1Ev + this.nota2Ev + this.nota3Ev) / 3;
    }

    public String getMateria() {
        return materia;
    }

    public int getCurso() {
        return curso;
    }

    public double getNota1Ev() {
        return nota1Ev;
    }

    public double getNota2Ev() {
        return nota2Ev;
    }

    public double getNota3Ev() {
        return nota3Ev;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNota1Ev(double nota1Ev) {
        this.nota1Ev = nota1Ev;
        this.notaFinal = calcularNotaFinal();
    }

    public void setNota2Ev(double nota2Ev) {
        this.nota2Ev = nota2Ev;
        this.notaFinal = calcularNotaFinal();
    }

    public void setNota3Ev(double nota3Ev) {
        this.nota3Ev = nota3Ev;
        this.notaFinal = calcularNotaFinal();
    }

    public boolean aprobado() {
        return (this.notaFinal >= 5);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("materia='").append(materia).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", nota1Ev=").append(nota1Ev);
        sb.append(", nota2Ev=").append(nota2Ev);
        sb.append(", nota3Ev=").append(nota3Ev);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }
}
