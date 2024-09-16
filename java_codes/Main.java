import java.util.Arrays;
import java.util.Scanner;
class Array{
    int data[];
    
    public Array(){
        data=new int[10];
        data[0]=1;
        data[1]=2;
        data[2]=3;
        data[3]=4;
        data[4]=5;
        data[5]=6;
        data[6]=7;
        data[7]=8;
        data[8]=9;
        data[9]=10;
    }
    public Array(int size){
        data=new int[size];
        for(int i=0;i<size;i++){
            data[i]=10;
        }
    }
    public Array(int a[]){
        data=a;
    }
    void reverse_Array(){
        int new_data[]=new int[data.length];
        int j=0;
        for(int i=data.length-1;i>=0;i--){
            new_data[j]=data[i];
            j++;
        }
        for(int i=0;i<new_data.length;i++){
            System.out.println(new_data[i]);
        }
    }
    int max(){
        int max=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }
    int avg(){
        int sum=0;
        for(int i:data){
            sum+=i;
        }
        return sum/data.length;
    }
    void sorting(){
        Arrays.sort(data);
    }
    void display(){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
    int size(){
        return data.length;
    }
}
class Main{
    public static void main(String args[]){
        Array a = new Array(new int[] {4,5,4,5,1,5,4,5});
        a.display();
        System.out.println("--------------------------------------------------------------------");
        int max=a.max();
        System.out.println("max:"+max);
        
        int size = a.size();
        System.out.println("size:"+size);    
    }
}
