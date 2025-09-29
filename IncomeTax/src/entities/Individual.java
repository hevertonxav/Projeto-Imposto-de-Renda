package entities;

public class Individual extends TaxPayer {
    protected Double healthExpenditures;

    public Individual() {
    }

    public Individual(Double healthExpenditures) {

        this.healthExpenditures = healthExpenditures;
    }

    public Individual(Double anualIncome, String name, Double healthExpenditures) {
        super(anualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {

        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {

        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return getAnualIncome() * 0.15 - getHealthExpenditures() * 0.5;
        }
        return getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5;
    }
}


