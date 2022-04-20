package com.company;

public class LinkedList<T> {

    public static void main(String[] args) {

    }




    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node() {
            data = null;
            next = null;
        }


        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }


    }

    //Linked List Instance Data

    private Node start;


    public LinkedList() {
        start = null;
    }

    public void addFirst(T data) {
        Node newFirst = new Node(data, start);
        start = newFirst;
    }

    public T removeFirst() {
        T temp = (T)start.getData();
        if (start != null) {
            start = start.getNext();
        }
        return temp;
    }

    @Override
    public String toString() {
        String result = "";
        Node temp = start;

        while (temp != null) {
            result += temp.getData().toString() + "\n";
            temp = temp.getNext();
        }

        return result;
    }

    public int size(){
        int c = 0;
        Node temp = start;
        while (temp != null) {
            c++;
        }
        return c;
    }

    public void addLast (T data) {
        Node newLast = new Node(data, null);
        Node temp = start;

        if(temp != null) {
            while (temp.getNext() != null)
                temp = temp.getNext();
                //temp is now at null
            temp.setNext(newLast);
        }
        else
            start = newLast;

    }

    public boolean isEmpty () {
        return start==null;
    }

    public T removeLast () {
        Node temp = start;
        T tempT = null;

        if (temp != null && temp.getNext() != null) {
            while(temp.getNext().getNext() != null)
                temp = temp.getNext();
            //temp.next.next is now null
            temp.setNext(null);
            tempT = (T)temp.getData();
            
        }

        return tempT;
    }


}
