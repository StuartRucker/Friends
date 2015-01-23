//Add the friendNode class
//Oscar, I think you have the best one, so just get rid of my filler one



import java.util.LinkedList;


public class FriendNode {
	LinkedList<FriendNode> friends;
	String name;
	String place;
	FriendNode left;
	FriendNode right;
	public FriendNode left() {
		return left;
	}
	public void setLeft(FriendNode left) {
		this.left = left;
	}
	public FriendNode right() {
		return right;
	}
	public void Setreight(FriendNode right) {
		this.right = right;
	}
	
	public FriendNode(String name, String place){
		this.name = name;
		this.place = place;
		friends = new LinkedList<FriendNode>();
		
	}
	public void addFriend(FriendNode newFriend){
		friends.add(newFriend);
	}
	public String getName(){
		return name;
	}
	public void remove(String name){
		for(FriendNode e: friends){
			if(e.getName().equals(name)){
				friends.remove();
				return;
			}
		}
	}
	public void remove(FriendNode e){
		friends.remove(e);
	}
	public String getPlace(){
		return place;
	}
	public String toString(){
		return name +"[" + place + "]";
	}
	
}
