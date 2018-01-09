import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作——005
 *
 * @author ltc
 * @create 2018-01-09 9:47
 **/
public class ConstructQueueByStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {  //可看作两个栈的栈底相连
        if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        ConstructQueueByStack c = new ConstructQueueByStack();
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }
}
