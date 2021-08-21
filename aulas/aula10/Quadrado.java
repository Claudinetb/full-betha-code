package AulaDez;

public class Quadrado implements FiguraGeometrica{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public Integer getArea() {
        return lado*lado;
    }

    @Override
    public Integer getPerimetro() {
        return lado*4;
    }
}
