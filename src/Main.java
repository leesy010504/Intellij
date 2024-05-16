public class Main{
    public static void main(String[] args){
        Person person;
        Person me = new Person(24, "Sangyoon");
        Person baby = new Person(1);

        printInfo(baby);
        baby.setName("응애");

        printInfo(me);
        printInfo(baby);
    }
    public static void printInfo(Person person){
        person.info(person);
    }
}