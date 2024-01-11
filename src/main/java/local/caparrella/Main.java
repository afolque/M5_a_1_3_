package local.caparrella;

public class Main {
    public static void main(String[] args) {
        // Crea un array d'objectes Persona
        Persona[] persones = new Persona[4];

        // Inicialitza els objectes a l'array
        persones[0] = new Persona("Josep", 25);
        persones[1] = new Persona("Maria", 30);
        persones[2] = new Persona("Pepe", 40);
        persones[3] = new Persona("Pepa", 33);
      

        // Accedeix als objectes a l'array
        for (Persona persona : persones) {
            System.out.println("Nom: " + persona.getNom() + ", Edat: " + persona.getEdat());
        }
    }
}
