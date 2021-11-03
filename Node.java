/** This Node class creates a root,
 * lChild, and rChild Node that will
 * be used and kept track of to 
 * create and traverse a binary tree.
 * 
 * @originalauthor Nathan Johnson
 * 
 * @editedauthor morganhardin
 *
 */
public class Node 
{
	/** These package variables are 
	 * initialized here. Data is an
	 * integer while lChild and
	 * rChild are Nodes.
	 * 
	 */
	int data;
	Node lChild;
	Node rChild;
	
	/** This empty constructor method
	 * takes an integer parameter
	 * data. It sets lChild and rChild
	 * equal to null and this data equal
	 * to the inputed parameter data.
	 * 
	 * @param data
	 */
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}
	
	/** This getter method returns
	 * the integer data.
	 * 
	 * @return
	 */
	public int getData() 
	{
		return data;
	}
	
	/** This setter method takes an
	 * integer data as a parameter
	 * and sets the parameter equal to
	 * this data.
	 * 
	 * @param data
	 */
	public void setData(int data) 
	{
		this.data = data;
	}
	
	/** This getter method returns
	 * the Node lChild.
	 * 
	 * @return
	 */
	public Node getlChild() 
	{
		return lChild;
	}
	
	/** This setter method takes the
	 * parameter lChild and sets that
	 * parameter equal to this lChild.
	 * 
	 * @param lChild
	 */
	public void setlChild(Node lChild) 
	{
		this.lChild = lChild;
	}
	
	/** This getter method returns
	 * the Node rChild.
	 * 
	 * @return
	 */
	public Node getrChild() 
	{
		return rChild;
	}
	
	/** This setter method takes the
	 * Node paramters rChild and sets
	 * that parameter equal to this
	 * rChild.
	 * 
	 */
	public void setrChild(Node rChild) 
	{
		this.rChild = rChild;
	}
	
}
