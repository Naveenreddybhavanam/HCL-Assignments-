mport java.io.*; 
class ThreadNaming2 extends Thread  
{ 
    public void run() 
    { 
        System.out.println("Thread is running....."); 
    }
} 
  
class TN  
{ 
    public static void main (String[] args)  
    { 
        ThreadNaming t1 = new ThreadNaming(); 
        ThreadNaming t2 = new ThreadNaming(); 
        System.out.println("Thread 1: " + t1.getName()); 
        System.out.println("Thread 2: " + t2.getName());   
        t1.start(); 
        t2.start(); 
        t1.setName("Nani"); 
        t2.setName("Naveen"); 
        System.out.println("Thread names after changing the "+  
        "thread names"); 
        System.out.println("New Thread 1 name:  " + t1.getName()); 
        System.out.println("New Thread 2 name: " + t2.getName()); 
          
    } 
} 
