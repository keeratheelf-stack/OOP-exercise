import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        // Kiểm tra các mức giảm
        System.out.println("Premium service discount: "
                + DiscountRate.getServiceDiscountRate("Premium"));
        System.out.println("Gold service discount: "
                + DiscountRate.getServiceDiscountRate("Gold"));
        System.out.println("Silver service discount: "
                + DiscountRate.getServiceDiscountRate("Silver"));
        System.out.println("Product discount: "
                + DiscountRate.getProductDiscountRate("Gold"));

        // Khách không có hội viên
        Visit guestVisit = new Visit("An", new Date());
        guestVisit.setServiceExpense(100);
        guestVisit.setProductExpense(50);
        System.out.println("\n" + guestVisit);
        System.out.println("Guest total: " + guestVisit.getTotalExpense());

        // Khách Premium
        Customer premiumCustomer = new Customer("Binh");
        premiumCustomer.setMember(true);
        premiumCustomer.setMemberType("Premium");

        Visit premiumVisit = new Visit(premiumCustomer, new Date());
        premiumVisit.setServiceExpense(100);
        premiumVisit.setProductExpense(50);
        System.out.println("\n" + premiumVisit);
        System.out.println("Premium total: "
                + premiumVisit.getTotalExpense());

        // Khách Gold
        Customer goldCustomer = new Customer("Chi");
        goldCustomer.setMember(true);
        goldCustomer.setMemberType("Gold");

        Visit goldVisit = new Visit(goldCustomer, new Date());
        goldVisit.setServiceExpense(100);
        goldVisit.setProductExpense(50);
        System.out.println("\n" + goldVisit);
        System.out.println("Gold total: " + goldVisit.getTotalExpense());

        // Khách Silver
        Customer silverCustomer = new Customer("Dung");
        silverCustomer.setMember(true);
        silverCustomer.setMemberType("Silver");

        Visit silverVisit = new Visit(silverCustomer, new Date());
        silverVisit.setServiceExpense(100);
        silverVisit.setProductExpense(50);
        System.out.println("\n" + silverVisit);
        System.out.println("Silver total: "
                + silverVisit.getTotalExpense());
    }
}