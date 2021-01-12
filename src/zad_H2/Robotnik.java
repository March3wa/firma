package zad_H2;

import java.text.DecimalFormat;

public class Robotnik extends Pracownik {
    int limit = 160;
    int stawkaGodzinowa = 18;

    Robotnik(String n, float czEt) {
        super(n, czEt);
    }

    //by wypłata wyswietlała się zaokrąglona
    DecimalFormat d1 = new DecimalFormat("#.##");

    //liczbę przepracowanych godzin utożsamiam z liczbą przepracowanych godzin (limit - 160 godzin to pełen etat)
    //jeśli etat >1 doliczam bonus 50%, w przeciwnym razie brak bonusu
    double wyplata() {
        if (getCzescEtatu() > 1){
            return Double.parseDouble(d1.format(limit*stawkaGodzinowa + ((getCzescEtatu()-1)*(limit*stawkaGodzinowa))*0.5));
        }else return Double.parseDouble(d1.format(getCzescEtatu()*stawkaGodzinowa*limit));
    }

    public String toString() {
        String s = this.nazwisko;
        return s + " zarabia " + d1.format(wyplata()) + "zł, etat: " + this.getCzescEtatu();
    }
}

