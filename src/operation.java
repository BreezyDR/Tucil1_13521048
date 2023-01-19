import java.util.ArrayList;

public class operation extends utils {
    public static String[] findsolution24(int a, int b, int c, int d) {
        ArrayList<String> solutionList = new ArrayList<String>();
        // janlup ubah a , b, c, d jadi angka-angka pas di main
        if (a + b + c + d == 24) {
            solutionList.add("((" + a + " + " + b + ") + " + c + ") + " + d);
            solutionList.add("(" + a + " + (" + b + " + " + c + ")) + " + d);
            solutionList.add("(" + a + " + " + b + ") + (" + c + " + " + d + ")");
            solutionList.add(a + " + ((" + b + " + " + c + ") + " + d + ")");
        }
        if (a + b + c - d == 24) {
            solutionList.add("((" + a + " + " + b + ") + " + c + ") - " + d);
            solutionList.add("(" + a + " + (" + b + " + " + c + ")) - " + d);
            solutionList.add("(" + a + " + " + b + ") + (" + c + " - " + d + ")");
            solutionList.add(a + " + ((" + b + " + " + c + ") - " + d + ")");
        }
        if (a + b - c + d == 24) {
            solutionList.add("((" + a + " + " + b + ") - " + c + ") + " + d);
            solutionList.add("(" + a + " + (" + b + " - " + c + ")) + " + d);
            solutionList.add("(" + a + " + " + b + ") - (" + c + " - " + d + ")");
            solutionList.add(a + " + ((" + b + " - " + c + ") + " + d + ")");
        }
        if (a - b + c + d == 24) {
            solutionList.add("((" + a + " - " + b + ") + " + c + ") + " + d);
            solutionList.add("(" + a + " - (" + b + " - " + c + ")) + " + d);
            solutionList.add("(" + a + " - " + b + ") + (" + c + " + " + d + ")");
            solutionList.add(a + " - ((" + b + " - " + c + ") - " + d + ")");
        }
        if (a + b - c - d == 24) {
            solutionList.add("((" + a + " + " + b + ") - " + c + ") - " + d);
            solutionList.add("(" + a + " + (" + b + " - " + c + ")) - " + d);
            solutionList.add("(" + a + " + " + b + ") - (" + c + " + " + d + ")");
            solutionList.add(a + " + ((" + b + " - " + c + ") - " + d + ")");
        }
        if (a * b * c * d == 24) {
            solutionList.add("((" + a + " * " + b + ") * " + c + ") * " + d);
            solutionList.add("(" + a + " * (" + b + " * " + c + ")) * " + d);
            solutionList.add("(" + a + " * " + b + ") * (" + c + " * " + d + ")");
            solutionList.add(a + " * ((" + b + " * " + c + ") * " + d + ")");
        }
        
    }
}
