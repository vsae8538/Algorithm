package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test {
	public static int Maxdepth;

    public static int maxDepth(Node root) {
    	if(root == null)
    		return 0;
    	else{
    		Maxdepth = 1;
    		childNodeSearch(root, 1);
    	}
    	return Maxdepth;
    }
    public static int childNodeSearch(Node node,int depth) {
    	//System.out.println(depth);
        if(node.children.isEmpty()){
        	return depth;
        }else {
        	depth++;	
        }
        for (Node cnode : node.children){
			childNodeSearch(cnode, depth);
		}
        if(Maxdepth < depth) {
        	Maxdepth = depth;
        }
        return depth;
    }
	public static void main(String[] args) {

	}
}
