import java.util.List;
import java.util.ArrayList;

public class App {
    private Course potionsSixthYear;
    private HogwartsTeacher slughorn;
    private HogwartsTeacher snape;

    public static void main(String[] args) {
        App app = new App();
        app.initApp();
        app.printDetails();
    }

    public void initApp() {
     
        Subject potions = new Subject("Potions");

       
        slughorn = new HogwartsTeacher("Horace Slughorn", 60, "Potions", HouseEnum.SLYTHERIN);
          snape = new HogwartsTeacher("Severus Snape", 38, "Potions", HouseEnum.SLYTHERIN);

       
        Book potionBook = new Book("Advanced Potion-Making", "Libatius Borage", 1946, "Merge Books");

       
        List<HogwartsStudent> students = createStudents();

       
        Cauldron cauldron = new Cauldron("Standard size 2");
        SilverKnife silverKnife = new SilverKnife("Silver Knife");
        List<Ingredient> ingredients = createIngredients();

        
        potionsSixthYear = new Course(potions, slughorn, 6);

       
        potionsSixthYear.getStudents().addAll(students);

        
        potionsSixthYear.setBook(potionBook);
        potionsSixthYear.setCauldron(cauldron);
        potionsSixthYear.setSilverKnife(silverKnife);
        potionsSixthYear.setIngredients(ingredients);

       
        System.out.println(potionsSixthYear);
    }

    public Course getPotionsSixthYear() {
        return potionsSixthYear;
    }

    public HogwartsTeacher getSlughorn() {
        return slughorn;
    }

    public HogwartsTeacher getSnape() {
        return snape;
    }

    private List<HogwartsStudent> createStudents() {
        String[] studentNames = {"Harry Potter", "Ron Weasley", "Hermione Granger", "Seamus Finnigan", "Dean Thomas", "Parvati Patil", "Kellah"};
        HouseEnum[] studentHouses = {HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR, HouseEnum.GRYFFINDOR};

        List<HogwartsStudent> students = new ArrayList<>();
        for (int i = 0; i < studentNames.length; i++) {
            HogwartsStudent student = new HogwartsStudent(studentNames[i], 17, studentHouses[i]); // Assuming age is 17
            students.add(student);
        }
        return students;
    }

    private List<Ingredient> createIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();

        // Data for ingredienser
        String[] ingredientNames = {"Boomslang Skin", "Lacewing Flies", "Leaping Toadstool", "Infusion of Wormwood", "Peppermint"};
        int[] quantities = {2, 3, 1, 4, 5};

       
        for (int i = 0; i < ingredientNames.length; i++) {
            Ingredient ingredient = new Ingredient(ingredientNames[i], quantities[i]);
            ingredients.add(ingredient);
        }

        return ingredients;
    }
        public void printDetails() {
      
        System.out.println("Students:");
        for (HogwartsStudent student : potionsSixthYear.getStudents()) {
            System.out.println(student);
        }

       
        System.out.println("Course details: " + potionsSixthYear);

     
        System.out.println("Teacher details - Slughorn: " + slughorn);
        System.out.println("Teacher details - Snape: " + snape);
    }
}
