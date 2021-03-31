package com.zipcodewilmington.singlylinkedlist;

public class Node {

    Integer dataStored;
    Node nextNode;

    public Integer getDataStored() {
        return dataStored;
    }

    public void setDataStored(Integer dataStored) {
        this.dataStored = dataStored;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
