package utils;


public class Toggle {
    boolean val;
    
    public Toggle(boolean val){
        this.val = val;
    }
    
    public void setVal(boolean val){
        this.val = val;
    }
    
    public boolean getVal(){
        return val;
    }
    
    public void toggle(){
        setVal(!getVal());
    }
}
