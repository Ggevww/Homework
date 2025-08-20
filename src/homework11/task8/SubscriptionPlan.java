package homework11.task8;

/**
 * SubscriptionPlan enum represents different subscription plans with their costs and benefits.
 * It provides methods to get the cost, compare plans, and print benefits of each plan.
 */
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
    /**
     * Compares this subscription plan with another plan based on cost.
     * Returns the plan with the lower cost, or this plan if they are equal.
     *
     * @param other the other subscription plan to compare with
     * @return the subscription plan with the lower cost
     */
    public SubscriptionPlan compare(SubscriptionPlan other) {
        if (this.cost < other.cost) {
            return this;
        } else if (this.cost > other.cost) {
            return other;
        } else {
            return this;
        }
    }
    /**
     * Prints the benefits of the subscription plan.
     * Each plan has different benefits which are printed based on the plan type.
     */
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
