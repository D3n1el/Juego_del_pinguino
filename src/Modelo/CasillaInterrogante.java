package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class CasillaInterrogante extends Casilla {
	
	//Constructor
	public CasillaInterrogante(int tipo, int posicion) {
		super(tipo, posicion);
		
	}
	

	
	public void activarEventoAleatorio(Jugador jugador) {
		Random random = new Random();
		Evento evento = new Evento();
        // Aquí se genera un número aleatorio para decidir qué tipo de evento se ejecuta
        int tipoEvento = random.nextInt(100); // Genera un número aleatorio entre 0 y 99

        if (tipoEvento < 30) {
            // Evento: Obtener un pez
            evento.ejecutarEventoPez(jugador);
        } else if (tipoEvento < 60) {
            // Evento: Obtener entre 1 y 3 bolas de nieve
            evento.ejecutarEventoBolasDeNieve(jugador);
        } else if (tipoEvento < 75) {
            // Evento: Obtener dado rápido (probabilidad baja)
            evento.ejecutarEventoDadoRapido(jugador);
        } else {
            // Evento: Obtener dado lento (probabilidad más alta)
            evento.ejecutarEventoDadoLento(jugador);
        }
    }


	
}
