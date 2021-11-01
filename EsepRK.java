package esep.rk;
import java.util.Scanner;
public class EsepRK {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Birinshi sandy engiz: ");
        int a = s.nextInt();
        System.out.print(" Ekinshi sandy engiz: ");
        int b = s.nextInt();
        
        System.out.print(" Eki sannyn EUOB: ");
       System.out.println(funk(a,b));
       System.out.print(" Eki sannyn EKOE: ");
       System.out.println(funk1(a,b));
    }
    
    static int funk(int a,int b){ 
     while(a != b){
         if( a > b){
             a = a - b;       
            }
         else{ b = b - a;
         }
     }  
        return a;
    }
        static int funk1(int a, int b){
            if(a==b || a%b==0){
                return a;         
            }
            else{
                if(b%a==0) return b;

            }
            return (a*b)/funk(a,b);
        }   
}

