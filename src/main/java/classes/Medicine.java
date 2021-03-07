package classes;
import java.util.*;

public class Medicine {

    private String medicineName;
    private String lot;
    private Date expDate;
    
    public Medicine() {
    }

    public String getMedicineName() {
        return this.medicineName;
    }
    public void setMedicineName(String medicineName) {
    	this.medicineName = medicineName;
    }
    
    public String getLot() {
        return this.lot;
    }
    public void setLot(String lot) {
        this.lot = lot;
    }

    public Date getExpDate() {
        return this.expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

}