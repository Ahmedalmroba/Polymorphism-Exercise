class Car implements Vehicle {
    private String model;
    private int days;
    private double dailyRate = 50.0;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        return dailyRate * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate:" + dailyRate);
        System.out.println("Rental Cost:" + calculateRentalCost());
    }
}