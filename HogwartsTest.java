public class HogwartsTest {

    public static void main(String[] args) {
        testCourseAndTeacherAssignment();
    }

    public static void testCourseAndTeacherAssignment() {
        App app = new App();
        app.initApp();

     
        Course potionsSixthYear = app.getPotionsSixthYear();
        HogwartsTeacher slughorn = app.getSlughorn();
        HogwartsTeacher snape = app.getSnape();

       
        assert potionsSixthYear != null : "Course should be initialized";
        assert slughorn != null : "Slughorn should be initialized";
        assert snape != null : "Snape should be initialized";

        
        assert potionsSixthYear.getTeacher().equals(slughorn) : "Slughorn should be assigned to the course";
        assert !potionsSixthYear.getTeacher().equals(snape) : "Snape should not be assigned to the course";

        System.out.println("Course and teacher assignment tests passed!");
    }
}
