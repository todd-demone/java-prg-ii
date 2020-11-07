// tmc pastebin code https://tmc.mooc.fi/paste/huwmBRHbfRZh7XdV9SIAlA

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
       
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 25; i++) {
            hashMap.add(i, i);
        }
//        System.out.println(hashMap.get(35));
//        System.out.println("-----");
//        
//        hashMap.remove(44);
//        hashMap.remove(12);
        
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(18));

    }

}
