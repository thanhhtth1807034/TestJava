package entity;

public class Game {
    private String name;
    private String description;
    private double price;
    private String releaseDate;
    private String home;

    public Game(String name, String description, double price, String releaseDate, String home) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.releaseDate = releaseDate;
        this.home = home;
    }

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", releaseDate='" + releaseDate + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
