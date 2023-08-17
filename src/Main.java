public class Main {
    public static void main(String[] args) {
        Gadjet gadjet = new Gadjet("Ronaldo",2);
        Newspaper newspaper = new Newspaper("Galaxy",1);
        Magazine magazine = new Magazine("PeakSoft",1);

        System.out.println(gadjet);
        gadjet.read();

        System.out.println(newspaper);
        newspaper.read();

        System.out.println(magazine);
        magazine.read();
    }
}