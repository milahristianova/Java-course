import java.util.ArrayList;
import java.util.List;



public class Tree<T> {
List<Tree> children = new ArrayList<Tree>();
Tree<T> parent = null;
Tree<T> data = null;

public Tree(Tree<T> tree){
	this.data = tree;
}
public Tree(Tree<T> data,Tree<T> parent){
	this.data = data; 
	this.parent = parent;
}
public Tree(String string) {
	// TODO Auto-generated constructor stub
}
public Tree(String string, Tree<String> parentTree) {
	// TODO Auto-generated constructor stub
}
public List<Tree> getChildren(){
	return children;
}
public void setParent(Tree<T> parent){
	parent.addChild(this);
	this.parent = parent;
}
public void addChild(Tree<T> tree){
	Tree<T> child = new Tree<T>(tree);
	child.setParent(this);
	this.children.add(child);
}
public Tree<T> getData(){
	return this.data;
}
public void setData(Tree<T> data){
	this.data = data;
}
public boolean isRoot(){
	return(this.parent == null);
}
public boolean isLeaf(){
	if(this.children.size() == 0)
		return true;
	else
		return false;
}
public void removeParent(){
	this.parent = null;
}

}

