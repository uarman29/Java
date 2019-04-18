//Arman Uddin
//CSC 221 Section P
//Assignment 2
import java.util.Scanner;

public class TreeTester 
{
	public static void main(String[] args)
	{
		/*
		 * BinaryTree testTree = new BinaryTree(10,50); Navigator navi = new
		 * Navigator(testTree,100); navi.traverse();
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the depth of the tree: ");
		int depth = input.nextInt();
		System.out.print("Please input the probability of going up (0-100): ");
		int prob = input.nextInt();
		System.out.print("Please input the number of iterations to travel: ");
		int N = input.nextInt();
		input.close();
		
		BinaryTree userTree = new BinaryTree(depth,prob);
		Navigator navigate = new Navigator(userTree,N);
		navigate.traverse();
	}
}
