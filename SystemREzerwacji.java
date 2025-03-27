import java.util.ArrayList;
import java.util.List;

public class SystemREzerwacji {

    private List<Wydarzenie> listaWydarzeń = new ArrayList<>();
    private List<Klient> listaKlientów = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwację(wydarzenie);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzeń) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        return null;
    }
   /* public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : listaKlientów) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
            System.out.println("Zmieniono cenę wydarzenia " + nazwa + " na " + nowaCena + " zł.");
        } else {
            System.out.println("Nie znaleziono wydarzenia: " + nazwa);
        }
  }*/
}