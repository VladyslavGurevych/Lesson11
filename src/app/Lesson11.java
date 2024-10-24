package app;

public class Lesson11 {
    public static void main(String[] args) {

        Person pers1 = new Person("Ilya", 32, "policeman");
        Person pers2 = new Person("Igor", 48, "PR manager");
        Person pers3 = new Person("Anna", 24, "SMM specialist");

        System.out.println("1. Ім'я: " + pers1.name + ", Вік: " + pers1.age + ", Професія: " + pers1.profession);
        System.out.println("   Ім'я: " + pers2.name + ", Вік: " + pers2.age + ", Професія: " + pers2.profession);
        System.out.println("   Ім'я: " + pers3.name + ", Вік: " + pers3.age + ", Професія: " + pers3.profession + "\n\n");
        System.out.println("2. Ім'я: " + pers2.name + ", Вік: " + pers2.age + ", Професія: " + pers2.profession);
        pers2.changeProfession("Seo specialist");
        System.out.println("   (Після оновлення професії)\n   Ім'я: " + pers2.name + ", Вік: " + pers2.age + ", Професія: " + pers2.profession);
    }
}
