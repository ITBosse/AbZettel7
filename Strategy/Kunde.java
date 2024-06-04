package Strategy;

public class Kunde {
    private String name;
    private String nachname;
    private final int kundenummer;

    public Kunde(String name, String nachname, int kundenummer) {
        this.name = name;
        this.nachname = nachname;
        this.kundenummer = kundenummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getKundenummer() {
        return kundenummer;
    }

}
