public class Person {
    public int age;
    public String name;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String a = Integer.toString(age);
        return new StringBuilder().append("(").append(name).append(", ").append(age).append(")").toString();
    }

    public String work () {
        return new StringBuilder().append("None").toString();
    }

}
