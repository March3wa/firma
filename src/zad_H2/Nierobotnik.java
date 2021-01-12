package zad_H2;

import java.text.DecimalFormat;

public class Nierobotnik extends Pracownik {
    int placaPodstawowaNierobotnika = 4000;
    float bonus;

    Nierobotnik(String nn, float czE, float bonus) {
        super(nn, czE);
        this.bonus=bonus;
    }
    //by wypłata wyswietlała się zaokrąglona
    DecimalFormat d1 = new DecimalFormat("0.##");
    //wypłata to stała kwota za pełny etat pomnożona razy część etatu oraz bonus
    double wyplata() {
        return Double.parseDouble(d1.format(getCzescEtatu() * placaPodstawowaNierobotnika * bonus));
    }
    public String toString() {
        String s = this.nazwisko;
        return s + " zarabia " + d1.format(wyplata()) + "zł, etat: " + this.getCzescEtatu();
    }
}

