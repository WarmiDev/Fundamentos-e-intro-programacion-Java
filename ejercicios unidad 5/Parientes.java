public class Parientes{
    private int a,b;
    private String res;
    public Parientes(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String evaluarParentezco(){
        if(a%b==0||b%a==0)
            res=a+" y "+b+" son parientes";
        else
            res=a+" y "+b+" no son parientes";
        return res;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
}
