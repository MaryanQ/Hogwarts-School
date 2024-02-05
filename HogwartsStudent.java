public class HogwartsStudent extends Student {
    private HouseEnum house;

    public HogwartsStudent() {
       
    }

public HogwartsStudent(String name, int age, HouseEnum house) {
    super(name, age); 
    this.house = house;
}


   
    public HouseEnum getHouse() {
        return house;
    }

   
    public void setHouse(HouseEnum house) {
        this.house = house;
    }

   
    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", house=" + house +
                '}';
    }
}
