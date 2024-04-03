
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers,String licensePlate){
        this.numberOfPallets = 0;
        this.trailers = 0;
        super.getLicensePlate();
    }

    //gets e sets
    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }

    public void setNumberOfPallets(){
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers(){
        return this.trailers;
    }

    public void setTrailers(){
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType())); 
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Número de Paletes", getNumberOfPallets()));
        sb.append(String.format("\n%15s: %s\n", "Número de Atrelados", getTrailers()));

        return sb.toString();
    }
}
