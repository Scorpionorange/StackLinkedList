public class SLLNodeDemo{
    public static void main(String[] args){
        StackLinkedList sll = new StackLinkedList();
        sll.push(100);
        System.out.println("元素100入栈");
        sll.push(200);
        System.out.println("元素200入栈");
        sll.push(300);
        System.out.println("元素300入栈");
        sll.push(400);
        System.out.println("元素400入栈");
        sll.push(500);
        System.out.println("元素500入栈");
        System.out.println();

        if(sll.isEmpty()){
            System.out.println("栈当前为空。");
        }
        else {
            System.out.println("栈当前不为空。");
        }

        System.out.println("栈内有" + sll.getSize() + "个元素");

        System.out.println("栈顶元素为：" + sll.getTop());

        sll.pop();
        System.out.println("弹出一个元素后，栈顶元素为：" + sll.getTop());

        sll.setEmpty();
        if(sll.isEmpty()){
            System.out.println("置栈空操作后，栈内为空。");
        }
        System.out.println();
    }
}
