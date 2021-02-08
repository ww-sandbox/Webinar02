package ex3_functions;

public class FunctionsExample {
    public static void main(String[] args) {
        int result = sum(2, 7);
        System.out.println(result);
        System.out.println(sum(2, 7));

        System.out.println(howManyItems(2.8, 7));
    }

    public static int sum (int x, int y){
        return x + y;
    }

    public static int howManyItems(double itemSize, int capacity){
        return (int) (capacity/itemSize);
        //rzutowanie - konwersja z jednego typu na inny (nie zawsze jest możliwa) powoduje utratę części informacji
        //rzutowanie w ten sposób możliwe jest jedynie z typu bardziej ogólnego do bardziej szczegółowego double -> int
    }

    //Stwórz funkcję wyświetlającą napis 'Podana liczba = ...' i nie zwracającą wartości

    //Stwórz funkcję zwracającą różnicę przekazanych wartości
}
