import java.util.Stack;
class Dcoder
 {
   public static void main(String args[])
   { 
     Stack<Integer> stack = new Stack<>();
     stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     stack.push(50);
     System.out.println(stack);
     System.out.println("Elemen teratas : " + stack.peek());
     stack.pop();
     System.out.println("Elemen Teratas : " + stack.peek());
     stack.pop();
     System.out.println("Elemen Teratas : " + stack.peek());
     System.out.println(stack);
   }
 }