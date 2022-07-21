public class Cat {

    int weight;
    String name;
    String color;
    int number;
    static int count=0;

    public Cat(){
        count=count+1;
    }

    public void voice() {
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void print(String rave) {
        System.out.println(rave);
    }

    public void setWeigh(int weight) {
        this.weight = weight;

    }

    public static int getCount() {
        return count;
    }
}
