public class JugadorPoker {
    
    private String nombrePoker;
    private int edadPoker;
    private String sexoPoker;
    private int posicionTorneo;

    public JugadorPoker() {
    }

    public JugadorPoker(String nombrePoker, int edadPoker, String sexoPoker, int posicionTorneo) {
        this.nombrePoker = nombrePoker;
        this.edadPoker = edadPoker;
        this.sexoPoker = sexoPoker;
        this.posicionTorneo = posicionTorneo;
    }

    public String getNombrePoker() {
        return nombrePoker;
    }

    public void setNombrePoker(String nombrePoker) {
        this.nombrePoker = nombrePoker;
    }

    public int getEdadPoker() {
        return edadPoker;
    }

    public void setEdadPoker(int edadPoker) {
        this.edadPoker = edadPoker;
    }

    public String getSexoPoker() {
        return sexoPoker;
    }

    public void setSexoPoker(String sexoPoker) {
        this.sexoPoker = sexoPoker;
    }

    public int getPosicionTorneo() {
        return posicionTorneo;
    }

    public void setPosicionTorneo(int posicionTorneo) {
        this.posicionTorneo = posicionTorneo;
    }

    public void celebrarVictoria(){
        System.out.println(nombrePoker + " dice: " + "¡He ganado cabrones!");
    }

    @Override
    public String toString() {
        return "Nombre Poker: " + nombrePoker
                + "; " +
                "Edad Poker: " + edadPoker + "; " +
                "SexoPoker: " + sexoPoker
                + "; " +
                "Posición Torneo: " + posicionTorneo;
    }

}
