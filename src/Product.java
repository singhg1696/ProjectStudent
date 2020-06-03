public class Product {

    private int no;
    private String name;
    private double cost;
    private int stock;

    public Product(int no, String name, double cost, int stock) {
        this.no = no;
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice()
    {
        if(cost >= 100) {
            return cost = cost + cost * 0.30;
        }
        else if((cost < 100) && (cost >= 50)) {
            return cost = cost + cost * 0.35;
        }
        else {
            return cost = cost + cost * 0.45;
        }

    }

    public boolean chkStock()
    {
        if(stock>10)
            return true;
        else
            return false;
    }


    public double chkDiscount()
    {
        if(cost >=100) {
            cost = cost - (0.05 * cost);
            return cost;
        }
        else if(cost>=40 && cost<100) {
            cost = cost - (0.04 * cost);
            return cost;
        }
        else
            return cost;

    }



}
