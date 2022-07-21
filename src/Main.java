public class Main {
    public static void main(String[] args) {
        Cat vasil = new Cat();
        vasil.voice();
        String name = vasil.getName();
        vasil.setName("Барсик");
        String secondName = vasil.getName();
        System.out.println(secondName);
        System.out.println(name);
        Cat.print("Кис-кис)");
        vasil.color= "red";
        Cat barsik= new Cat();
        barsik.setWeigh(7);
        barsik.setWeigh(9);
        System.out.println(Cat.count);
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        System.out.println(Cat.count);

        System.out.println(Cat.getCount());


    }
}