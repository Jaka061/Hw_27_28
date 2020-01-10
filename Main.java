package hw27;

public class Main {
    public static void main(String[] args) {
        District [] districts = new District[4];
        districts[0] = new District("Lenina","Owner1",25000);
        districts[1] = new District("Belovodsky","Owner2",22000);
        districts[2] = new District("Gorkogo","Owner3",18000);
        districts[3] = new District("Oktabrskiy","Owner4",16000);

        City city = new City("Bishkek","Owner",81000,districts);
        District search = city.findByOwner("Owner5");

        if(search != null){
            System.out.println(search.getName());
        }else {
            System.out.println("Такого района нету.");
        }

    }
}
