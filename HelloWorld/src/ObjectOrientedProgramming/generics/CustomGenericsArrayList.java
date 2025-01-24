package ObjectOrientedProgramming.generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {

    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i=0;i<size;i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(this.data[i] + " ");
        }
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        return (T) this.data[index];
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public int getSize() {
        return size;
    }

    public void set(int index,int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(11);

        list.display();

        System.out.println(list);



    }
}
