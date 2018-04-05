import java.util.Random; //załączenie biblioteki generatora liczb pseudolosowych (nie sa prawdziwie losowe)

public class punktMaterialny {
    private int masa; //zaincjowanie prywatnej zmiennej masa

    //miejsce programu, gdzie generuje się losową wartość masy, konstruktor domyslny
    public punktMaterialny() {
        Random liczbaLosowa = new Random(); //miejce wygenerowania liczby losowej
        masa = liczbaLosowa.nextInt(10000); //przypisanie masie wartosci od 0 do 10000
    }
    //konstruktor z parametrami klasy punktMaterialny, za pomocą którego inicjujemy wartość masy
    public punktMaterialny(int masa) {
        this.masa = masa;
    }

    // metoda ktora pozwala na ustawienie masy punktu (masa jest zmienną prywatną, oznacza, że można mieć dostęp do jej zmiany jedynie za pomoca metody)
    public void zmienMase(int masa) {
        if (masa >= 0) {
            System.out.println("Masa jest poprawna.");
            this.masa = masa;
        } else {
            System.out.println("Masa nie moze byc ujemna.");
        }

    }

    // metoda pozwalająca na obliczenie głównego momentu bezwladności, jest rowny zero dla punktu materialnego
    public long glownyMomentBezwladnosci(){
        return 0;
    }

    // metoda pozwalająca na obliczenie momentu bezwladności względem innej osi
    public long wzglednyMomentBezwladnosci(int odlegloscOdOsiX, int odlegloscOdOsiY) {
        long wzglednyMomentBezwladnosci = glownyMomentBezwladnosci() + masa * odlegloscOdOsiX * odlegloscOdOsiY;
        return wzglednyMomentBezwladnosci;
    }

    // metoda, która pozwala na wypisanie zmiennej prywatnej masa
    public int wypiszMase() {
        return masa;
    }

    // metoda zwracająca stały opis obiektu
    public String opisObiektu() {
        return "Punk materialny";
    }
}
