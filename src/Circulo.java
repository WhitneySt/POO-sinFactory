public class Circulo extends FiguraGeometrica{
   private int radio;

    Circulo(String nombre, int radio){
        super(nombre);
        this.radio = radio;
    }



    @Override
    public String dibujar(){
        return "Dibujar un "+ this.getNombre() +" cuyo radio sea de "+ this.radio+" cm";
    }

}
