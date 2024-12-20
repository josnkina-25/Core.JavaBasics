public class Runner {
    public static void main(String[] args) {
//        DemoClass dObj = new DemoClass();
//        dObj.genericMethod(25); // passing int
//        dObj.genericMethod("Per Scholas"); // passing String
//        dObj.genericMethod(2563.5); // passing a float.
//        dObj.genericMethod('H');

        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype<>("Per Scholas", 11025);
        System.out.println((mobj.getValueOne()));
        System.out.println((mobj.getValueTwo()));

        //initialize generic class
        // with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("Per Scholas", "Non profit");
        System.out.println((mobj2.getValueOne()));
        System.out.println((mobj2.getValueTwo()));
    }
}