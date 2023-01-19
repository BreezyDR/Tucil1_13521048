import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class utils {
    public static void print(String str) {
        // Menulis str tanpa newline
        System.out.print(str);
    } 
    public static void println() {
        // Menulis new line
        System.out.println();
    }
    
    public static void printlnstr(String str) {
        // Menulis str dengan newline
        System.out.println(str);
    }

    public static void printlnint(int integer) {
        // Menulis str bertipe integer denangan new line
        System.out.println(integer);
    }
    
    public static void printlndou(double dou) {
        // Menulis str bertipe double denangan new line
        System.out.println(dou);
    }
    
    public static void printf(String str, Object... args) {
        // Menulis str dengan beberapa format argumen
        System.out.printf(str, args);
    }

    public static void printstrarray(String[] liststring) {
        // Mencetak semua elemen dalam array of strings
        for (int i=0; i < liststring.length; i++) {
            printlnstr(liststring[i]);
        }
    }

    public static boolean isDivisible(int a, int b) {
        // Menentukan apakah a habis dibagi dengan b
        return (a % b == 0);
    }

    public static int[] RandomNumbers() {
        // Meng-generate angka 1-13 dengan urutan acak dalam sebuah array
        ArrayList numberlist = new ArrayList();
        for (int i=0; i < 13; i++) {
            numberlist.add(i+1);
        }
        Collections.shuffle((numberlist));
        Object[] result = numberlist.toArray();
        int newlist[] = new int[result.length];
        for (int i=0; i<13; i++) {
            newlist[i] = (int) result[i];
        }
        return newlist;
    }

    public static int[] pickFour(int[] numList) {
        // Mengambil 4 elemen pertama dalam sebuah list (ambil 4 buah kartu dalam sebuah set)
        int[] fourCards = new int[4];
        for (int i=0; i<4; i++) {
            fourCards[i] = numList[i];
        }
        return fourCards;
    }

    public static boolean isSubset(String[] list1, String[] list2) {
        // Menentukan apakah list2 merupakan subset list1
        int i = 0;
                int j = 0;
                for (i = 0; i < list2.length; i++) {
                    for (j = 0; j < list1.length; j++) {
                        if (list2[i].equals(list1[j])) {
                            break;
                        }
                    }
                    if (j == list1.length)
                        return false;
                }
                return true;
    }

    public static boolean isUnique(String[] list) {
        // Menentukan apakah list memiliki elemen-elemen unik (tidak ada elemen duplikat)
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (!list[i].equals(null) && list[i].equals(list[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] manualInput() {
        // Input pilihan kartu manual dari pengguna, output nilai dari kartu tersebut (sudah divalidasi)
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);
        String[] cardSet = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String userInput = "";
        while (!validInput) {
            print("Masukkan pilihan kartu: ");
            userInput = sc.nextLine();
            String[] inputList = userInput.split(" ");
            if (inputList.length != 4) {
                printlnstr("Perlu dimasukkan 4 kartu.");
            } else {
                if (isSubset(cardSet, inputList) && isUnique(inputList)) {
                    validInput = true;
                } else {
                    printlnstr("Masukan tidak valid, coba lagi.");
                }
            }
        }
        String[] inputList = userInput.split(" ");
        int[] resultList = new int[4];
        for (int i = 0; i < 4; i++) {
                if (inputList[i].equals("A")) {
                    resultList[i] = 1;
                }
                else if (inputList[i].equals("2")) {
                    resultList[i] = 2;
                }
                else if (inputList[i].equals("3")) {
                    resultList[i] = 3;
                }
                else if (inputList[i].equals("4")) {
                    resultList[i] = 4;
                }
                else if (inputList[i].equals("5")) {
                    resultList[i] = 5;
                }
                else if (inputList[i].equals("6")) {
                    resultList[i] = 6;
                }
                else if (inputList[i].equals("7")) {
                    resultList[i] = 7;
                }
                else if (inputList[i].equals("8")) {
                    resultList[i] = 8;
                }
                else if (inputList[i].equals("9")) {
                    resultList[i] = 9;
                }
                else if (inputList[i].equals("10")) {
                    resultList[i] = 10;
                }
                else if (inputList[i].equals("J")) {
                    resultList[i] = 11;
                }
                else if (inputList[i].equals("Q")) {
                    resultList[i] = 12;
                }
                else if (inputList[i].equals("K")) {
                    resultList[i] = 13;
                }
        }
        return resultList;
    }

}


