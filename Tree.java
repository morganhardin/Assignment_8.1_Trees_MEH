/** These are imported functions in java
 * that call the built in Queue and 
 * LinkedList to create a binary tree.
 * 
 */
import java.util.Queue;
import java.util.LinkedList;

/** This method creates a binary tree,
 * uses depth first search to
 * traverse the tree, and finds the
 * height of the tree.
 * 
 * @originalauthor Nathan Johnson
 * 
 * @editedauthor morganhardin
 *
 */
public class Tree 
{
	/** These variables instantiate height
	 * and numberNodes as integers and
	 * root, node, and currentNode as
	 * Nodes.
	 * 
	 */
	@SuppressWarnings("unused")
	private int height;
	int numberNodes = 0;
	Node root, node, currentNode;

	/** This empty constructor method calls
	 * the setRoot method and and creates
	 * a new Node with the root data value
	 * equal to 1.
	 * 
	 */
	public Tree()
	{
		setRoot(new Node(1));	
	}
	
	/** This getter method returns the
	 * Node root.
	 * 
	 */
	public Node getRoot() 
	{
		return root;
	}
	
	/** This setter method takes
	 * the parameter root of type
	 * Node and sets the parameter
	 * root equal to this root. It 
	 * also sets currentNode equal
	 * to root.
	 * 
	 * @param root
	 */
	public void setRoot(Node root) 
	{
		this.root = root;
		currentNode = root;
	}
	
	/** This getter method returns
	 * the Node currentNode.
	 * 
	 * @return
	 */
	public Node getCurrentNode()
	{
		return currentNode;
	}
	
	/** This setter method takes the
	 * Node parameter currentNode and
	 * sets the currentNode parameter
	 * equal to this currentNode.
	 * 
	 * @param currentNode
	 */
	public void setCurrentNode(Node currentNode)
	{
		this.currentNode = currentNode;
	}
	
	/** This Node generatePracticeTree method
	 * takes an integer parameter height. This
	 * method will generate a tree breadth-first
	 * by putting the nodes in a queue. It also
	 * keeps track of the height and level to
	 * determine what level the tree is on.
	 * It also creates the left child and right
	 * child nodes of the parent node. The tree
	 * continues to be created through the while
	 * loop based on the inputed height.
	 * 
	 */
	public Node generatePracticeTree(int height)
	{
		this.height=height;
		int level=1;
		
		//Creating tree breadth-first so
		//Put the child nodes in a queue
		Queue <Node> childQ=new LinkedList<Node>();
		Node pn=root;
		//Create the children of the root and put some data
		//Put them in the child queue
		//int value=pn.getData();
			
		childQ.add(pn);
		System.out.println ("Root Node value: "+pn.getData());
		int value=pn.getData();
		numberNodes++;
		
		System.out.println("Level: "+level);
		    	
		//Remove the front of the queue
		//Create its children
		//Put them in the queue
		//Data is just parent data+1or 2 depending
		while (level<(height) && !childQ.isEmpty())
		{
			for(int i=1;i<=Math.pow(2,(level-1));i++)
			{
			   	pn=childQ.remove();
				System.out.println("Parent Node value: "+pn.getData());
				value++;
				System.out.println("Adding Left Child: "+(value));
				pn.setlChild(new Node(value));
				childQ.add(pn.getlChild());
				value++;
				numberNodes++;
				System.out.println("Adding Right Child: "+(value));
				pn.setrChild(new Node(value));
				childQ.add(pn.getrChild());
				numberNodes++;
			}
			/*pn=childQ.remove();
					 
			System.out.println("Parent Node value: "+pn.getData());
			value++;
			System.out.println("Adding Left Child: "+(value));
			pn.setlChild(new Node(value));
			childQ.add(pn.getlChild());
			value++;
			System.out.println("Adding Right Child: "+(value));
			pn.setrChild(new Node(value));
			childQ.add(pn.getrChild());
			*/
			level++;
			System.out.println("Level: "+level);
		}
		//finalHeight = maxHeight.size();
		return root;
	}
	
	/** This depth first search method takes
	 * the Node parameter node and traverses
	 * the tree. It first determines if the
	 * node is null and then continues to make
	 * recursive calls in order to get to the
	 * base case. It makes recursive calls on
	 * the left child first and then the right,
	 * continuing until both are null.
	 * 
	 * @param node
	 */
	void DFS(Node node)
	{
		if (node == null)
		{
			return;
		}
		System.out.print(node.data + " ");
		DFS(node.lChild);
		DFS(node.rChild);
	}
	
	/** This height method takes the Node parameter
	 * node and determines if the node is null,
	 * where it would return the height as 0. Then
	 * it will recursively call the function as an
	 * integer for both the left and right children.
	 * It will then call the math class to use
	 * max to determine the maximum height of the 
	 * trees based on the maximum height of the left
	 * compared to the maximum height of the right
	 * plus 1 which would stand for the parent node.
	 * 
	 * @param node
	 * @return
	 */
	int HeightOfTree(Node node)
	{
		if (node == null)
		{
			return 0;
		}
		
		int lChildHeight = HeightOfTree(node.getlChild());
		int rChildHeight = HeightOfTree(node.getrChild());
		return Math.max(lChildHeight, rChildHeight) + 1; 
	}
}
