/**
 * Created by ScorpionOrange on 2016/12/04.
 */
/**
 * Created by ScorpionOrange on 2016/12/04.
 */
interface Stack{
    // 返回栈的大小
    public int getSize();

    // 判断堆栈是否为空
    public boolean isEmpty();

    // 数据元素 x 入栈
    public boolean push(Object x);

    // 栈顶元素出栈
    public Object pop();

    // 取栈顶元素
    public Object getTop();

    // 置栈空操作
    public void setEmpty();
}

class SLLNode{
    // 数据域
    private Object data;

    // 引用域指向下一个节点
    private SLLNode nextlink;

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public SLLNode getNext(){
        return nextlink;
    }

    public void setNext(SLLNode nextlink){
        this.nextlink = nextlink;
    }
}

class StackLinkedList implements Stack{
    private SLLNode top; // 链表首节点引用
    private int size; // 栈的大小

    public StackLinkedList(){
        top = null;
        size = 0;
    }

    // 返回栈的大小
    public int getSize(){
        return size;
    }

    // 判断堆栈是否为空
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // 数据元素 x 入栈
    public boolean push(Object x){
        SLLNode q = new SLLNode();
        q.setData(x);
        q.setNext(top);
        top = q;
        size++;
        return true;
    }

    // 栈顶元素出栈
    public Object pop(){
        Object object = null;
        if(size < 1){
            return null;
        }
        else {
            object = top.getData();
            top = top.getNext();
            size--;
        }
        return object;
    }

    // 取栈顶元素
    public Object getTop(){
        Object object = null;
        if(size < 1){
            return null;
        }
        else {
            object = top.getData();
        }
        return object;
    }

    // 置栈空操作
    public void setEmpty(){
        top = null;
        size = 0;
    }
}