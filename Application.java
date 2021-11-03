/** This application class has a main method
 * that creates a new instance of the Tree 
 * class and uses those methods to generate
 * a tree, traverse it, find the number of nodes,
 * and find the height of the tree.
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	/** This main method calls the methods in the
	 * instantiated tree class that prints the
	 * tree, the traversed nodes, the number
	 * of nodes, and the height of the tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Tree tree = new Tree();
		System.out.println("Practice Tree: ");
		tree.generatePracticeTree(3);
		System.out.print("\nTraversed Tree: ");
		tree.DFS(tree.root);
		System.out.println("\nNodes Traversed in Tree: " + tree.numberNodes);
		System.out.println("Height of Tree: " + tree.HeightOfTree(tree.root));
	}
}
