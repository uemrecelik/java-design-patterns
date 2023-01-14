public class Main {
    public static void main(String[] args) {
        Waffle waffle = new NormalWaffle();
        System.out.println(waffle.getDesc()+ " $"+ waffle.cost());

        Waffle waffle2 = new WrapWaffle();
        waffle2 = new Nutella(waffle2);
        waffle2 = new Banana(waffle2);
        waffle2 = new Hazelnut(waffle2);

        System.out.println(waffle2.getDesc() + " $"+ waffle2.cost());



    }
}
