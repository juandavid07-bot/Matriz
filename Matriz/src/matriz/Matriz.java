/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String matriz[][] = new String [10][5]; 
       
        Menu(matriz);
      
        Mostrar(matriz);
        
        
          
    }
    static void Menu (String m[][])
    {
        
         for (int x=0; x < m.length; x++) {
           System.out.print("|");
            for (int y=0; y < m[x].length; y++) {
                System.out.print (m[x][y]="O");
                  if (y!=m[x].length-1) System.out.print("\t");
                 }
                    System.out.println("|");
           }           
    }
   
      static void Mostrar (String m[][])
    {  
        for(int p = 0; p<5 ; p++){
        Scanner reader = new Scanner(System.in);
         int val;
         int v1=0,v2=0;
         boolean t=false;
       System.out.print ("ingrese un valor de 1-50 solo tienes 5 oportunidades: \n");
        val = reader.nextInt();
        val=val-1;
        int v = 0,cont=0;
        for (int x=0; x < m.length; x++) {
          // System.out.print("|");
            for (int y=0; y < m[x].length; y++) {
                 
                 if(cont==val){
                     if(m[x][y]!="X"){
                       
                         v1 = x;
                         v2=y;
                     }else
                     {
                        System.out.print ("Este campo ya esta ocupado escoge otro valor \n");
                        t = true;
                        
                     }
                      
                  }else{
                 
                 }
                cont++;
                  if (y!=m[x].length-1) System.out.print("");
                 
                  
                 }
                   
           }  
        if(t==false)
        {
           comoletar(m,v1,v2); 
        }
        
        }
    }
     static void comoletar(String m[][], int v1,int v2){
         System.out.print ("----------------------------------\n");
            for (int x=0; x < m.length; x++) {
           System.out.print("|");
         
            for (int y=0; y < m[x].length; y++) {
                 
                 if(y == v2 || x == v1){
                     if(m[x][y]!="X"){
                         System.out.print (m[x][y]="X");
                         
                     }else 
                     {
                       System.out.print (m[x][y]);
                     }
                      
                  }else{
                     System.out.print (m[x][y]);
                 }
                
                  if (y!=m[x].length-1) System.out.print("\t");
                 
                  
                 }
                    System.out.println("|");
           }
          
      }
    
}
