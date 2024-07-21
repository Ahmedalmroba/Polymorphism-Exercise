class Truck implements Vehicle {
    private String type;
    private int weeks;
    private double weeklyRate = 500.0;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculateRentalCost() {
        return weeklyRate * weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: " + weeklyRate);
        System.out.println("Rental Cost: " + calculateRentalCost());
    }
}

