
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double AIR_FEES = 0.04; //4%

    public AirTransportation(String name,int numberOfContainers)
    {
        super();
        super.setFees(AIR_FEES);
        this.name = name ;
        this.numberOfContainers = numberOfContainers;
    
    }

    public double getFees() {
        return AIR_FEES;
    }
    

    //nivel 2
    //gets e sets
    public String getName(){
        return this.name;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }

    @Override
    public double getPriceWithFees () {
         return super.getPrice() * (1.0 + (getFees() * 0.01));
    }
    
    public String getTransportType() {
        return "Transporte Aéreo";
    }
    
     @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType())); 
        sb.append(String.format("\n%15s: %s\n", "Nome da Aeronave", getName()));
        sb.append(String.format("\n%15s: %s\n", "Número de Contentores", getNumberOfContainers()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}