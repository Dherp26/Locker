package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;


public class Main {

    static int cekLoker(int x){

        int floor = 0;
        List<Integer> a = new ArrayList<>(4);
        List<Integer> b = new ArrayList<>(5);
        List<Integer> c = new ArrayList<>(6);

        for (int i = 1; i <= x; i++) {
            if (a.size() < 5 ){
                a.add(i);
                if (a.size() == 5 || i == x){
                    floor+=1;
                }
            }
            else if (b.size() < 6){
                b.add(i);
                if (b.size() == 6 || i == x){
                    floor+=1;
                }
            }
            else if (c.size() < 7){
                c.add(i);
                if ( c.size() == 7 || i == x){
                    floor+=1;

                }
                if (c.size() == 7){
                    a.clear();
                    b.clear();
                    c.clear();
                }
            }
        }
        return floor;
    }

    public static int bil(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }

    public static void main(String[] args) {
        // write your code here

            int inp = bil();
            System.out.println(" Lantai = " + cekLoker(inp));
    }
}
