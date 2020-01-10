package hw27;

public class City extends  AbstractLocality{
    private District[] districts;
    public City(String name, String owner, int population , District [] districts) {
        super(name, owner, population);
        this.districts = districts;
    }

    public District getDistricts(int index) {
        if(index < 0 || index > districts.length )
            return  null;

        return districts[index];

    }

    public District findByOwner(String owner){

        for (int i = 0; i < districts.length; i++) {
            if(districts[i].getOwner().equals(owner)){
                return districts[i];
            }
        }
        return null;

    }

}
