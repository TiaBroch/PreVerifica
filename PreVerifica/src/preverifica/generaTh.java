/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preverifica;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author broch_mattia
 */
public class generaTh {
    
    private String valoriPossibili="abcdefghijklmnopqrstuwxyz1234567890 .";
    private DatiCondivisi d;
    private char[] v;
    
    public generaTh(DatiCondivisi d){
        this.d=d;
        v=new char[10];
    }
    
    public char[] getList(){
        return v;
    }
    
    public void run(){
        
        Random rn=new Random();
        for(int i=0;i<10;i++){
        int n=rn.nextInt(valoriPossibili.length());
        v[i]=valoriPossibili.charAt(n);
        }
        
    }
    
    
    
}
