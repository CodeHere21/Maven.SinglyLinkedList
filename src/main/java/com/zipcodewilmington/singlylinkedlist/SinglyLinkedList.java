package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node headNode;
    Node tailNode;
    Integer size=0;


    public void add(Node newNode){
        if(headNode == null){
            headNode=newNode;
            tailNode=headNode;
        } else {
            tailNode.setNextNode(newNode);
            tailNode = headNode.getNextNode();
        }
        size++;
    }

    public void remove(Integer index){
        Node currentNode = headNode;
        Node nextNode = tailNode;
        if(!(currentNode.getNextNode() == null)){
            for (int i=1; i<index-1;i++){
                nextNode = currentNode;
                currentNode=currentNode.getNextNode();
            }
            if(currentNode.getNextNode()==null){
                tailNode=nextNode;
                size--;
            } else {
                nextNode.setNextNode(currentNode.getNextNode());
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                size--;
            }
        }

    }

    public boolean contains(Node elementNode){
        Node currentNode = new Node();
        for(int i=0; i<this.size;i++) {

            if (currentNode.getDataStored().equals(elementNode.getDataStored()))
                return true;
            else {
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    public Node find(){}

    public Integer size(){
        return size;
    }

    public void get(){}

    public void copy(){}

    public void sort(){}
}
