interface Property{
    int compute_price();
}
class Bunglow implements Property{
    String name;
    int land_area;
    int construction_area;
    Bunglow(String name,int land_area,int construction_area){
        this.name=name;
        this.land_area=land_area;
        this.construction_area=construction_area;
    }
    public int compute_price(){
        return ((land_area*400)+(construction_area*500)+(land_area*200));   
    }
}
class Flat implements Property{
    String name;
    int construction_area;
    Flat(String name,int construction_area){
        this.name=name;
        this.construction_area=construction_area;
    }
    public int compute_price(){
        return ((construction_area*500)+200000);
    }
}
public class P4_3 {
    public static void main(String args[]){
        Bunglow b1=new Bunglow("pratik",1500,900);
        int bunglow_price=b1.compute_price();
        Flat f1=new Flat("Jay",900);
        int flat_price=f1.compute_price();

        System.out.println("Bunglow Owner:"+b1.name+"||"+"Price:"+bunglow_price);
        System.out.println("Flat Owner:"+f1.name+"||"+"Price:"+flat_price);
    }
}
