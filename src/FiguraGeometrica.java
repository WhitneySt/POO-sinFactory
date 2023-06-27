public abstract class FiguraGeometrica {
    private String nombre;

    FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String dibujar();
}
