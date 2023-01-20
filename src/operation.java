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
        // *, -, -
        if ((a * b - c) - d == 24) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") - " + c + ") - " + d);
        }
        if ((a * (b - c)) - d == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " - " + c + ")) - " + d);
        }
        if ((a * b) - (c - d) == 24) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") - (" + c + " - " + d + ")");
        }
        if (a * ((b - c) - d) == 24) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " - " + c + ") - " + d + ")");
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
        if (((a + b) * c) - d == 24) {
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
        // a, b, c, d harus diubah menjadi double lalu diubah lagi menjadi int
        double[] flVersion = convertTodouble(a, b, c, d);
        double e = flVersion[0];
        double f = flVersion[1];
        double g = flVersion[2];
        double h = flVersion[3];
        // +, +, /
        if (((e + f) + g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") + " + c + ") / " + d);
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " + " + c + ")) / " + d);
        }
        if ((e + f) + (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") + (" + c + " / " + d + ")");
        }
        if (e + ((f + g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " + " + c + ") / " + d + ")");
        }
        // +, /, +
        if (((e + f) / g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") / " + c + ") + " + d);
        }
        if ((e + (f / g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " / " + c + ")) + " + d);
        }
        if ((e + f) / (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") / (" + c + " + " + d + ")");
        }
        if (e + ((f / g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " / " + c + ") + " + d + ")");
        }
        // /, +, +
        if (((e / f) + g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") + " + c + ") + " + d);
        }
        if ((e / (f + g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " + " + c + ")) + " + d);
        }
        if ((e / f) + (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") + (" + c + " + " + d + ")");
        }
        if (e / ((f + g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " + " + c + ") + " + d + ")");
        }
        // /, /, +
        if (((e / f) / g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") / " + c + ") + " + d);
        }
        if ((e / (f / g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " / " + c + ")) + " + d);
        }
        if ((e / f) / (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") / (" + c + " + " + d + ")");
        }
        if (e / ((f / g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " / " + c + ") + " + d + ")");
        }
        // /, +, /
        if (((e / f) + g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") + " + c + ") / " + d);
        }
        if ((e / (f + g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " + " + c + ")) / " + d);
        }
        if ((e / f) + (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") + (" + c + " / " + d + ")");
        }
        if (e / ((f + g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " + " + c + ") / " + d + ")");
        }
        // +, /, /
        if (((e + f) / g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") / " + c + ") / " + d);
        }
        if ((e + (f / g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " / " + c + ")) / " + d);
        }
        if ((e + f) / (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") / (" + c + " / " + d + ")");
        }
        if (e + ((f / g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " / " + c + ") / " + d + ")");
        }
        // -, -, /
        if (((e - f) - g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") - " + c + ") / " + d);
        }
        if ((e - (f - g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " - " + c + ")) / " + d);
        }
        if ((e - f) - (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") - (" + c + " / " + d + ")");
        }
        if (e - ((f - g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " - " + c + ") / " + d + ")");
        }
        // -, /, -
        if (((e - f) / g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") / " + c + ") - " + d);
        }
        if ((e - (f / g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " / " + c + ")) - " + d);
        }
        if ((e - f) / (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") / (" + c + " - " + d + ")");
        }
        if (e - ((f / g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " / " + c + ") - " + d + ")");
        }
        // /, -, -
        if (((e / f) - g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") - " + c + ") - " + d);
        }
        if ((e / (f - g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " - " + c + ")) - " + d);
        }
        if ((e / f) - (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") - (" + c + " - " + d + ")");
        }
        if (e / ((f - g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " - " + c + ") - " + d + ")");
        }
        // /, /, -
        if (((e / f) / g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") / " + c + ") - " + d);
        }
        if ((e / (f / g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " / " + c + ")) - " + d);
        }
        if ((e / f) / (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") / (" + c + " - " + d + ")");
        }
        if (e / ((f / g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " / " + c + ") - " + d + ")");
        }
        // /, -, /
        if (((e / f) - g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") - " + c + ") / " + d);
        }
        if ((e / (f - g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " - " + c + ")) / " + d);
        }
        if ((e / f) - (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") - (" + c + " / " + d + ")");
        }
        if (e / ((f - g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " - " + c + ") / " + d + ")");
        }
        // -, /, /
        if (((e - f) / g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") / " + c + ") / " + d);
        }
        if ((e - (f / g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " / " + c + ")) / " + d);
        }
        if ((e - f) / (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") / (" + c + " / " + d + ")");
        }
        if (e - ((f / g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " / " + c + ") / " + d + ")");
        }

        // *, *, /
        if (((e * f) * g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") * " + c + ") / " + d);
        }
        if ((e * (f * g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " * " + c + ")) / " + d);
        }
        if ((e * f) * (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") * (" + c + " / " + d + ")");
        }
        if (e * ((f * g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " * " + c + ") / " + d + ")");
        }
        // *, /, *
        if (((e * f) / g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") / " + c + ") * " + d);
        }
        if ((e * (f / g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " / " + c + ")) * " + d);
        }
        if ((e * f) / (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") / (" + c + " * " + d + ")");
        }
        if (e * ((f / g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " / " + c + ") * " + d + ")");
        }
        // /, *, *
        if (((e / f) * g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") * " + c + ") * " + d);
        }
        if ((e / (f * g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " * " + c + ")) * " + d);
        }
        if ((e / f) * (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") * (" + c + " * " + d + ")");
        }
        if (e / ((f * g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " * " + c + ") * " + d + ")");
        }
        // /, /, *
        if (((e / f) / g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") / " + c + ") * " + d);
        }
        if ((e / (f / g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " / " + c + ")) * " + d);
        }
        if ((e / f) / (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") / (" + c + " * " + d + ")");
        }
        if (e / ((f / g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " / " + c + ") * " + d + ")");
        }
        // /, *, /
        if (((e / f) * g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") * " + c + ") / " + d);
        }
        if ((e / (f * g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " * " + c + ")) / " + d);
        }
        if ((e / f) * (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") * (" + c + " / " + d + ")");
        }
        if (e / ((f * g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " * " + c + ") / " + d + ")");
        }
        // *, /, /
        if (((e * f) / g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") / " + c + ") / " + d);
        }
        if ((e * (f / g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " / " + c + ")) / " + d);
        }
        if ((e * f) / (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") / (" + c + " / " + d + ")");
        }
        if (e * ((f / g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " / " + c + ") / " + d + ")");
        }
        // /, +, -
        if (((e / f) + g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") + " + c + ") - " + d);
        }
        if ((e / (f + g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " + " + c + ")) - " + d);
        }
        if ((e / f) + (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") + (" + c + " - " + d + ")");
        }
        if (e / ((f + g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " + " + c + ") - " + d + ")");
        }
        // /, +, *
        if (((e / f) + g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") + " + c + ") * " + d);
        }
        if ((e / (f + g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " + " + c + ")) * " + d);
        }
        if ((e / f) + (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") + (" + c + " * " + d + ")");
        }
        if (e / ((f + g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " + " + c + ") * " + d + ")");
        }
        // /, -, +
        if (((e / f) - g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") - " + c + ") + " + d);
        }
        if ((e / (f - g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " - " + c + ")) + " + d);
        }
        if ((e / f) - (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") - (" + c + " + " + d + ")");
        }
        if (e / ((f - g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " - " + c + ") + " + d + ")");
        }
        // /, *, +
        if (((e / f) * g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") * " + c + ") + " + d);
        }
        if ((e / (f * g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " * " + c + ")) + " + d);
        }
        if ((e / f) * (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") * (" + c + " + " + d + ")");
        }
        if (e / ((f * g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " * " + c + ") + " + d + ")");
        }
        // /, *, -
        if (((e / f) * g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") * " + c + ") - " + d);
        }
        if ((e / (f * g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " * " + c + ")) - " + d);
        }
        if ((e / f) * (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") * (" + c + " - " + d + ")");
        }
        if (e / ((f * g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " * " + c + ") - " + d + ")");
        }
        // /, -, *
        if (((e / f) - g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " / " + b + ") - " + c + ") * " + d);
        }
        if ((e / (f - g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / (" + b + " - " + c + ")) * " + d);
        }
        if ((e / f) - (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " / " + b + ") - (" + c + " * " + d + ")");
        }
        if (e / ((f - g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " / ((" + b + " - " + c + ") * " + d + ")");
        }
        // +, /, *
        if (((e + f) / g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") / " + c + ") * " + d);
        }
        if ((e + (f / g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " / " + c + ")) * " + d);
        }
        if ((e + f) / (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") / (" + c + " * " + d + ")");
        }
        if (e + ((f / g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " / " + c + ") * " + d + ")");
        }
        // +, /, -
        if (((e + f) / g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") / " + c + ") - " + d);
        }
        if ((e + (f / g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " / " + c + ")) - " + d);
        }
        if ((e + f) / (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") / (" + c + " - " + d + ")");
        }
        if (e + ((f / g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " / " + c + ") - " + d + ")");
        }
        // +, *, /
        if (((e + f) * g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") * " + c + ") / " + d);
        }
        if ((e + (f * g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " * " + c + ")) / " + d);
        }
        if ((e + f) * (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") * (" + c + " / " + d + ")");
        }
        if (e + ((f * g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " * " + c + ") / " + d + ")");
        }
        // +, -, /
        if (((e + f) - g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " + " + b + ") - " + c + ") / " + d);
        }
        if ((e + (f - g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + (" + b + " - " + c + ")) / " + d);
        }
        if ((e + f) - (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " + " + b + ") - (" + c + " / " + d + ")");
        }
        if (e + ((f - g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " + ((" + b + " - " + c + ") / " + d + ")");
        }
        // *, /, +
        if (((e * f) / g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") / " + c + ") + " + d);
        }
        if ((e * (f / g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " / " + c + ")) + " + d);
        }
        if ((e * f) / (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") / (" + c + " + " + d + ")");
        }
        if (e * ((f / g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " / " + c + ") + " + d + ")");
        }
        // *, /, -
        if (((e * f) / g) - h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") / " + c + ") - " + d);
        }
        if ((e * (f / g)) - h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " / " + c + ")) - " + d);
        }
        if ((e * f) / (g - h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") / (" + c + " - " + d + ")");
        }
        if (e * ((f / g) - h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " / " + c + ") - " + d + ")");
        }
        // *, +, /
        if (((e * f) + g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") + " + c + ") / " + d);
        }
        if ((e * (f + g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " + " + c + ")) / " + d);
        }
        if ((e * f) + (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") + (" + c + " / " + d + ")");
        }
        if (e * ((f + g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " + " + c + ") / " + d + ")");
        }
        // *, -, /
        if (((e * f) - g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " * " + b + ") - " + c + ") / " + d);
        }
        if ((e * (f - g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * (" + b + " - " + c + ")) / " + d);
        }
        if ((e * f) - (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " * " + b + ") - (" + c + " / " + d + ")");
        }
        if (e * ((f - g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " * ((" + b + " - " + c + ") / " + d + ")");
        }
        // -, /, +
        if (((e - f) / g) + h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") / " + c + ") + " + d);
        }
        if ((e - (f / g)) + h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " / " + c + ")) + " + d);
        }
        if ((e - f) / (g + h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") / (" + c + " + " + d + ")");
        }
        if (e - ((f / g) + h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " / " + c + ") + " + d + ")");
        }
        // -, /, *
        if (((e - f) / g) * h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") / " + c + ") * " + d);
        }
        if ((e - (f / g)) * h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " / " + c + ")) * " + d);
        }
        if ((e - f) / (g * h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") / (" + c + " * " + d + ")");
        }
        if (e - ((f / g) * h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " / " + c + ") * " + d + ")");
        }
        // -, *, /
        if (((e - f) * g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") * " + c + ") / " + d);
        }
        if ((e - (f * g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " * " + c + ")) / " + d);
        }
        if ((e - f) * (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") * (" + c + " / " + d + ")");
        }
        if (e - ((f * g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " * " + c + ") / " + d + ")");
        }
        // -, +, /
        if (((e - f) + g) / h == 24.0) {
            solutionList = concatStr(solutionList, "((" + a + " - " + b + ") + " + c + ") / " + d);
        }
        if ((e - (f + g)) / h == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - (" + b + " + " + c + ")) / " + d);
        }
        if ((e - f) + (g / h) == 24.0) {
            solutionList = concatStr(solutionList, "(" + a + " - " + b + ") + (" + c + " / " + d + ")");
        }
        if (e - ((f + g) / h) == 24.0) {
            solutionList = concatStr(solutionList, a + " - ((" + b + " + " + c + ") / " + d + ")");
        }
        
        // Return array of strings
        return solutionList;
    }

    public static String[] final24(int a, int b, int c, int d) {
        String[] fullSolutionList = {};
        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, d, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, d, b, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, c, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, c, b, a));
        }
        else if (a == b && a != c && a != d && b != c && b != d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, d, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, c, a, b));
        }
        else if (a != b && a == c && a != d && b != c && b != d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, a, c));
        }
        else if (a != b && a != c && a == d && b != c && b != d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, c, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, a, d));
        } else if (a != b && a != c && a != d && b == c && b != d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, b, c, a));
        } else if (a != b && a != c && a != d && b != c && b == d && c != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, d, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, d, a));
        } else if (a != b && a != c && a != d && b != c && b != d && c == d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, c, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, b, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, d, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, a, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, b, d, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, d, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, d, b, a));
        } else if (a == b && a == c && a != d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, c, d));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, d, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, d, b, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(d, a, b, c));
        } else if (a != b && a == c && a == d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, b, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, a, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, a, a));
        }
        else if (a == b && a != c && a == d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, a, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, a, a));
        } else if (a != b && b == c && b == d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, b, b, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, b, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, b, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, b, b));
        } else if (a == b && a == c && a == d) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, a, a));
        } else if (a == b && c == d && a != c) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, c, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, a, c));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, c, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, c, a, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, c, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(c, a, a, c));
        } else if (a == c && b == d && a != b) {
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, a, b, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, a, b));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(a, b, b, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, b, a, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, b, a));
            fullSolutionList = mergeArrays(fullSolutionList, findsolution24(b, a, a, b));
        }
        return fullSolutionList;
    }
}
