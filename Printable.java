public interface Printable {

    public void print();

    default String getName() { //metoda domyślna
        return "Kalkulator";
    }
}
