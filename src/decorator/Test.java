package decorator;

public class Test {
    public static void main(String[] args) {
        Porridge porridge = new SemolinaPorridge();
        System.out.println("Сколько стоит каша?");
        System.out.println(porridge.getPrice());

        porridge = new Berries(porridge);
        System.out.println("Добавим ягоды");
        System.out.println(porridge.getPrice());

        porridge = new CondensedMilk(porridge);
        System.out.println("Добавим сгущенку");
        System.out.println(porridge.getPrice());

        porridge = new Chocolate(porridge);
        System.out.println("Добавим шоколад");
        System.out.println(porridge.getPrice());
    }
}
