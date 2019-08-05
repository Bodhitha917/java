/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bodhita
 */
public class arr3 {
    public static void main(String[]args){
        int bodh[]={1,2,3,4,5,6};
        change(bodh);
        for( int y:bodh)
            System.out.println(y);
    }
    public static void change(int x[]){
        for(int counter=0;counter<x.length;counter++)
            x[counter]+=5;
            
    }
}
