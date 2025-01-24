package ObjectOrientedProgramming.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

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

    public int get(int index){
        if(index >= size){
            return -1;
        }
        return this.data[index];
    }

    public int remove(){
        return data[--size];
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
        CustomArrayList list = new CustomArrayList();
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
