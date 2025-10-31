package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(){

    }
    public Double calcularArea(){
        return lado*lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public String toString() {
        return "Lado do quadrado: " + lado + "Área do quadrado:" + calcularArea();
    }
}
