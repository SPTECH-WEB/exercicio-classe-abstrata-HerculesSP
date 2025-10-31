package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(){

    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calcularArea(){
        return base*altura/2;
    }

    public String toString() {
        return "Base do triângulo: " + altura + "Altura do triângulo: " + altura + "Área do retângulo:" + calcularArea();
    }
}
