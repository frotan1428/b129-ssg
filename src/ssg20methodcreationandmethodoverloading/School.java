package ssg20methodcreationandmethodoverloading;

public class School {


    String schoolName="Star college";
    boolean isActive=true;
    int year=2022;


    public static void printSchoolName(String schoolName){
        System.out.println(schoolName);
    }

    public static void printYear(int year){
        System.out.println(year);
    }

    public boolean isActive(boolean isActive){
        return isActive;
    }


    @Override
    public String toString() {
        return "{" +
                "schoolName='" + schoolName + '\'' +
                ", isActive=" + isActive +
                ", year=" + year +
                '}';
    }


}
