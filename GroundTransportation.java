
/**
 *Ground Transportation
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double GROUND_FEES = 0.03; // 3%

    public GroundTransportation() {
         super();
        super.setFees(GROUND_FEES);
        this.licensePlate = licensePlate;

    }

    public double getFees() {
        return GROUND_FEES;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public double getPriceWithFees() {
        return super.getPrice() * (1.0 + (getFees() * 0.01));
    }
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
     @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType())); 
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}