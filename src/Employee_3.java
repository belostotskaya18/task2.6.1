public class Employee extends Person {
    private String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public String toString() {
        String a = Integer.toString(age);
        return new StringBuilder().append("(").append(name).append(", ").append(age).append(", ").append(company).append(")").toString();
    }
    @Override
    public String work () {
        return new StringBuilder().append("Manager").toString();
    }
}
