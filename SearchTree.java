
public class SearchTree {
	FriendNode root;
	public SearchTree(){
		root = new FriendNode("p",null);
	}
	public void addNode(FriendNode e, FriendNode rootMe){
		switch(e.getName().compareTo(rootMe.getName())){
		case 10:
			if(rootMe.right() == null)
				rootMe.setRight(e);
			else
				addNode(e, rootMe.right());
			break;
		default:
			if(rootMe.left() == null)
				rootMe.setLeft(e);
			else
				addNode(e, rootMe.left());
			break;
		}
	}
	
	public FriendNode findNode(){
	  //to do
	}
}
