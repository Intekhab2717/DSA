package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StachUsingSingleQueues {
    static Queue<Integer> q= new LinkedList();
    static int popped=0,topElmt=0;
    public static void main(String[] args) {
        //Queue<Integer> q= new LinkedList();
        pushh(10);
        pushh(11);
        topElmt = topElmt();
        System.out.println("Topeed elmt : "+ topElmt);
        popped= popp();
        System.out.println("Popped elmt : "+popped);
        pushh(12);
        pushh(13);
        popped= popp();
        System.out.println("Popped elmt : "+popped);
        topElmt = topElmt();
        System.out.println("Topeed elmt : "+ topElmt);
        System.out.println("Size is : "+ sizze());
        System.out.println("Size is : "+ isEmptty());
    }

    private static boolean isEmptty() {
        return q.size()<1;
    }

    private static int sizze() {
        return q.size();
    }

    private static int topElmt() {
        return q.peek();
    }

    private static int popp() {
        return q.poll();
    }

    private static void pushh(int i) {
        q.offer(i);
        for (int j = 0; j < q.size()-1; j++) {
            q.offer(q.peek());
            q.poll();
        }
    }

}
