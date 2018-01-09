import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表每个节点的值——003
 *
 * @author ltc
 * @create 2018-01-04 15:01
 **/
public class PrintrListNode {

    //使用栈实现
    public ArrayList<Integer> printListByStack(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    ArrayList<Integer> listOfRec = new ArrayList<>();

    //使用递归实现
    public void printListByRecursive(ListNode listNode) {
        if(listNode != null){
            this.printListByRecursive(listNode.next);
            listOfRec.add(listNode.val);
        }
    }

    public static void main(String[] args) {
        PrintrListNode pln = new PrintrListNode();
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(7);
        listNode.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next = new ListNode(10);
        System.out.println(pln.printListByStack(listNode));

        pln.printListByRecursive(listNode);
        System.out.println(pln.listOfRec);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}