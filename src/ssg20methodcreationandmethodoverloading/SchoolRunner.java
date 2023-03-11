package ssg20methodcreationandmethodoverloading;

public class SchoolRunner {

    public static void main(String[] args) {

       MethodCreation02.welcomeToSSGLessons();
       School school=new School();

        System.out.println(school.schoolName);
        System.out.println(school.year);
        System.out.println(school.isActive);
        // to string method
        //System.out.println(okul);

        school.printSchoolName("Bahar Okulu");
        School.printYear(2023);
        System.out.println(school.isActive(true));


    }
}
