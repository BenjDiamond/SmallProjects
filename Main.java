public class Main {

    public static void main(String[] args) {
        //pass in the amount the customer needs to buy of the item,
        //followed by how much that will be. i.e 3,150. If there is no offer on leave as 0

        SpecialOffers offers = new SpecialOffers(3,150,
                                                 2,45,
                                                 0,0,
                                                 0,0);

        Checkout checkout = new Checkout(offers.getPricing());

        checkout.scan('A');
        checkout.scan('A');
        checkout.scan('A');
        checkout.scan('B');
        checkout.scan('B');
        
        int price = checkout.getTotal();

        System.out.println(price);
    }
}
