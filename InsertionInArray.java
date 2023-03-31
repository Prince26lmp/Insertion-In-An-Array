package JavaDSA;

import java.util.Scanner;

public class InsertionInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Size Of Array :");
        int n= sc.nextInt();
        int arr1[]= new int[n];
        int arr2[]= new int[n+1];
        System.out.println("Enter The Elements Of Array :");
        for(int i=0;i<n;i++)
        {
           arr1[i]=sc.nextInt();
        }
        
        System.out.println("Array Before Insertion Are :");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr1[i]);
        }
        
        
        System.out.println("Enter The Index Of New Value To Be Inserted:");
        int index=sc.nextInt();
        
        System.out.println("Enter The Value To Be Inserted At " +index);
        int value=sc.nextInt();
        
        for(int i=0;i<n+1;i++)
        {
        	if(i<index)
        	{
        		arr2[i]=arr1[i];
        	}
        	else if(i==index)
        	{
        		arr2[i]=value;
        	}
        	else
        	{
        		arr2[i]=arr1[i-1];
        	}
        }
        
        System.out.println("New Array After Insertion:");
        for(int i=0;i<n+1;i++)
        {
           System.out.println(arr2[i]);
        }
        

	}

}
