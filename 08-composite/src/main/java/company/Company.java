package company;

public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void addCompany(Company company);

    public abstract void removeCompany(Company company);

    public abstract void displayCompany();

    public String getName() {
        return name;
    }
}
