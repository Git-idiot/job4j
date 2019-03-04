package ru.job4j.condition;

public class MultiMax {
    public Max m = new Max();


    public int multiMax (int first, int second, int third) {

        int max = m.max(first, second);
        return max-third>0 ? max : third;

    }
    public static void main(String[] args) {
        MultiMax multiMax = new MultiMax ();
        int res=multiMax.multiMax(3,0,1);
        System.out.println(res);

    }
}
