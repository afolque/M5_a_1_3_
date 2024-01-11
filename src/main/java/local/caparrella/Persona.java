package local.caparrella;

public class Persona {
    private String nom;
    private int edat;

    // Constructor
    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    // Getters i setters (es poden generar automàticament en molts IDEs)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}
