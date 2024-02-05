public class Teacher extends HogwartsPerson {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public HouseEnum getHouse() {
        return HouseEnum.NONE;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", subject='" + subject + '\'' +
                ", house=" + getHouse() +
                '}';
    }
}
