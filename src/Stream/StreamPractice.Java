public class StreamPractice{
    public static void min(String[] args){
        List<Dish> menu = ArrayList;
            new Dish("salmon", false, Dish.Type.FISH);



        System.out.println(
            menu.stream()
                .filter()
        );

        System.out.println(
            menu.stream()
                .filter( d ->{return d.getCalries() > 50})
                .count()
        );

        InStream.range(0,29)
            .filter(d -> {return i % 2 = 0})
            .forEach(i -> System.out.println(i*i));
    }
}