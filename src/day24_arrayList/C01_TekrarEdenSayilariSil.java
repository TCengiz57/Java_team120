package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSil {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 3, 2, 5, 1, 5, 3, 7};
        List<Integer> tekrarsizList = new ArrayList();
        System.out.println(tekrarsizList);

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println(tekrarsizList);
        System.out.println(Arrays.toString(arr));
        arr = new int[tekrarsizList.size()];
        System.out.println(Arrays.toString(arr));

        for(i = 0; i < arr.length; ++i) {
            arr[i] = (Integer)tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
