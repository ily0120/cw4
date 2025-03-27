public class Main {
    public static void main(String[] args) {
        // Tworzenie systemu rezerwacji
        SystemREzerwacji system = new SystemREzerwacji();

        // Tworzenie wydarzeń i dodanie ich do systemu
        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0,"12-12-2025","teatr Wielki - Opera Narodowa");
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0,"17-05-2025", "Scena Relax");
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        // Tworzenie klientów i dodanie ich do systemu
        Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
        Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        // Dokonanie rezerwacji (przekazanie referencji do obiektów)
        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, teatr);
        system.dokonajRezerwacji(klient2, koncert);

        // Wyświetlenie rezerwacji klienta 1
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + ":");
        klient1.wyświetlRezerwacje();

        // Pobranie referencji do wydarzenia z systemu
        Wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");

        // Modyfikacja obiektu poprzez referencję (zmiana ceny koncertu)
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
        koncertRef.setCena(150.0);

        // Sprawdzenie, czy zmiany są widoczne w rezerwacjach klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyświetlRezerwacje();
        System.out.println("\nRezerwacje klienta " + klient2.getImię() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyświetlRezerwacje();

        // Klient anuluje rezerwację na teatr
        System.out.println("\nKlient " + klient1.getImię() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwację(teatr);
        klient1.wyświetlRezerwacje();

        // Sprawdzenie dostępnych miejsc na koncercie
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca() + " z " + koncert.getMaxLiczbaMiejsc());
    }
}
