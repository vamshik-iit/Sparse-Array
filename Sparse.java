/* @author KUSA VAMSHI */

/* This is the program for Sparse Array */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        List <String> l = new ArrayList<>();
        for(int i = 0 ; i< n1 ; ++i)
            l.add(sc.next());
        int n2 = sc.nextInt();
        List <String> q = new ArrayList<>();
        for(int i = 0 ; i< n2; ++i)
            q.add(sc.next());
        int count=0,i=0;
        while( i <n2 )
        {
            count=0;
            int j=0;
            while(j<n1)
                {
                    if(q.get(i).equalsIgnoreCase(l.get(j)))
                        count++;
                    j++;
                }
            System.out.println(count);
            i++;
        }
      
    }
}