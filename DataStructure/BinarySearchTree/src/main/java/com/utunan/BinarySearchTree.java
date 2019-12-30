package com.utunan;

import java.util.ArrayList;

public class BinarySearchTree {
    private TreeNode<Integer> root;

    public BinarySearchTree() {
        this.root = null;
    }
    
    private TreeNode<Integer> getRoot() {
        return root;
    }

    private void setRoot(TreeNode<Integer> root) {
        this.root = root;
    }

    //添加树节点
    public boolean addNode(TreeNode<Integer> node) {

        if (root == null) {
            root = node;
            return true;
        }

        TreeNode<Integer> cursor = this.getRoot();

        while (cursor != null) {
            if (node.compareTo(cursor) == 0) {
                return false;
            } else if (node.compareTo(cursor) == -1) {
                if (cursor.getLeft() == null) {
                    cursor.setLeft(node);
                    return true;
                }
                cursor = cursor.getLeft();
            } else {
                if (cursor.getRight() == null) {
                    cursor.setRight(node);
                    return true;
                }
                cursor = cursor.getRight();
            }
        }
        return true;
    }

    //添加树节点
    public boolean addNode(Integer data) {
        return addNode(new TreeNode<>(data));
    }

    //删除树节点
    public boolean removeNode(TreeNode<Integer> node) {

        TreeNode<Integer> cursor = this.getRoot();
        TreeNode<Integer> parent = cursor;
        int state = 0;

        if (cursor == null) {
            return false;
        }

        while (cursor != null) {
            if (node.compareTo(cursor) == 0) {
                if (cursor.getRight() == null && cursor.getLeft() == null) {
                    if (state == 0) {
                        this.setRoot(null);
                    } else if (state == 1) {
                        parent.setRight(null);
                    } else {
                        parent.setLeft(null);
                    }
                } else if (cursor.getLeft() != null && cursor.getRight() == null) {
                    if (state == 0) {
                        this.setRoot(root.getLeft());
                    } else if (state == 1) {

                    } else {
                    }
                } else if (cursor.getLeft() == null && cursor.getRight() != null) {
                    if (state == 0) {
                        this.setRoot(root.getRight());
                    } else if (state == 1) {

                    } else {
                    }
                } else {
                    if (state == 0) {

                    } else if (state == 1) {
                        parent.setRight(null);
                    } else {
                        parent.setLeft(null);
                    }
                }
                return true;
            } else if (node.compareTo(cursor) == -1) {
                parent = cursor;
                cursor = cursor.getLeft();
                state = -1;
            } else {
                parent = cursor;
                cursor = cursor.getRight();
                state = 1;
            }
        }

        return false;
    }

    //删除树节点
    public boolean removeNode(Integer data) {

        TreeNode<Integer> node = new TreeNode<>(data);

        return removeNode(node);
    }

    //先序遍历 (对外)
    public ArrayList<Integer> preorderTraversal() {
        ArrayList<Integer> datas = new ArrayList<>();
        preorder(datas, this.getRoot());
        return datas;
    }

    //先序遍历 (对内)
    private void preorder(ArrayList<Integer> datas, TreeNode<Integer> parent) {
        if (parent == null) {
            return;
        }
        datas.add(parent.getData());
        preorder(datas, parent.getLeft());
        preorder(datas, parent.getRight());
    }

    //中序遍历 (对外)
    public ArrayList<Integer> inorderTraversal() {
        ArrayList<Integer> datas = new ArrayList<>();
        inorder(datas, this.getRoot());
        return datas;
    }

    //中序遍历 (对内)
    private void inorder(ArrayList<Integer> datas, TreeNode<Integer> parent) {
        if (parent == null) {
            return;
        }
        inorder(datas, parent.getLeft());
        datas.add(parent.getData());
        inorder(datas, parent.getRight());
    }

    //后序遍历 (对外)
    public ArrayList<Integer> postorderTraversal() {
        ArrayList<Integer> datas = new ArrayList<>();
        postorder(datas, this.getRoot());
        return datas;
    }

    //后序遍历 (对内)
    private void postorder(ArrayList<Integer> datas, TreeNode<Integer> parent) {
        if (parent == null) {
            return;
        }
        postorder(datas, parent.getLeft());
        postorder(datas, parent.getRight());
        datas.add(parent.getData());
    }

}
