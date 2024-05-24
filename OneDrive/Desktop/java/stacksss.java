public class stacksss {
    int top = -1;
    int stk[];
    
    int size;
    stacksss(int size){
        this.size=size;
        stk=new int[size];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top==size-1;
    }
    void push(int data){
        if  (isFull()){
            System.out.println( "Stack Overflow" );
            return ;
        }
        else{
        stk[++top]=data;
        }

    }
    int pop(){
        if   (isEmpty()) {
            return -1;
        }
        return stk[top--];
        
    }
    int  peek() { 
        return stk[top];
    }
    int size(){
        return top+1;
    }
    
}
