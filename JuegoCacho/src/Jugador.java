public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String Nombre, int Puntos) {
        this.nombre = Nombre;
        this.puntos = Puntos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    void mostrar(String jugar) {
        System.out.println( nombre + " tiene " + puntos + " puntos" );
    }
}