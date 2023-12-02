public class Permanent extends Contract{

    private double accumulatedDays;
    private int nbChildren;
    private boolean isMarried;
    private double monthlySalary;
    private double bonusPerChildPerMonth;

    public Permanent(int nbChildren, boolean isMarried, double monthlySalary, double bonusPerChildPerMonth, double accumulatedDays) {
        this.nbChildren = nbChildren;
        this.isMarried = isMarried;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public double accumulatedSalary() {
        return (this.accumulatedDays * (this.monthlySalary + (this.isMarried ? (this.nbChildren * this.bonusPerChildPerMonth) : 0))) / 20;
    }

    @Override
    public double annualIncome() {
        return accumulatedSalary()*12;
    }

    @Override
    public void convertFrom(double accumulatedSalary) {
        this.accumulatedDays = (int) (accumulatedSalary / ((this.monthlySalary + (this.isMarried ? (this.nbChildren * this.bonusPerChildPerMonth) : 0)) / 20));
    }

    @Override
    public String toString() {
        return "He/She is " + (this.isMarried ? "married" : "unmarried") + " and He/She has "+this.nbChildren+" children."+
                "\nHe/She has worked for "+this.accumulatedDays+" days and upon contract his/her monthly salary is "+this.monthlySalary+".";
    }
}
