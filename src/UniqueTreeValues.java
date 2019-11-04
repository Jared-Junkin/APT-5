import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        ArrayList<Integer> temp = new ArrayList<>();
        int [] toReturn = new int[temp.size()];
        for(int k = 0; k < temp.size(); k++){
            toReturn[k] = temp.get(k);
        }
        return toReturn;
    }
}
