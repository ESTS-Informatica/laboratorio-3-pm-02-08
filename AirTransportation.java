
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
    private static final double AIR_FEES = 0.04;
   
    public AirTransportation()
    {
        this.name = "";
        this.numberOfContainers = 0;

    }

   public double getFees() {
        return AIR_FEES;
    }
    
    //gets e sets
    public String getName(){
        return this.name;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public void setNumberOfContainers(){
        this.numberOfContainers = numberOfContainers;
    }
}
