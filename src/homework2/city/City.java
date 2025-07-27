package homework2.city;

public class City {
    char code;
    int population;

    public City(char code, int population){
        this.code = code;
        this.population = population;
    }
    public void printInfo(){
        System.out.println("City code: " + this.code);
        System.out.println("Population: " + this.population);

    }
    public static void main(String[] args) {
        City yerevan = new City('Y', 1500000);
        City moscow = new City('M', 13000000);
        City newYork = new City('N', 8250000);
        City paris = new City('P', 2150000);

        yerevan.printInfo();
        moscow.printInfo();
        newYork.printInfo();
        paris.printInfo();
    }
}
