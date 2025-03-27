public class Wydarzenie {
    private String nazwa;
    private String data;
    public String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 100;
    private double cena;

/*    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }*/

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public boolean zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce + ", Cena: " + cena;
    }
}

