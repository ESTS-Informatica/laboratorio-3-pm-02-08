
/**
 * Classe Van
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int packages,String licensePlate )
    {
      this.packages = 0;
      super.getLicensePlate();
    }

    public int getPackages(){
        return this.packages;
    }
    public void setPackages(){
        this.packages = packages;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType())); 
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Packages", getPackages()));
      

        return sb.toString();
    }
    
}
