public abstract class TeachingMaterial {
    private String name;

    public TeachingMaterial() {
     
    }

    public TeachingMaterial(String name) {
        this.name = name;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    @Override
    public String toString() {
        return "TeachingMaterial{" +
                "name='" + name + '\'' +
                '}';
    }
}
