package ssg09swicth;

public class Switch04 {
    public static void main(String[] args) {

        // Boyutu kontrol etmek için Java Programı
            // switch...case ifadesini kullanarak
        int number = 42;

        String size;
        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}
