package CustomStack;

import CustomStack.CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
//        this takes care of stack being full.
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for (int i=0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }

//        So here stack is not full. Therefore, we can call the push of Custom Stack.
        return super.push(item);
    }
}
