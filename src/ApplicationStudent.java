public class ApplicationStudent {

    Product stProduct[] = {new Product(1,"Gurwinder",80.00,20),
                            new Product(2,"Karan",34.5,10),
                            new Product(3,"xyz",100,40)};

    public double findPrice(String name) {
        for (Product p : stProduct) {
            if (p.getName().equalsIgnoreCase(name)) {
                if (p.chkDiscount() != p.getPrice()) {
                    return p.chkDiscount();
                }
                return p.getPrice();
            }
        }
        return 0.0;
    }
    public int chkStock()
    {
        int stockcount = 0;
        for(Product p : stProduct)
        {
            if(!p.chkStock())
            {
                stockcount++;
            }

        }
        return stockcount;

    }



}
