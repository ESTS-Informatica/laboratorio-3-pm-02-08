
/**
 *Ground Transportation
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
     private static final double GROUND_FEES = 0.03; // 3%

    public GroundTransportation() {
        this.licensePlate = "";
    }

    public double getFees() {
        return GROUND_FEES;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    public void setLicensePlate(){
        this.licensePlate = licensePlate;
    }
}
