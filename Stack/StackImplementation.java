class StackImplementation{
    int arr[];
    int capacity,top;
    StackImplementation(int size)
    {
        top=-1;
        arr=new int[size];
        capacity=size;
    }
    public void push(int val)
    {
        if(isFull()){
            System.out.println("Stack is full!");
            System.exit(1);
        }
        System.out.println("Inserting "+val);
        arr[++top]=val;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return arr[top--];
        
    }
    public boolean isFull()
    {
        return top==capacity-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public void print(){
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int getSize()
    {
        return top+1;
    }
    public static void main(String[] args) {
        StackImplementation sta=new StackImplementation(6);
        sta.push(10);
        sta.push(2);
        sta.push(9);
        sta.push(3);
        sta.push(4);
        sta.push(1);
        sta.pop();
        sta.pop();
        sta.print();
        
        System.out.println(sta.getSize());
    }
}