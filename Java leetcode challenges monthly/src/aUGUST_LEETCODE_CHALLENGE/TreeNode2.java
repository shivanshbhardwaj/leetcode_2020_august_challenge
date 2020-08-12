package aUGUST_LEETCODE_CHALLENGE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class  TreeNode2 {
	
}

class Answer {
    List<Loc> locations=null;
    public List<List<Integer>> vTravsal(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        locations=new ArrayList<>();
        dfs(root,0,0);
        Collections.sort(locations);
        int x=locations.get(0).x;
        result.add(new ArrayList<>());
        
        for(Loc l: locations){
            if(x!=l.x){
                x=l.x;
                result.add(new ArrayList<>());
            }
            result.get(result.size()-1).add(l.val);
        }
        return result;
    }
    
    private void dfs(TreeNode root,int x,int y){
        if(root!=null){
            locations.add(new Loc(x,y,root.val));
            dfs(root.left,x-1,y-1);
            dfs(root.right,x+1,y-1);
        }
    }
    
    class Loc implements Comparable<Loc>{
        int x,y,val;
        
        Loc(int x,int y,int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
        
        @Override
        public int compareTo(Loc l){
            if(this.x!=l.x){
            return Integer.compare(this.x,l.x);
            }
            if(this.y!=l.y){
                return Integer.compare(l.y, this.y);
            }
            else {
                return Integer.compare(this.val,l.val);
            }
        }
    }
}

