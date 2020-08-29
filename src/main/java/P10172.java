public class P10172 {
    public static String getDogShape() {
        String dogShape = "|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|";
        return dogShape;
    }

    public static void main(String... argv) {
        System.out.println(getDogShape());
        return;
    }
}
