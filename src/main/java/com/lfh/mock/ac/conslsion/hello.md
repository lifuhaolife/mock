
```java 
public void backtrack(int[] nums) {
	for(int i = 0; i < nums.length; i ++ ) {
		backtrack(nums);
	}
}
```

二叉树的多种遍历方式：

	使用递归方式、分解子问题、使用迭代借助栈空间使用

前中后序遍历
后序遍历特殊之处：
多叉树没有中序遍历。

基本的数组、链表、不同的迭代、递归遍历方式：
```java
void traverse(int[] nums) {
    for(int i =0; i < nums.length; i ++) {
    }
}
```
数组的递归遍历
```java
void traverse(int[] nums, int i ) {
    if( i == nums.length) {
        return;
    }
    traverse(nums, i + 1);
}
```
链表迭代遍历
```java
void traverse(ListNode head) {

        for(ListNode p = head; p != null; p = p.next) {

        }
        }
```
链表递归遍历
```java
void traverse(ListNode head) {
        if( head == null) {
        retrun;
        }
        traverse(head.next);
        }
```

二叉树的递归：
````java
void traverse(TreeNode root) {
    if( root == null) {
        return;
    }
    //前序
    traverse(root.left);
    //中序
    traverse(root.right);
    // 后序
}

````


二叉树的层序遍历：

```java
public void traverse（TreeNode root）{
    if( root == null) {
        return;
        }
    Deque<Integer> queue = new LinkedList<>();
    queue.offer(root)
	while(!queue.isEmpty()) {
        for(int i =0 ;i < queue.size(); i++) {
        TreeNode node = queue.poll() ;
        if(node.left != null ){
        queue.offer(node.left);
        }
        if(node.right != null ){
        queue.offer(node.right);
        }
        }
	}
}


```
链表的遍历类似与二叉树的遍历、那么使用了前序遍历、后序遍历的方式得到不同的顺序
**注意** 可以在这个时机执行你想要的操作。

### 二叉树的三种遍历方式
> 前序遍历：是在进入二叉树节点之前的一个执行

> 后序遍历： 离开二叉树节点的时候执行

> 中序遍历： 在完成二叉树节点的左子树 后、进入右子树之前执行

思考一下这个过程 我们经历了二叉树节点从从左节点进入栈、中间节点进入栈、右节点进入栈
二叉树的所有问题，就是让你在前中后序位置注入巧妙的代码逻辑，去达到自己的目的，
你只需要单独思考每一个节点应该做什么，其他的不用你管，抛给二叉树遍历框架，递归会在所有节点上做相同的操作。

计算二叉树的最大深度：
1. 使用递归的方式进行
```java
int res = 0;
int depth = 0;
int maxDepth(TreeNode root) {
    traverse(root);
    return res;
}

void traverse(TreeNode root) {
    if( root == null) {
    return;
    }
    depth++;
    /**
     *  root == null 的时候判断无返回值
     */
    if(root.left == null && root.right = null) {
        res = Math.max(depth, res);
    }
    traverse(root.left);
    traverse(root.right);
    depth--;
}

```
2. 使用分解子问题的方式
```java
int maxDepth(TreeNode root) {
    
    if( root == null) {
        retrun;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
}
```
二叉树的前序遍历结果保存；
函数签名如是：`List<Integer> preorderTraverse(TreeNode root) {`

如何进行迭代遍历
借助外部变量保存
综上，遇到一道二叉树的题目时的通用思考过程是：

1、是否可以通过遍历一遍二叉树得到答案？如果可以，用一个 traverse 函数配合外部变量来实现。

2、是否可以定义一个递归函数，通过子问题（子树）的答案推导出原问题的答案？如果可以，写出这个递归函数的定义，并充分利用这个函数的返回值。

3、无论使用哪一种思维模式，你都要明白二叉树的每一个节点需要做什么，需要在什么时候（前中后序）做。

二叉树的遍历方式：

DFS BFS 回溯、 动态规划之间的区别。
二叉树的前序遍历。
DFS 二叉树的深度遍历 关注走到每一个节点进行对应的操作；
BFS 横向:二叉树的层序遍历



