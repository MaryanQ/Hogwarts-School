public class HogwartsTeacher extends Teacher {
    private HouseEnum house;

  public HogwartsTeacher(String name, int age, String subject, HouseEnum house) {
    super(name, age, subject); 
    this.house = house;
}


    @Override
    public HouseEnum getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "HogwartsTeacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", subject='" + getSubject() + '\'' +
                ", house=" + house +
                '}';
    }
}
