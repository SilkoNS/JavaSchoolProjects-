package src.cv10;

import java.text.DateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Faktura {
    private Date datumVytvoreni;
    private Date datumSplatnosti;

    public Faktura(Date datumVytvoreni) {
        setDatumVytvoreni(datumVytvoreni);
    }
    public Faktura(){
        setDatumVytvoreni(Date.from(Instant.now()));
    }

    public void setDatumVytvoreni(Date datumVytvoreni) {
        this.datumVytvoreni = datumVytvoreni;
        this.datumSplatnosti = Date.from(datumVytvoreni.toInstant().plus(10, ChronoUnit.DAYS));
    }

    public Date getDatumVytvoreni() {
        return datumVytvoreni;
    }

    public Date getDatumSplatnosti() {
        return datumSplatnosti;
    }

    @Override
    public String toString() {
        return "Faktura{" +
                "datumVytvoreni=" + datumVytvoreni +
                ", datumSplatnosti=" + datumSplatnosti +
                '}';
    }
}
