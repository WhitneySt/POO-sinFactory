public class Rectangulo extends FiguraGeometrica{
    private int ancho;
    private int alto;

    Rectangulo(String nombre, int ancho, int alto){
        super(nombre);
        this.alto = alto;
        this.ancho = ancho;
    }


    @Override
    public String dibujar(){
        return "Dibujar un "+ this.getNombre() +" cuyo alto sea de "+ this.alto+" cm y ancho de "+ this.ancho+ " cm";
    }
}
