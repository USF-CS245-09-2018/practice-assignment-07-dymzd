public class ArrayList implements List {
    public static final int MAX = 10;
    private int maxsize; 
    private int size;
    private Object data[];

    ArrayList(){
        maxsize = MAX;
        size = 0;
        data = new Object[maxsize];
    }

    public void doubleSize(){
        int newsize = maxsize * 2;
        Object newarray[] = new Object[newsize];
        for(int i = 0 ; i < maxsize; i++){
            newarray[i] = data[i];
        }
        maxsize = newsize;
        data = newarray;
        return;        
    }

    public void add(Object obj){
        if(size >= maxsize -2){
            doubleSize();
        }
        data[size] = obj;
        size++;

    }
	public void add(int pos, Object obj){
        if(size >= maxsize -2){
            doubleSize();
        }
        if(pos <= size){
            for(int i = size;pos <= i;i--){
                data[i+1] = data[i];
            }
        }
        data[pos] = obj;
        size++;
    }
	public Object get(int pos){
        if(pos >= 0 && pos < size){
            return data[pos];
        }
        return -1;
    }
	public Object remove (int pos){
        Object deleting = data[pos];
        if(pos >= 0 && pos < size){
            for(int i = pos +1; i < size; i++){
                data[i-1] = data[i];
            }
            size--;
        }
        return deleting;
    }
	public int size(){
        return size;
    }
}