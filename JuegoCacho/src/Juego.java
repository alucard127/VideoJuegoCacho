import java.util.Scanner;

public class Juego {
    private Dado[]     dados = new Dado[5];
    private Jugador[]  jugadores;
    private Scanner teclado = new Scanner (System.in);

    void menu( ) {
        inicializaciones( );
        registrarjugadores( );
        jugar( );
        }
    void inicializaciones( ) {
        for ( int i = 0 ; i < dados.length ; i++ ){
        dados[i] = new Dado( 1, false );
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Cuantos Jugadores van a Jugar" );
        int cantidadJugadores = teclado.nextInt();
        jugadores = new Jugador [cantidadJugadores];
    }
    void registrarjugadores( ) {
        for ( int i = 0 ; i < jugadores.length ; i++ ){
        System.out.println( "Nombre Jugador" );
        String nombre = teclado.next();
        jugadores[i] = new Jugador(nombre, 2);
        }
    }
        void jugar( ) {
        System.out.println( "jugar" );
            for ( int i = 0 ; i < jugadores.length ; i++ ){
                    jugadores[i].mostrar("Jugar");
        }
    }
}
