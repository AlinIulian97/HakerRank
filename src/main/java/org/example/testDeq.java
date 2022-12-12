package org.example;

import java.util.*;

public class testDeq {
    public static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//
//        int cont = scanner.nextInt();
//        Integer M = scanner.nextInt();
//        Deque<Integer> deque = new LinkedList<>();
//        Object[] tempArrat;
//
//        for (int i = 0; i < cont; i++) {
//            Integer N = scanner.nextInt();
//            deque.add(N);
//        }
//
//        Set<Integer> hashSet = new LinkedHashSet<>(deque);
//        ArrayList<Integer> removedDuplicates = new ArrayList<>(hashSet);
//
////        System.out.println(removedDuplicates);
////        System.out.println(Arrays.toString(deque.toArray()));
//        Deque<Integer> deque1 = new LinkedList<>();
//        for (int i = 0; i < cont - (M - 1); i++) {
//            int beg = i;
//            tempArrat = Arrays.copyOfRange(deque.toArray(), beg, M + i);
////            System.out.println(Arrays.toString(tempArrat));
//            deque1.add(tempArrat);
//            System.out.println(Arrays.toString(deque1.toArray()));
//        }
//        for (int i = 0; i < deque1.size() ; i++){
//            Set<Integer> hashSet1 = new LinkedHashSet<>(deque1);
//            ArrayList<Integer> removedDuplicates1 = new ArrayList<>(hashSet);
//            System.out.println(deque1.size());
//        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            deque.add(input);
            set.add(input);
            if (deque.size() == m) {
                if (set.size() > max)
                    max = set.size();
                int first = (int) deque.remove();
                if (!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(max);
    }
}





