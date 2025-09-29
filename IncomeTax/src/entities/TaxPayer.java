package entities;

public abstract class TaxPayer {
    protected String name;
    protected Double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(Double anualIncome, String name) {
        this.anualIncome = anualIncome;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Double tax();

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }
}
