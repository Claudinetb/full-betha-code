package AulaDez;

public class FiguraMain {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado( 2);
        Triangulo triangulo = new Triangulo(10,2,10,10,10);
        System.out.println(triangulo.getNomeFigura()+ " Area: "+triangulo.getArea()+" Perimetro: "+ triangulo.getPerimetro());
        System.out.println(quadrado.getNomeFigura()+" Area: "+quadrado.getArea()+" Perimetro:  "+ quadrado.getPerimetro());

    }

}
