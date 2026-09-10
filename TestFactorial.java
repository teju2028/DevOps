public class TestFactorial {

    public static void main(String args[]) {
        try {
            if (Factorial.compute(5) != 120) {
                throw new AssertionError("Factorial not valid");
            }

            if (Factorial.compute(1) != 1) {
                throw new AssertionError("Factorial not valid");
            }

            System.out.println("Successful Factorial");
        }
        catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            System.exit(1);
        }
    }
}
