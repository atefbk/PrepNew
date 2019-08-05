package org.atef.prepnew;

class Node { 

    Node left, right; 
    
    int value; 

    public Node find(int v) { 
    Node current = this; 
    while (current != null) { 
     if (current.value == v) return current;  
     current = (v < current.value) ? current.left : current.right; 
    } 
    return null; 
} 

} 