package src.cv8;

import java.io.Serializable;

public class Datum implements Serializable {
    int den, mesic, rok;

    public Datum(int den, int mesic, int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return den + "." + mesic + "." + rok;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getMesic() {
        return mesic;
    }

    public void setMesic(int mesic) {
        this.mesic = mesic;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}
