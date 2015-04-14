package data;

import java.util.Scanner;

public class Array {
	private int n; // tong so phan tu cua mang
	private int[] a; // mang luu gia tri
	Scanner in = new Scanner(System.in);
	public Array(){
		this.n = 0;
		this.a = null;
	}
	
	public void create(){
		System.out.println("Enter index of array: ");
		this.n = in.nextInt();
		for(int i=0; i<n; i++){
			System.out.print("Enter a[" + (i + 1) + "]: ");
			a[i] = in.nextInt();
		}
	}
	
	public void show(){
		for(int i=0; i<this.n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
