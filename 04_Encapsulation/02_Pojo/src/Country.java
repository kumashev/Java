public class Country {
    private String name;
    private int population;
    private double area;
    private String capital;
    private boolean seaAccess;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public String getCapital() {
        return capital;
    }

    public boolean getSeaAccess() {
        return seaAccess;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSeaAccess(boolean seaAccess) {
        this.seaAccess = seaAccess;
    }
}
