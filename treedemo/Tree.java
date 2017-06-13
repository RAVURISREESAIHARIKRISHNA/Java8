package treedemo;

public class Tree
{
	Node node;
	Node root;

	public Tree ()
	{
		root = null;

	}

	public void insert(int value)
	{
		Node newNode = new Node ();
		newNode.left = null;
		newNode.right = null;
		newNode.value = value;
		if (root == null)
		{
			root = newNode;
		}
		else
		{
			Node current = root;
			Node parent;
			while (true)
			{
				parent = current;
				if (value < current.value)
				{
					// GO left
					current = current.left;
					if (current == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else
				{
					// Go right
					current = current.right;
					if (current == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}

		}
	}

	public boolean search(int value)
	{
		Node searchparent = null;
		Node current = root;
		if (current == null)
		{
			return false;
		}

		while (true)
		{
			searchparent = current;
			if (value == current.value)
			{
				return true;
			}
			if (value < current.value)
			{// Go Left
				current = current.left;
				if (current == null)
				{
					return false;
				}
			}
			else
				if (value > current.value)
				{
					current = current.right;
					if (current == null)
					{
						return false;
					}
				}
		}
	}

	private void inorder(Node indummy)
	{
		if (indummy != null)
		{
			inorder ( indummy.left );
			System.out.print ( indummy.value + " " );
			inorder ( indummy.right );
		}
	}

	private void preorder(Node predummy)
	{
		if (predummy != null)
		{
			System.out.print ( predummy.value + " " );
			preorder ( predummy.left );
			preorder ( predummy.right );

		}
	}

	private void postorder(Node postdummy)
	{
		if (postdummy != null)
		{
			postorder ( postdummy.left );
			postorder ( postdummy.right );
			System.out.print ( postdummy.value + " " );
		}
	}

	public void postorderDisplay()
	{
		System.out.println ( "" );
		this.postorder ( this.root );
		System.out.println ( "" );
	}

	public void preorderDisplay()
	{
		System.out.println ( "" );
		this.preorder ( this.root );
		System.out.println ( "" );
	}

	public void inorderDisplay()
	{
		System.out.println ( "" );
		this.inorder ( this.root );
		System.out.println ( "" );
	}
	
	public void delete(int value){
		Node speci;
		Node parent;
		parent = root;
		//Searching
		
		if(root == null){
			System.out.println ( "The tree is empty" );
			return;
		}
		if(value >parent.value && parent.right != null)
		{
			speci = parent.right;
			while(speci != null && value != speci.value)
			{
				parent = speci;
				if(value < speci.value)
				{
					speci = speci.left;
				}
				else
				{
					speci = speci.right;
				}
			}
			if(speci == null)
			{
				System.out.println ( "The Value not found" );
				return;
			}
			
		}
		else if(value < parent.value && parent.left != null)
		{
			speci = parent.left;
			while(speci != null && value!=speci.value)
			{
				parent = speci;
				if(value < speci.value)
				{
					speci = speci.left;
				}
				else
				{
					speci = speci.right;
				}
			}
			if(speci == null)
			{
				System.out.println ( "The Value not found" );
				return;
			}
		}
		@SupressWarnings
		if(speci.left==null && speci.right==null)
		{
			speci = null;
			return;
		}
		if(speci.left==null && speci.right!=null)
		{
			
		}
		
		
	}
}

class Node
{
	protected int value;
	Node left;
	Node right;
}