// 12S24057 - Laura Awise Sirumapea
// 12S24017 - Arya Pratama Sinambela

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judulbuku, penulisbuku, formatbuku, kategoribuku, penerbit;
        double tahunterbit, hargabuku, minimummargin, stok, rating;

        isbn = input.nextLine();
        judulbuku = input.nextLine();
        penulisbuku = input.nextLine();
        tahunterbit = Double.parseDouble(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargabuku = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Double.parseDouble(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategoribuku = "best pick";
        } else {
            if (rating >= 4.5) {
                kategoribuku = "must read";
            } else {
                if (rating >= 4.0) {
                    kategoribuku = "recommended";
                } else {
                    if (rating >= 3.0) {
                        kategoribuku = "average";
                    } else {
                        kategoribuku = "low";
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judulbuku + "|" + penulisbuku + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargabuku + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategoribuku);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
