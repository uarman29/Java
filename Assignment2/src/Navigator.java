//Arman Uddin
//CSC 221 Section P
//Assignment 2

public class Navigator 
{
	private BinaryTree source;
	private BinaryNode currentNode;
	private int iterations;
	private int currentTime;
	
	public Navigator(int N)
	{
		iterations = N;
		source = new BinaryTree();
		currentNode = source.getRoot();
		currentTime = 0;
	}
	public Navigator(BinaryTree tree,int N)
	{
		iterations = N;
		source = tree;
		currentNode = source.getRoot();
		currentTime = 0;
	}
	
	public void traverse()
	{
		int rNum;
		int prob = source.getProb();
		while(currentTime != iterations && currentTime < source.getDepth())
		{
			rNum = getRandomInteger(0,100);
			currentTime++;
			if(rNum<prob)
			{
				currentNode = currentNode.getTop();
				System.out.println("Time Period is: "+ currentTime +" | Random Value is: "+ rNum +" | Movement is: UP");
			}
			else
			{
				currentNode = currentNode.getBottom();
				System.out.println("Time Period is: "+ currentTime +" | Random Value is: "+ rNum +" | Movement is: DOWN");

			}
		}
	}
	
	private int getRandomInteger(int low, int high)
	{
		return (int)(Math.random()*(high-low)+1)+low;
	}
}
