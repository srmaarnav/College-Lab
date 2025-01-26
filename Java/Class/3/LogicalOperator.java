public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Logical AND operator
        boolean resultAnd = a && b;
        System.out.println("a && b = " + resultAnd);

        // Logical OR operator
        boolean resultOr = a || b;
        System.out.println("a || b = " + resultOr);

        // Logical NOT operator
        boolean resultNotA = !a;
        System.out.println("!a = " + resultNotA);

        boolean resultNotB = !b;
        System.out.println("!b = " + resultNotB);
    }
}
