public class Student {


    private String firstName;
    private String lastName;
    private int Mark;

    public Student(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        Mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public void checkMark(){

        switch (Mark){
            case 1:
                System.out.println(firstName + " " + lastName + ": Unsatisfactory");
            break;
            case 2:
                System.out.println(firstName + " " + lastName + ": Below expectations");
                break;
            case 3:
                System.out.println(firstName + " " + lastName + ": Meets expectations");
                break;
            case 4:
                System.out.println(firstName + " " + lastName + ": Above expectations");
                break;
            case 5:
                System.out.println(firstName + " " + lastName + ": Distinction");
                break;
            default:
                System.out.println("Innvalid mark value");
        }

    }





}
