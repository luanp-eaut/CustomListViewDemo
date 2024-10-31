package eaut.it.mobileappdev.customlistviewdemo;

public class Company {
    private int logo;
    private String name;
    private String description;

    public Company(int logo, String name, String description) {
        this.logo = logo;
        this.name = name;
        this.description = description;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
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
}
