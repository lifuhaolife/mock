package com.lfh.mock.ac.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
    Map<String, Integer> subTrees = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<>();

    /**
     * 找出相同的子串、 使用序列化的方式找到是否存在相同的字符串
     *
     * @param root
     * @return
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        serialize(root);
        return res;
    }

    private String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = serialize(root.left);
        String right = serialize(root.right);

        String myself = left + "," + right + "," + root.val;

        int freq = subTrees.getOrDefault(myself, 0);

        if (freq == 1) {
            res.add(root);
        }
        subTrees.put(myself, freq + 1);
        return myself;

    }
}
