public class Person {


    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Client client1 = new Client1("John", "Smith")
     // Client client2 = new Client1("John", "Smith")
     // client1.isTheSameClient(client2)

    public void isTheSamePerson (Person otherPerson){
        if (firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName))
        {
            System.out.println("Name are equals");
        }
        else {
            System.out.println("Names are different");
        }






    }


}
