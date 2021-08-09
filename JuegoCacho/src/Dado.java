public class Dado {
    private int  numero;
    private boolean volverALanzar;

    public Dado(int  numero,   boolean volverALanzar)   {
                this.numero = numero;
                this.volverALanzar = volverALanzar;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
         this.numero = numero;
    }

    public  boolean  isVolverALanzar()  {
          return volverALanzar;
    }

    public void setVolverALanzar(boolean volverALanzar) {
          this.volverALanzar = volverALanzar;
    }

    void Mostrar() {
          System.out.print( numero + " " );
    }

}

