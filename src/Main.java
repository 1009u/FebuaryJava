public class Main {

    public static void main(String[] args) {

        //this is an anonymous class
//        WaterBottle obj = new WaterBottle() {
//            @Override
//            public void drink() {
//                System.out.println("Use water bottle for drinking");
//            }
//        };
//        obj.drink();
//    }

        //lambda expression
        WaterBottle obj2 = () ->
                System.out.println("Crush the bottle after drink");
}

}
