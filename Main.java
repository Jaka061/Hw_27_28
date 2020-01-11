package hw27;

public class Main {
    public static void main(String[] args) {
        District [] districts = new District[4];
        districts[0] = new District("Lenina","Owner1",275000);
        districts[1] = new District("Sverdlovsk","Owner2",262000);
        districts[2] = new District("Pervomayskaya","Owner3",124000);
        districts[3] = new District("Oktyabrskiy","Owner4",160000);


        District [] districts1 = new District[4];
        districts1[0] = new District("Aravan","Owner1",106134);
        districts1[1] = new District("Alay","Owner2",80400);
        districts1[2] = new District("Uzgen","Owner3",58800);


        District [] districts2 = new District[4];
        districts2[0] = new District("Bazar-Korgon","Owner1",142951);
        districts2[1] = new District("Kerben","Owner2",28300);
        districts2[2] = new District("Suzak","Owner3",241198);


        City city = new City("Bishkek","Mayor1",976000,districts);
        City city1 = new City("Osh","Mayor",256000,districts1);
        City city2 = new City("Jalal-Abad","Mayor2",1214400,districts2);


        Village village = new Village("Sosnovka","Person",174000);
        Village village1 = new Village("Belovodsk","Person1",122645);

        District search = city.findByOwner("Owner1");  // можно найти из любого города (1-3)

        if(search != null){
            System.out.println(search.getName());
        }else {
            System.out.println("Такого района нету.");
        }

    }
}
