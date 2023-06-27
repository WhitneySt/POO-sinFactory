public class Cuadrado extends FiguraGeometrica{
    private int lado;

    Cuadrado(String nombre, int lado){
        super(nombre);
        this.lado = lado;
    }



    @Override
    public String dibujar(){
        return "Dibujar un "+ this.getNombre() +" cuyos lados sean de "+ this.lado+" cm.";
    }
}
