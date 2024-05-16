public class Person{
    private Integer age;
    private String name;

    public Person(Integer age){
        this.age = age;
    }

    public Person(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public void info(Person person) {
        System.out.println(age);
        if (hasName()) {
            System.out.println(name);
        } else {
            System.out.println("이름이 없습니다.");
        }

    }

    protected boolean hasName() {
        return name != null;
    }

    public void setName(String name){
        this.name = name;
    }
}