public class Circularqueue {
    int front =-1;
    int rear = -1;
    int size;
    int queue[];

Circularqueue(int size){
    this.size=size;
    queue=new int[size];
}
boolean isFull(){
    return(rear+1)%size==front;
}
boolean isEmpty(){
    return (rear== -1 && front == -1);
}
void EnQueue(int data){
    if(isFull()){
        System.out.println("Queue is Full");
}
else{
   if(front == -1){
    front=0;
}
rear=(rear+1)%size;
queue[rear]=data;
   }
    
}
int DeQueue(){
    if (isEmpty()){
        System.out.println("queue is Empty"); 
        return -1;
    }
    if (front==rear){
        int temp=front;
        front=rear=-1;
        return queue[temp];
    }
    int temp=front;
    front=(front+1) % size;
    return queue[temp];
}
}
