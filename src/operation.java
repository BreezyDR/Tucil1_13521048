public class operation extends utils {
    public static String[] findsolution24(int a, int b, int c, int d) {
        String[] solutionList = {};
        
        // Penjumlahan & pengurangan

        // +, +, +
        if (a + b + c + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") + " + c + ") + " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " + " + c + ")) + " + d);
            solutionList = concatStr(solutionList,"(" + a + " + " + b + ") + (" + c + " + " + d + ")");
            solutionList = concatStr(solutionList, a + " + ((" + b + " + " + c + ") + " + d + ")");
        }
        // +, +, -
        if (a + b + c - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") + " + c + ") - " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " + " + c + ")) - " + d);
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") + (" + c + " - " + d + ")");
            solutionList = concatStr(solutionList, a + " + ((" + b + " + " + c + ") - " + d + ")");
        }
        // +, -, +
        if (a + b - c + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") - " + c + ") + " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " - " + c + ")) + " + d);
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") - (" + c + " - " + d + ")");
            solutionList = concatStr(solutionList, a + " + ((" + b + " - " + c + ") + " + d + ")");
        }
        // -, +, +
        if (a - b + c + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") + " + c + ") + " + d);
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " - " + c + ")) + " + d);
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") + (" + c + " + " + d + ")");
            solutionList = concatStr(solutionList, a + " - ((" + b + " - " + c + ") - " + d + ")");
        }
        // +, -, -
        if (a + b - c - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") - " + c + ") - " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " - " + c + ")) - " + d);
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") - (" + c + " + " + d + ")");
            solutionList = concatStr(solutionList, a + " + ((" + b + " - " + c + ") - " + d + ")");
        }
        // -, +, -
        if (a - b + c - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") + " + c + ") - " + d);
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " - " + c + ")) - " + d);
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") + (" + c + " - " + d + ")");
            solutionList = concatStr(solutionList, a + " - ((" + b + " - " + c + ") + " + d + ")");

        }
        // -, -, +
        if (a - b - c + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") - " + c + ") + " + d);
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " + " + c + ")) + " + d);
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") - (" + c + " - " + d + ")");
            solutionList = concatStr(solutionList, a + " - ((" + b + " + " + c + ") - " + d + ")");
        }
        // -, -, -
        if (a - b - c - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") - " + c + ") - " + d);
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " + " + c + ")) - " + d);
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") - (" + c + " + " + d + ")");
            solutionList = concatStr(solutionList, a + " - ((" + b + " + " + c + ") + " + d + ")");

        }

        // Semua operasi kecuali pembagian

        // *, *, *
        if (a * b * c * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") * " + c + ") * " + d);
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " * " + c + ")) * " + d);
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") * (" + c + " * " + d + ")");
            solutionList = concatStr(solutionList, a + " * ((" + b + " * " + c + ") * " + d + ")");
        }
        // *, *, +
        if ((a * b * c) + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") * " + c + ") + " + d);
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " * " + c + ")) + " + d);
        }
        if ((a * b) * (c + d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") * (" + c + " + " + d + ")");
        }
        if (a * ((b * c) + d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " * " + c + ") + " + d + ")");
        }
        // *, +, *
        if ((a * b + c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") + " + c + ") * " + d);
        }
        if ((a * (b + c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " + " + c + ")) * " + d);
        }
        if ((a * b) + (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") + (" + c + " * " + d + ")");
        }
        if (a * ((b + c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " + " + c + ") * " + d + ")");
        }
        // +, *, *
        if (((a + b) * c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") * " + c + ") * " + d);
        }
        if ((a + (b * c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " * " + c + ")) * " + d);
        }
        if ((a + b) * (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") * (" + c + " * " + d + ")");
        }
        if (a + ((b * c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " * " + c + ") * " + d + ")");
        }
        // +, +, *
        if (((a + b) + c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") + " + c + ") * " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " + " + c + ")) * " + d);
        }
        if ((a + b) + (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") + (" + c + " * " + d + ")");
        }
        if (a + ((b + c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " + " + c + ") * " + d + ")");
        }
        // +, *, +
        if (((a + b) * c) + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") * " + c + ") + " + d);
        }
        if ((a + (b * c)) + d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " * " + c + ")) + " + d);
        }
        if ((a + b) * (c + d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") * (" + c + " + " + d + ")");
        }
        if (a + ((b * c) + d) == 24) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " * " + c + ") + " + d + ")");
        }
        // *, +, +
        if (((a * b) + c) + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") + " + c + ") + " + d);
        }
        if ((a * (b + c)) + d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " + " + c + ")) + " + d);
        }
        if ((a * b) + (c + d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") + (" + c + " + " + d + ")");
        }
        if (a * ((b + c) + d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " + " + c + ") + " + d + ")");
        }
        // *, *, -
        if ((a * b * c) - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") * " + c + ") - " + d);
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " * " + c + ")) - " + d);
        }
        if ((a * b) * (c - d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") * (" + c + " - " + d + ")");
        }
        if (a * ((b * c) - d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " * " + c + ") - " + d + ")");
        }
        // *, -, *
        if ((a * b - c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") - " + c + ") * " + d);
        }
        if ((a * (b - c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " - " + c + ")) * " + d);
        }
        if ((a * b) - (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") - (" + c + " * " + d + ")");
        }
        if (a * ((b - c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " - " + c + ") * " + d + ")");
        }
        // -, *, *
        if (((a - b) * c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") * " + c + ") * " + d);
        }
        if ((a - (b * c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " * " + c + ")) * " + d);
        }
        if ((a - b) * (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") * (" + c + " * " + d + ")");
        }
        if (a - ((b * c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " * " + c + ") * " + d + ")");
        }
        // -, -, *
        if (((a - b) - c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") - " + c + ") * " + d);
        }
        if ((a - (b - c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " - " + c + ")) * " + d);
        }
        if ((a - b) - (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") - (" + c + " * " + d + ")");
        }
        if (a - ((b - c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " - " + c + ") * " + d + ")");
        }
        // -, *, -
        if (((a - b) * c) - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") * " + c + ") - " + d);
        }
        if ((a - (b * c)) - d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " * " + c + ")) - " + d);
        }
        if ((a - b) * (c - d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") * (" + c + " - " + d + ")");
        }
        if (a - ((b * c) - d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " * " + c + ") - " + d + ")");
        }
        // -, -, *
        if ((a - b - c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") - " + c + ") * " + d);
        }
        if ((a - (b - c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " - " + c + ")) * " + d);
        }
        if ((a - b) - (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") - (" + c + " * " + d + ")");
        }
        if (a - ((b - c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " - " + c + ") * " + d + ")");
        }
        // +, -, *
        if ((a + b - c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") - " + c + ") * " + d);
        }
        if ((a + (b - c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " - " + c + ")) * " + d);
        }
        if ((a + b) - (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") - (" + c + " * " + d + ")");
        }
        if (a + ((b - c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " - " + c + ") * " + d + ")");
        }
        // +, *, -
        if ((a + b * c) - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") * " + c + ") - " + d);
        }
        if ((a + (b * c)) - d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " * " + c + ")) - " + d);
        }
        if ((a + b) * (c - d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") * (" + c + " - " + d + ")");
        }
        if (a + ((b * c) - d) == 24) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " * " + c + ") - " + d + ")");
        }
        // *, +, -
        if (((a * b) + c) - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") + " + c + ") - " + d);
        }
        if ((a * (b + c)) - d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " + " + c + ")) - " + d);
        }
        if ((a * b) + (c - d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") + (" + c + " - " + d + ")");
        }
        if (a * ((b + c) - d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " + " + c + ") - " + d + ")");
        }
        // *, -, +
        if (((a * b) - c) + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") - " + c + ") + " + d);
        }
        if ((a * (b - c)) + d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " - " + c + ")) + " + d);
        }
        if ((a * b) - (c + d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") - (" + c + " + " + d + ")");
        }
        if (a * ((b - c) + d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " - " + c + ") + " + d + ")");
        }
        // -, *, +
        if (((a - b) * c) + d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") * " + c + ") + " + d);
        }
        if ((a - (b * c)) + d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " * " + c + ")) + " + d);
        }
        if ((a - b) * (c + d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") * (" + c + " + " + d + ")");
        }
        if (a - ((b * c) + d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " * " + c + ") + " + d + ")");
        }
        // -, +, *
        if (((a - b) + c) * d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") + " + c + ") * " + d);
        }
        if ((a - (b + c)) * d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " + " + c + ")) * " + d);
        }
        if ((a - b) + (c * d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") + (" + c + " * " + d + ")");
        }
        if (a - ((b + c) * d) == 24) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " + " + c + ") * " + d + ")");
        }

        // Operasi termasuk pembagian
        // a, b, c, d harus diubah menjadi float lalu diubah lagi menjadi int





        


        



        // Return array of strings
        return solutionList;
    }
}
