//Arman Uddin
//CSC 221 Section P
//Assignment 2

public class BinaryNode 
{
	private int data;
	private BinaryNode parent;
	private BinaryNode top;
	private BinaryNode bottom;
	
	public BinaryNode()
	{
		data = 0;
		parent = null;
		top = null;
		bottom = null;
	}
	public BinaryNode(BinaryNode initT)
	{
		data = 0;
		parent = null;
		top = initT;
		bottom = null;
	}
	public BinaryNode(BinaryNode initT, BinaryNode initB)
	{
		data = 0;
		parent = null;
		top = initT;
		bottom = initB;
	}
	public BinaryNode(BinaryNode initT, BinaryNode initB, BinaryNode initP)
	{
		data = 0;
		parent = initP;
		top = initT;
		bottom = initB;
	}
	
	public BinaryNode(int initData)
	{
		data = initData;
		parent = null;
		top = null;
		bottom = null;
	}
	public BinaryNode(int initData, BinaryNode initT)
	{
		data = initData;
		parent = null;
		top = initT;
		bottom = null;
	}
	public BinaryNode(int initData, BinaryNode initT, BinaryNode initB)
	{
		data = initData;
		parent = null;
		top = initT;
		bottom = initB;
	}
	public BinaryNode(int initData, BinaryNode initT, BinaryNode initB, BinaryNode initP)
	{
		data = initData;
		parent = initP;
		top = initT;
		bottom = initB;
	}

	public int getData()
	{
		return data;
	}
	public BinaryNode getParent()
	{
		return parent;
	}
	public BinaryNode getTop()
	{
		return top;
	}
	public BinaryNode getBottom()
	{
		return bottom;
	}

	public void setData(int nData)
	{
		data = nData;
	}
	public void setParent(BinaryNode nParent)
	{
		parent = nParent;
	}
	public void setTop(BinaryNode nTop)
	{
		top = nTop;
	}
	public void setBottom(BinaryNode nBottom)
	{
		bottom = nBottom;
	}
}
