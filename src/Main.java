public class Main {
    public static void main(String[] args) {
//        int [] a= new int[]{18,19,22};
//        String [] b ={" Aidai"," Dilnaz"," Dasha"};
//        dvaMassiva(a,b);
        String a= "  I like Java!!!";
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.replace("a","o"));
        String word = a.substring(9,13);
        System.out.println(word.toUpperCase());
        String word1= a.substring(9,13);
        System.out.println(word1.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.trim());


    }

//    static void dvaMassiva(int[] ages, String... names) {
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(names[i]+" " + ages[i]+ " let");
//
//        }
//    }


}