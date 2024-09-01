class Time {
    int hr;
    int min;
    int sec;
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public void displayTime() {
        System.out.println("Time: " + hr + ":" + min + ":" + sec);
    }
    public void addTime(Time t) {
        this.hr = this.hr + t.hr;
        this.min =this.min+ t.min;
        this.sec= this.sec+t.sec;
        if (this.sec >= 60) {
            this.min += this.sec / 60;
            this.sec = this.sec % 60;
        }
        if (this.min >= 60) {
            this.hr += this.min / 60;
            this.min = this.min % 60;
        }
    }
    public static void main(String[] args) {
        Time t1 = new Time(10, 20, 30);
        Time t2 = new Time(5, 10, 20);
        t1.displayTime();
        t2.displayTime();
        t1.addTime(t2);
        t1.displayTime();
    }
}