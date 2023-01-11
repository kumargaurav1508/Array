package PwSkills;

import java.util.Scanner;

public class ArrayproblemSolving {
    // 1 Given 2 integers a and b swap the 2 given values using temporary variables
  /*  static void Swap(int a,int b) {
        System.out.println("original value before Swep");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value after swep");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }*/

   /* public static void main(String[] args) {
        int a = 9;
        int b = 8;
          System.out.println("original value before Swep");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value after swep");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
       // Swap(a,b);
    }*/
    // Given 2 integers a and b swap the 2 given values using sum and different method without using temp;
  /* public static void main(String[] args) {
       int a = 12;
       int b = 2;
       System.out.println("original value before Swep");
       System.out.println("a:" + a);
       System.out.println("b:" + b);
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("value after swap");
       System.out.println("á:" + a);
       System.out.println("b:" + b);
   }
   }*/
    // Reverse an array consisting of integer value.
   /*static void printArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static int []reverseArray(int[]arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i > 0; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[]ans = reverseArray(arr);
       // printArray(ans);
    }
        }*/
    //  Print in Reverse
   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int arr[] = new int[N];
       for(int i = N-1;i>=0;i--) {
           int A = sc.nextInt();
           arr[i] = A;
       }
       for(int i = 0;i<N;i++){
           System.out.print(arr[i]+" ,");
       }
       }
   }*/
    // . Negative Integers;
   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       for(int i = 1;i<= N;i++){
           int A = sc.nextInt();
           if(A<0) {
               System.out.print(A + " ");
           }
           }
       }
   }*/
   /*public int linearSearch(int[] A, int B) {
       for(int i = 1;i<A.length;i++){
           if(A[i]==B){
               return 1;
           }
       }
       return 0;
   }
    public static void main(String[] args) {
    }
}*/
/*static int []rotate(int[]arr,int k){
    int n = arr.length;
    k = k%n;
    int[] ans = new int[n];
    int j = 0;
    for(int i = n-k;i<n;i++) {
        ans[j++] = arr[i];
    }
    for(int i = 0;i<n-k;i++){
        ans[j++] = arr[i];
    }
    return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enetr k: ");
        int k = sc.nextInt();
        System.out.println("original array");
        ArrayproblemSolving(arr);
        int[]ans = rotate(arr,k);
        System.out.println("Array after rotation");
        printArray(ans);
        }

    }
}*/
}






