package org.example.yandex.academy.algo_design_techniques.booking_a_meeting_room_3_2_a;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_3_2_A {
    static int n;
    static ArrayList<Interval> intervals = new ArrayList<>();
    static ArrayList<Interval> result = new ArrayList<>();
    static int res;
    public static void main(String[] args) {
        input();
        res = solution(intervals);
        output();
    }
    public static void input() {
        Scanner s = new Scanner(System.in);
        String buf;
        n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            buf = s.nextLine();
            intervals.add(new Interval(buf));
        }
    }

    public static void output() {
        System.out.print(res);
    }

    public static int solution(ArrayList<Interval> intervals) {
        int res ;
        Interval.sortByEnd(intervals); // отсортировать по концу

        boolean marker = true;

        for  (int i = 0; i < intervals.size(); i++) {
            marker = true;
            Interval cp = intervals.get(i);
            for (int j = 0; j < result.size(); j++) {
               if(cp.intersection(result.get(j))) {
                   marker = false;
               }
            }
            if(marker) {
                result.add(cp);
            }

        }

        res = result.size();
        return res;
    }


}
class Interval {
    int start;
    int end;
    int length;
    public Interval(String src) {
        String[] s = src.split(" ");
        start = Integer.parseInt(s[0]);
        end = Integer.parseInt(s[1]);
        length = end - start;
    }
    @Override
    public String toString() {
        return "start - " + start + "; end - " + end + "; len - " + length;
    }

    public boolean intersection(Interval dest) {
        if (
            (this.start <= dest.start && dest.start <= this.end)
            || (this.start <= dest.end &&  dest.end <= this.end)
            || (dest.start <= this.start && this.start <= dest.end)
            || (dest.start <= this.end &&  this.end <= dest.end)
        ) {
            return true;
        }
        return false;
    }
    public static void sortByEnd(ArrayList<Interval> intervals) {
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i; j < intervals.size(); j++) {
                if(intervals.get(i).end > intervals.get(j).end) {
                    Interval temp = intervals.get(i);
                    intervals.set(i,intervals.get(j));
                    intervals.set(j,temp);
                }
            }
        }
    }
}
