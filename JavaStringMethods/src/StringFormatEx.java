public class StringFormatEx {
    public static void main(String[] args) {
        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format("This is an integer: %d and this is a byte: %d.\r\n", i ,b);
        System.out.format("This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny );
        System.out.format("And this is a String: %s", "This is a string.\r\n");

    }
}