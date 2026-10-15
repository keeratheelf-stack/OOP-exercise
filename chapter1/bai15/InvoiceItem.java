public class InvoiceItem {
    public String id;
    public String desc; //desc = description
    public int qty; //qty = quantity
    public double unitPrice;

    public InvoiceItem (String i, String d, int q, double u){
        id = i;
        desc = d;
        qty = q;
        unitPrice = u;
    }

    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void  setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice * qty;
    }

    public String toString(){
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }


}
