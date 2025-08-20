package homework11.task8;

public enum SubscriptionPlan {
    FREE(0),
    BASIC(14.99),
    PREMIUM(29.99),
    ENTERPRISE(99.99);

    private final double cost;

    SubscriptionPlan(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return this.cost;
    }
    public SubscriptionPlan compare(SubscriptionPlan other) {
        if (this.cost < other.cost) {
            return this;
        } else if (this.cost > other.cost) {
            return other;
        } else {
            return null;
        }
    }
    public void printBenefits() {
        switch (this) {
            case FREE:
                System.out.println("Free plan: Basic access with ads.");
                break;
            case BASIC:
                System.out.println("Basic plan: Ad-free experience with limited features.");
                break;
            case PREMIUM:
                System.out.println("Premium plan: Full access to all features and no ads.");
                break;
            case ENTERPRISE:
                System.out.println("Enterprise plan: Custom solutions and dedicated support.");
                break;
        }
    }
}
