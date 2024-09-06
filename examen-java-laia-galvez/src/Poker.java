import java.util.ArrayList;

public class Poker {
    public static void main(String[] args) throws Exception {
        
        JugadorPoker poker1 = new JugadorPoker("Laia", 28, "Mujer", 2); 
        JugadorPoker poker2 = new JugadorPoker("Eric", 30, "Hombre", 1);
        JugadorPoker poker3 = new JugadorPoker("Cooper", 10, "Macho", 3);
        JugadorPoker poker4 =  new JugadorPoker("Gennai", 11, "Hembra", 4);
        JugadorPoker poker5 = new JugadorPoker("Mars", 4, "Macho", 5);
        JugadorPoker poker6 = new JugadorPoker("Taichi", 4, "Hembra", 6);

        // añadir jugadores a la arraylist

        ArrayList <JugadorPoker> listaJugadores = new ArrayList<>();

        // añado a listas

        listaJugadores.add(poker1);
        listaJugadores.add(poker2);
        listaJugadores.add(poker3);
        listaJugadores.add(poker4);
        listaJugadores.add(poker5);
        listaJugadores.add(poker6);

        // mostrar todos los jugadores

        for (JugadorPoker poker : listaJugadores) {
            System.out.println(poker);
        }
        
        // método celebrar victoria:

        JugadorPoker ganadorPoker = listaJugadores.get(0);
        
        for (JugadorPoker poker : listaJugadores) {
            if (poker.getPosicionTorneo() < ganadorPoker.getPosicionTorneo()) {
                ganadorPoker = poker;
            }
        }

        System.out.println("El ganador es: " + ganadorPoker.getNombrePoker());
        ganadorPoker.celebrarVictoria();

    }
}
