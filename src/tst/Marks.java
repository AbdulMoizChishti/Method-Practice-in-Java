/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class Marks {
    int total; int avg; int maths;int phy;int chem; 
    public void Av(int maths,int phy,int chem){

        this.maths=maths;
        this.phy=phy;
        this.chem=chem;
    }
public void setmarks(){
 total=maths+phy+chem;
    System.out.println("Total Marks= "+total);
 avg=(total/3);
    System.out.println("Average= "+avg);
}




}
    
    

