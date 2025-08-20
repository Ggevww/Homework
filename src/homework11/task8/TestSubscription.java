package homework11.task8;

public class TestSubscription {
    public static void main(String[] args) {
        SubscriptionPlan basic = SubscriptionPlan.BASIC;
        SubscriptionPlan premium = SubscriptionPlan.PREMIUM;
        SubscriptionPlan free = SubscriptionPlan.FREE;
        SubscriptionPlan enterprise = SubscriptionPlan.ENTERPRISE;
        System.out.println("Basic plan cost: " + basic.getCost());
        System.out.println("Premium plan cost: " + premium.getCost());
        System.out.println("Free plan cost: " + free.getCost());
        System.out.println("Enterprise plan cost: " + enterprise.getCost());
        System.out.println("Comparing Basic and Premium plans: " + basic.compare(premium));
        System.out.println("Comparing Premium and Free plans: " + premium.compare(free));
        System.out.println("Comparing Free and Enterprise plans: " + free.compare(enterprise));
        System.out.println("Benefits of Basic plan:");
        basic.printBenefits();
        System.out.println("Benefits of Premium plan:");
        premium.printBenefits();
    }
}
