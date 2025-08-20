package homework11.task5;

public enum Currency {
    USD("United States Dollar", '$', "United States"),
    EUR("Euro", '€', "European Union"),
    JPY("Japanese Yen", '¥', "Japan");

    private final String fullName;
    private final char symbol;
    private final String country;

    Currency(String fullName, char symbol, String country) {
        this.fullName = fullName;
        this.symbol = symbol;
        this.country = country;
    }
    public String getFullName() {
        return fullName;
    }
    public char getSymbol() {
        return symbol;
    }
    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return this.getFullName();
    }

}
class Test{
    public static void main(String[] args) {
        Currency dollar = Currency.USD;
        System.out.println(dollar);
    }
}