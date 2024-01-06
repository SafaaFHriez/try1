
package Basket;


public class Basket<T,R> {
    private T customer;  
    private R items[];
    private int lastIndex;
    
    public Basket() {
        
        items = (R[])new Object[50];
        lastIndex = -1;        
    }
    
    public void add(R i){
        if(lastIndex <items.length -1){
            lastIndex++;
            items[lastIndex] = i;
        }else{
            resize();
            lastIndex++;
            items[lastIndex] = i;
        }
    }
    public void resize(){
        R[] larger = (R[])new Object[items.length*2];
        for(int i=0;i<items.length;i++){
            larger[i] = items[i];
        }
        items = larger;
    }
    
    public void deleteLastItem(){
        if(lastIndex != -1){
            items[lastIndex] = null;
            lastIndex--;
        }
    }
    
    
    public boolean isFull(){
        if(lastIndex == items.length - 1){
            return true;
        }
        return false;
    }
    
    public boolean isEmpty(){
        if(lastIndex == -1){
            return true;
        }
        return false;
    }
    
    
    
    
      public void setCustomer(T customer) {
        this.customer = customer;
    }

    public T getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        String details = customer+"\n";
        for(int i=0;i<=lastIndex;i++){
            details += items[i]+"\n";
        }
        return details;
    }
    
    
}
