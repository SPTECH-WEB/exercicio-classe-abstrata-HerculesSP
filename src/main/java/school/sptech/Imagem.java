package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem(){
        figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void adicionar(Figura figura){
            figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double tmp = 0.0;
        for (Figura figura : figuras){
            tmp+= figura.calcularArea();
        }
        return tmp;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> tmp = new ArrayList<>();
        for (Figura figura : figuras){
            if (figura.calcularArea() > 20){
                tmp.add(figura);
            }
        }
        return tmp;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> tmp = new ArrayList<>();
        for (Figura figura : figuras){
            if (figura instanceof Quadrado){
                tmp.add(figura);
            }
        }
        return tmp;
    }
}
