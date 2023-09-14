public class Address {
    String description;
    String town;
    String city;

    public Address(String description, String town, String city) {
        this.description = description;
        this.town = town;
        this.city = city;

    }

    // * Getters
    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getTown() {
        return town;
    }

    // * Setters
    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
