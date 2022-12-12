package org.example;

import java.util.*;

public class Dequeue {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Set<int[]> deque = new LinkedHashSet<>();
//
//        int N = scanner.nextInt();
//        int M = scanner.nextInt();
//        int count = M;
//        int[] array = new int[N];
//        int[] subarry;
//        for (int i = 0; i < array.length; i++) {
//            int number = scanner.nextInt();
//            array[i] = number;
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < N - (M - 1); i++) {
//            int beg = i;
//            subarry = Arrays.copyOfRange(array, beg, M + i);
//            System.out.println(Arrays.toString(subarry));
//            deque.add(subarry);
//        }
//    }
//}

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


