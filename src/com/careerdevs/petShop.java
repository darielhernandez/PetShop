package com.careerdevs;

public class petShop {
    public static String dnaToRna(String strand) {
//         dna= "ATGC";
//         rna= "UACG";
        //this is DNA  -> RNA converter, not petShop
        String replace1= strand.replaceAll("A", "U");
        String replace2= replace1.replaceAll("T", "A");
        String replace3= replace2.replaceAll("G", "X");
        String replace4= replace3.replaceAll("C", "G");
        String replace5= replace4.replaceAll("X", "C");
        return replace5;
    }
//
}
