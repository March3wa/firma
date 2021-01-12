package zad_H2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pracownik p1 = new Nierobotnik("Kowalski", 0.8f, 1.2f);
        Pracownik p2 = new Nierobotnik("Pawlacz", 1.0f, 1.1f);
        Pracownik p3 = new Nierobotnik("Kowal", 1.1f, 1.3f);
        Pracownik p4 = new Robotnik("Żurawski", 0.9f);
        Pracownik p5 = new Robotnik("Nowak", 1.2f);
        Pracownik p6 = new Robotnik("Sternik", 0.25f);

        Firma liroyMerlinTM = new Firma();

        liroyMerlinTM.zatrudnij(p1);
        liroyMerlinTM.zatrudnij(p2);
        liroyMerlinTM.zatrudnij(p3);
        liroyMerlinTM.zatrudnij(p4);
        liroyMerlinTM.zatrudnij(p5);
        liroyMerlinTM.zatrudnij(p6);

        System.out.println("Ilu jest pracowników?: "+liroyMerlinTM.iluPracownikow());
        System.out.println(liroyMerlinTM.wyswietlPracownikow());
        liroyMerlinTM.sumaWyplat();
        liroyMerlinTM.znajdzPracownika("Kowal");
        System.out.println("Czy pracownik p3 jest nierobotnikiem?: " + liroyMerlinTM.czyJestNierobotnikiem(p3));
        System.out.println("Ilu jest zatrudnionych robotników?: " + liroyMerlinTM.iluZatrudnionychPracownikow(Robotnik.class));

        System.out.println(liroyMerlinTM.listaPlacAlfabetycznie());
    }
}
