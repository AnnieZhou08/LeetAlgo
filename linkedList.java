/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Annie Zhou
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Slist lst = new Slist();
        lst.addEnd("1");
        lst.addEnd("2");
        lst.addEnd("3");
        lst.addEnd("4");
        lst.addEnd("5");
        
        lst.insert(new Node("6"), "1");
        
        System.out.println(lst.findprevious("1").toString());
        System.out.println("hello");
        System.out.println(lst.toString());
    }
    
}

class Node {
    
    protected String data;
    protected Node next;
    
    //constructor
    public Node (String data){
        this.data = data;
        this.next = null;
    }
    
    public String toString (){
        return this.data;
    }
  
}

class Slist{
    
    protected Node list;
    
    public Slist (){
        this.list = null;
    }
    
    // Methods:
/*      isEmpty - checks if the list is empty
	addEnd - adds node to end of list (added method)
	toString - converts the data to a string
	clone - clones the node
	find - find the node before the node containing a given string value (some exceptions apply)
	insert - inserts node with a string before the node with a given string (some exceptions apply)
	delete - deletes (if possible) a node with a given string value and returns true if deleted successfully
	printOdd - prints the odd nodes in the list
	selfOrganizingSearch - puts the node in the beginning of list if found
	concatenate - attaches another given list to the end of this current list and returns it
	exchange - exchanges two nodes
	lastNode - returns the last node in the list
	reverse - reverses the list

*/
    
    public boolean isEmpty(){
        return this.list == null;
    }
    
    public void addEnd(String input){
        Node newnode = new Node (input);
        Node tempnode;
        
        if (this.list == null){
            this.list = newnode;
        }
        else{
            tempnode = this.list;
            while (tempnode.next!= null){
                tempnode = tempnode.next;
            }
            tempnode.next = newnode;
        }
    }
    
   public String toString (){
       String s = "";
       Node tempnode = this.list;
       
       if (this.list == null){
           s = "Empty";
       }
       while (tempnode != null){
           s += "" + tempnode.data + " ";
           tempnode = tempnode.next;
       }
       return s;
   }
   
   //returns the node before the node containing given string value
   public Node findprevious (String input){
       Node tempnode = this.list;
       
       if (this.list == null){
           return tempnode;
       }
       else{
           if (tempnode.data.equals(input)){
               return new Node ("error");
           }
           while (tempnode.next != null){
               if (!tempnode.next.data.equals(input)){
                   tempnode = tempnode.next;
               }
               else {
                return tempnode;
               }
           }
           return tempnode;
           
       }
   }
   //insert - inserts node with a string before the node with a given string (some exceptions apply)
   public void insert (Node node, String input){
       Node newnode = node;
       Node tempnode = this.list;
       
       if (tempnode == null){
           tempnode = newnode;
       }
       if (tempnode.data.equals(input)){
           newnode.next = tempnode;
           this.list = newnode;
       }
       else{
           boolean found = false;
           
           while (tempnode.next != null && found == false){
               if (tempnode.next.data.equals(input)){
                   newnode.next = tempnode.next;
                   tempnode.next = newnode;
                   found = true;
               }
               else{
                   tempnode = tempnode.next;
               }
           }
           if (found == false) {
            tempnode.next = newnode;
            newnode.next = null;
           }
       }
   }
   
   
}
