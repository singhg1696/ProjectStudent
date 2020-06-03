public class ApplicationStudent {

    Product stProduct[] = {new Product(1,"Gurwinder",48.5,20),
                            new Product(2,"Karan",34.5,10),
                            new Product(3,"xyz",80,40)};

    public double findPrice(String pName)
    {
        for(int i=0;i<stProduct.length;i++)
            if(pName.equalsIgnoreCase(stProduct[i].getName()))
                return stProduct[i].getPrice();
        return '0';
    }

    public int findProduct(int stock)
    {
        for(int i=0;i<stProduct.length;i++)
            if(stock==stProduct[i].getNo() && stock<10)
                return stProduct[i].getNo();
        return -1;
    }



}
