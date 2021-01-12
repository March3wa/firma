package zad_H2;

public abstract class Pracownik {
    String nazwisko;
    float czescEtatu;

    Pracownik(String n, float czE) {
        this.nazwisko = n;
        this.czescEtatu = czE;
    }

    abstract double wyplata();

    public abstract String toString();

    String getNazwisko() {
        return this.nazwisko;
    }

    float getCzescEtatu() {
        return this.czescEtatu;
    }

    void setCzescEtatu(float czescEtatu) {
        this.czescEtatu = czescEtatu;
    }
}

