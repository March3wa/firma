package zad_H2;

public class Firma {
    Pracownik[] pracownicy = new Pracownik[0];

    Firma() {
    }

    //metoda 4 (mam nadzieję, że chodziło o zwykłe zatrudnienie)
    void zatrudnij(Pracownik p) {
        Pracownik[] tab = new Pracownik[this.pracownicy.length + 1];

        for (int i = 0; i < this.pracownicy.length; i++) {
            tab[i] = this.pracownicy[i];
        }

        tab[tab.length - 1] = p;
        this.pracownicy = tab;
    }

    int iluPracownikow() {
        return this.pracownicy.length;
    }

    //metoda 2, nie wiedziałem w jaki sposób zwrócić referencję
    Pracownik znajdzPracownika(String nazwisko) {
        int x = 0;
        for (int i = 0; i < this.pracownicy.length; i++) {
            if (this.pracownicy[i].nazwisko.equals(nazwisko)) {
                x = i;
                break;
            }
        }
        return pracownicy[x];
    }

    //metoda 3
    boolean czyJestNierobotnikiem(Pracownik p) {
        boolean jestNierobotnikiem = false;
        for (int i = 0; i < this.pracownicy.length; i++) {
            if (this.pracownicy[i].nazwisko.equals(p.getNazwisko())) {
                if (pracownicy[i] instanceof Nierobotnik) {
                    jestNierobotnikiem = true;
                }
            }
        }
        return jestNierobotnikiem;
    }

    //metoda 5
    void zwolnij(String nazwisko) {
        int counter = 0;

        int k;
        for (k = 0; k < this.pracownicy.length && !this.pracownicy[k].nazwisko.equals(nazwisko); ++k) {
            ++counter;
        }

        if (counter == this.pracownicy.length) {
            System.out.println("Nie ma takiego pracownika!");
        } else {
            k = 0;
            Pracownik[] tab = new Pracownik[this.pracownicy.length - 1];

            for (int i = 0; i < this.pracownicy.length; i++) {
                if (!this.pracownicy[i].nazwisko.equals(nazwisko)) {
                    tab[k++] = this.pracownicy[i];
                }
            }

            this.pracownicy = tab;
        }

    }

    //metoda 6
    int iluZatrudnionychPracownikow(Class<?> cls) {
        int counter = 0;
        for (int i = 0; i < pracownicy.length; i++) {
            if (cls.equals(pracownicy[i].getClass())) {
                counter++;
            }
        }
        return counter;
    }

    String wyswietlPracownikow() {
        String p = "Pracownicy: \n";

        for (int i = 0; i < this.pracownicy.length; i++) {
            p = p + (i + 1) + ". " + this.pracownicy[i].toString()+"\n";
        }

        return p;
    }

    //metoda 7
    void sumaWyplat() {
        double suma = 0;

        for (int i = 0; i < this.iluPracownikow(); i++) {
            suma += this.pracownicy[i].wyplata();
        }

        System.out.println("Suma zarobków wszystkich pracowników: " + suma + "zł");
    }

    String listaPlacAlfabetycznie() {
        Pracownik[] temp = new Pracownik[pracownicy.length];
        Pracownik[] temp2 = new Pracownik[1];

        for (int i = 0; i < pracownicy.length; i++) {
            temp[i]=pracownicy[i];
        }
        //sortuję po nazwiskach
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].getNazwisko().compareTo(temp[j].getNazwisko()) >= 0) {
                    temp2[0] = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp2[0];
                }
            }
        }
        //tworzę string
        String listaPlac = "Lista plac alfabetycznie: \n";
        for (int i = 0; i < temp.length; i++) {
            listaPlac += i+1+ ". " + temp[i].getNazwisko() +" "+ temp[i].wyplata()+"zł \n";
        }
    return listaPlac;
    }
}