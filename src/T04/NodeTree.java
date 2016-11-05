/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T04;

/**
 *
 * @author Los Beaters
 */
public class NodeTree <T> {
    //Attributes
    int data;
    //NodeTree dad;
    NodeTree left;
    NodeTree right;        
    //Methods
    //Contructor
    public NodeTree() {
        this.data = data;
        this.left= left;
        this.right = right;
    }
    public NodeTree(int data) {
        this.data = data;
        this.left= left;
        this.right = right;
    }
    public int getData() {
        return data;
    }
    /*public NodeTree getDad() {
        return dad;
    }*/
    public NodeTree getLeft() {
        return left;
    }
    public NodeTree getRight() {
        return right;
    }
    public void setData(int data) {
        this.data = data;
    }
    /*public void setDad(NodeTree dad) {
        this.dad = dad;
    }*/
    public void setLeft(NodeTree left) {
        this.left = left;
    }
    public void setRight(NodeTree right) {
        this.right = right;
    }
}
