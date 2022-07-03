/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sliman
 */
public class Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int expectedSum=in.nextInt();
       
        
        Map<Integer,Integer>M=new HashMap<>();
        int L=-1,R=-1;

        for(int i=0;i<n;i++){
            int x=in.nextInt();

            if(M.containsKey(expectedSum-x) && L==-1){
                L=M.get(expectedSum-x)+1;
                R=i+1;
            }
            if(!M.containsKey(x))M.put(x,i);

        }
        
        System.out.println(L + " " + R);
    }
    
}
