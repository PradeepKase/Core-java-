package question_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }
    static int myArraylist(int[] num, int key){
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if(element < key){
                return element;
            }
        }
        return -1;
    }

}
