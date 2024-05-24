public class stacksss {
    int top = -1;
    char stk[];
    
    int size;
    stacksss(int size){
        this.size=size;
        stk=new  int[size];
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
    char pop(){
        if   (isEmpty()) {
            return f;
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
