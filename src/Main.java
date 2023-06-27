
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("círculo", 3);
        Rectangulo rectangulo = new Rectangulo("rectángulo", 5,3);
        Cuadrado cuadrado = new Cuadrado("cuadrado", 5);

        System.out.println(circulo.dibujar());
        System.out.println("-----------------");
        System.out.println(rectangulo.dibujar());
        System.out.println("-----------------");
        System.out.println(cuadrado.dibujar());
    }
}