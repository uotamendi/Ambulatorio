package dao;
// Generated 30-abr-2012 18:20:00 by Hibernate Tools 3.2.1.GA


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Erabiltzailea generated by hbm2java
 */
public class Konsulta  implements java.io.Serializable {

     @Size(min=8,max=9,message="GSZ zenbakia ez da zuzena, 8 edo 9 karaktere eduki behar ditu")
     private int zenbakia;
     
     
     @Size(min=1,max=50,message="Karaktere kopurua ez da zuzena, gutxienez 1 eta gehienez 50")
     private String ordua;
     
     @Size(min=1,max=50,message="Karaktere kopurua ez da zuzena, gutxienez 1 eta gehienez 50")
     private Date eguna;
     
     private Gaixoa gaixoa;
    

    public Konsulta() {
    }

	
    public Konsulta(int zenbakia,  String ordua,Date eguna, Gaixoa gaixoa ) {
        this.gaixoa = gaixoa;
        this.zenbakia = zenbakia;
        this.ordua = ordua;
        this.eguna = eguna;
        

    }

    public Gaixoa getGaixoa() {
        return gaixoa;
    }

    public void setGaixoa(Gaixoa gaixoa) {
        this.gaixoa = gaixoa;
    }

 

    public int getZenbakia() {
        return zenbakia;
    }

    public void setZenbakia(int zenbakia) {
        this.zenbakia = zenbakia;
    }

    public String getOrdua() {
        return ordua;
    }

    public void setOrdua(String ordua) {
        this.ordua = ordua;
    }

    public Date getEguna() {
        return eguna;
    }

    public void setEguna(Date eguna) {
        this.eguna = eguna;
    }

  
   
    


}

