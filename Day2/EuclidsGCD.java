package Day2;

import java.util.Scanner;

class EuclidsGCD {
    static int findEuclidsGCD(int n1,int n2){  
        while(n1 != n2){
        if(n1>n2){
            n1=n1-n2;
        }else{
            n2=n2-n1;
        }
    }
    return n1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the first number :");
            int a = sc.nextInt();
           System.out.print("enter the second number :");
           int b = sc.nextInt();
           System.out.println("the gdc is" + findEuclidsGCD(a,b)); 

        }
    }
}


// let a and b
// 10 20
// find min
// subtract (max-min)
// repeat the process until a and b become 
// and return a or b