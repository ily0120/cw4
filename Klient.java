import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> listaRezerwacji;

    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }

    public String getImię() { return imię; }
    public String getNazwisko() { return nazwisko; }

    public void dodajRezerwację(Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            listaRezerwacji.add(wydarzenie);
            System.out.println("Dodano rezerwację: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Brak dostępnych miejsc na: " + wydarzenie.getNazwa());
        }
    }
    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.remove(wydarzenie)) {
            System.out.println("Anulowano rezerwację: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Nie masz rezerwacji na: " + wydarzenie.getNazwa());
        }
    }
    public void wyświetlRezerwacje() {
        System.out.println("Rezerwacje klienta " + imię + " " + nazwisko + ":");
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println("- " + w);
        }
    }
}

