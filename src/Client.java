public class Client {

    private String firstName;
    private String lastName;
    private String insuranceType;
    private int yearOfBirth;
    private int yearOfDriving;
    private double carEngine;


    public Client(String firstName, String lastName, int yearOfBirth, int yearOfDriving, double carEngine, String insuranceType) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (insuranceType.equals("FULL") || insuranceType.equals("Partial")) {

            this.insuranceType = insuranceType;

        } else {
            System.out.println("Invalid insurance type");
        }
        this.yearOfBirth = yearOfBirth;
        this.yearOfDriving = yearOfDriving;
        this.carEngine = carEngine;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getYearOfDriving() {
        return yearOfDriving;
    }

    public double getCarEngine() {
        return carEngine;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setYearOfDriving(int yearOfDriving) {
        this.yearOfDriving = yearOfDriving;
    }

    public void setCarEngine(double carEngine) {
        this.carEngine = carEngine;
    }

    public double calculateInsurancePrice() {

        double price;
        if (insuranceType.equals("PARTIAL")) {
            price = 1000;
        } else {
            price = 1700;

        }


        int age = 2020 - yearOfBirth;
        if (age >= 18 && age <= 25 || age >70) {
            price = price + price * 0.5;
        } else if (age > 25 && age < 60) {
            price = price + price * 0.2;
        }
        else if (age>=60 && age<=70){
            price = price + price * 0.1;
        }

        if (carEngine<1.6)
        {
            price = price + price * 0.09;
        }
        else {
            price = price + price * 0.15;
        }

        if (yearOfDriving<1){
            price = price + price *  0.3;
        }
        else {
            price = price + price * 0.15;
        }

        return price;
    }
}