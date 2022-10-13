package task8;

import java.util.*;

public class Task8 {

    private static final int N = 5;                                  // Array size
    private static final List<Integer> firstArr = new ArrayList<>();
    private static final List<Integer> secondArr = new ArrayList<>();
    private static final Map<Integer, Boolean> indexes = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Enter first sequence: ");
        fillArray(firstArr);
        System.out.print("Enter second sequence: ");
        fillArray(secondArr);
        searchForIndex();
        showNewIndexes();
    }

    private static void fillArray(List<Integer> arrayList) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arrayList.add(in.nextInt());
        }
    }

    private static void searchForIndex() {
        //we go through the arrays and put elements in HashMap
        int index = 0;
        for(int i = 0; i < N; i++) {
            if(!secondArr.isEmpty()) {
                if(firstArr.get(i) < secondArr.get(0)) {
                    indexes.put(index, false);
                } else {
                    indexes.put(index, true);
                    secondArr.remove(0);
                    i--;
                }
                index++;
            }else {
                return;
            }
        }
        addLast(index);
    }

    private static void addLast(int index) {
        while(!secondArr.isEmpty()) {
            indexes.put(index++, true);
            secondArr.remove(0);
        }
    }

    private static void showNewIndexes() {
        for (int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i)) {//check that element from second array
                System.out.printf("%d ", i+1);    //numbering from 1
            }
        }
    }
}