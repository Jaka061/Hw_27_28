package hw27;

public class AbstractLocality {
    private String name ;
    private String owner;
    private int population;

    public AbstractLocality(String name, String owner, int population) {
        this.name = name;
        this.owner = owner;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getOwner() { return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
