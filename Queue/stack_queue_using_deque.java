import java.util.*;

/**
 * Stack using Deque
 */


// public class stack_queue_using_deque {

//     static class Stack{
//         Deque<Integer> deque = new LinkedList<>();

//         //push operation
//         public void push(int data){
//             deque.addLast(data);
//         }

//         //pop operation
//         public int pop(){
//             return deque.removeLast();
//         }

//         //peek operation
//         public int peek(){
//             return deque.getLast();
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("peek = " + s.peek());
//         System.out.println(s.pop());
//     }
// }





/**
 * Queue using Deque
 */


/**
 * stack_queue_using_deque
 */
public class stack_queue_using_deque {

    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        
    }
}