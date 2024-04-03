import java.util.HashSet;
import java.util.ArrayList;

public class ShippingCompany<T extends Transport> extends HashSet<T> {
    private String name;
    private ArrayList<Transport> inService ;

    public ShippingCompany(String name) {
        this.name = name;
        this.inService = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransportToService(Transport transport) {
        inService.add(transport);
    }

    public void removeTransportFromService(Transport transport) {
        inService.remove(transport);
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shipping Company - Name: ").append(name).append("\n");
        sb.append("In Service:\n");
        for (Transport transport : inService) {
            sb.append(transport.toString()).append("\n");
        }
        return sb.toString();
    }

   
}