package a;

import java.util.Scanner;

public class I_12_Ovals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		char[] a=new char[size];
		System.out.print("Insert value into array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.next().charAt(0);
		}
		
		System.out.print("Do you want to print prime nums of array : (Y/N)");
		char ch1=sc.next().charAt(0);
		if(ch1=='Y'||ch1=='y') {
			for(int i=0;i<a.length;i++) {
				if(A_Methods.isOval(a[i])) {
					System.out.print(a[i]+" ");
				}
			}
		}
		sc.close();

	}

}
