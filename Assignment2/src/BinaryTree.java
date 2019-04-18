//Arman Uddin
//CSC 221 Section P
//Assignment 2

public final class BinaryTree 
{
	private BinaryNode root;
	private int depth;
	private int upProb;
	
	public BinaryTree()
	{
		root = new BinaryNode();
		depth = 0;
		upProb = 50;
		createTree(root,0);
	}
	public BinaryTree(int initD)
	{
		root = new BinaryNode();
		depth = initD;
		upProb = 50;
		createTree(root,0);
	}
	public BinaryTree(int initD,int initP)
	{
		root = new BinaryNode();
		depth = initD;
		
		if(initP >= 0 && initP <= 100)
			upProb = initP;
		else
			upProb = 50;
		
		createTree(root,0);
	}

	private void createTree(BinaryNode rootNode,int levels)
	{
		if(levels != depth)
		{
			levels++;
			
			BinaryNode nTop = new BinaryNode(levels);
			nTop.setParent(rootNode);
			rootNode.setTop(nTop);
			createTree(nTop,levels);
			
			BinaryNode nBottom = new BinaryNode(levels);
			nBottom.setParent(rootNode);
			rootNode.setBottom(nBottom);
			createTree(nBottom,levels);
		}
	}
	
	public BinaryNode getRoot()
	{
		return root;
	}
	public int getDepth()
	{
		return depth;
	}
	public int getProb()
	{
		return upProb;
	}
}
