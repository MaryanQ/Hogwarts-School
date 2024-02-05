public abstract class HogwartsPerson {
    private String name;
    private int age;

    public HogwartsPerson() {
        
    }

    public HogwartsPerson(String name, int age) {
        this.name = name;
        this.age = age;
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

    
    public abstract HouseEnum getHouse();

    @Override
    public String toString() {
        return "HogwartsPerson{" +
                "name='" + name + '\'' +
                ", house=" + getHouse() +
                '}';
    }
}
