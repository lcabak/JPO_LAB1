import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // stworzenie obiektu klasy punktMaterialny używając konstruktora domyślnego
        punktMaterialny punktMaterialny1 = new punktMaterialny();
        obliczanieMomentu(punktMaterialny1, 2,5);

        // stworzenie obiektu klasy punktMaterialny używając konstruktora z paremetrem
        punktMaterialny punktMaterialny2 = new punktMaterialny(25);
        obliczanieMomentu(punktMaterialny2, 5,2);

        // zmiana zmiennej prywatnej masa za pomocą metody
        punktMaterialny1.zmienMase(10);
        obliczanieMomentu(punktMaterialny1, 3,5);

        // stworzenie tablicy punktów materialnych
        punktMaterialny[] punktyMaterialne = new punktMaterialny[10];
        // generator liczb losowych
        Random random = new Random();
        // wypełnienie tablicy punktami materialnymi
        for (int i = 0; i < punktyMaterialne.length; i++) {
            int losowaMasa = random.nextInt(1000);
            punktyMaterialne[i] = new punktMaterialny(losowaMasa);
        }

        // obliczenie i wypisanie momentów bezwładności z powyższej tablicy
        for (punktMaterialny materialPoint : punktyMaterialne) {
            obliczanieMomentu(materialPoint, 15,6);
        }
    }

    // metoda która oblicza główny moment bezwładności i wypisująca wyniki

    private static void obliczanieMomentu(punktMaterialny punktMaterialny, int odlegloscOdOsiX, int odlegloscOdOsiY) {

        long glownyMomentBezwladnosci = punktMaterialny.glownyMomentBezwladnosci();
        long wzglednyMomentBezwladnosci = punktMaterialny.wzglednyMomentBezwladnosci(odlegloscOdOsiX, odlegloscOdOsiX);

        System.out.println(punktMaterialny.opisObiektu() + "\nMasa: " + punktMaterialny.wypiszMase());
        System.out.println("\nGlowny moment bezwladnosci: " + glownyMomentBezwladnosci);
        System.out.println("Wzgledny moment bezwladnosci: " + wzglednyMomentBezwladnosci);
        System.out.println("\nOdleglosc: " +
                            "\nod osi X = " + odlegloscOdOsiX +
                            "\nod osi Y = " + odlegloscOdOsiY);
        System.out.println();
    }
}