public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }

    public void meow (){
        this.meow(1);
    }

    public void meow (int n){
        System.out.println(name + ": " + "мяу" + "-мяу".repeat(n - 1) + "!");
    }
}
