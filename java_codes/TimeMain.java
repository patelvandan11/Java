class Time{
    int hour,minute,second;
    Time(){
    }
    Time(int hour){
        this.hour=hour;
    }
    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    Time sum(Time a,Time b){
        Time t=new Time();
        t.hour=a.hour+b.hour;
        t.minute=a.minute+b.minute;
        t.second=a.second+b.second;
        return t;
    }
}
public class TimeMain {
    public static void main(String args[]){
        //`System.out.println();
        Time t1=new Time(7,5,12);
        Time t2=new Time(6,6);

        Time t3=new Time();
        Time t4=new Time();
        t4=t3.sum(t1,t2);

        System.out.println(t4.hour);
        System.out.println(t4.minute);
        System.out.println(t4.second);

    }
}
