package basics.practice;

public class StackDemo<E> {
    int top = -1;
    int size = 0;
    int CAP;
    E[] array = null;

    @SuppressWarnings("unchecked")
    public StackDemo(int capacity){
        this.CAP = capacity;
        this.array = (E[]) new Object[capacity];

    }

    public boolean isFull(){

        if (this.size == 0){
            return false;
        }
       return true;
    }

    public boolean push(E e){
        if(isFull()){
            return false;
        }
        this.size++;
        this.array[++top] = e;

        return true;

    }

    public E pop(){
        if(this.size == 0)
            return null;
        this.size--;
        E result = this.array[top];
        this.top--;

        return result;
    }

    public String toString(){

        if(this.size == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i <= this.size; i++){
            sb.append(this.array[i] + " , ");
        }
     //   sb.setLength(sb.length() - 2);

        return sb.toString();
    }

    public static void main(String[] args) {
        StackDemo<String> stackDemo = new StackDemo(10);

//        stackDemo.push("Kranthi");
        stackDemo.push("kumar");
        stackDemo.push("Kranthi");
        stackDemo.push("Kranthi");
        stackDemo.push("Kranthi");

        System.out.println("Here is the result:::" + stackDemo);

        stackDemo.pop();

        System.out.println("Here is the result:::" + stackDemo);



    }

}
