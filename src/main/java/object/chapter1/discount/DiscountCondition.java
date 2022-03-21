package object.chapter1.discount;

import object.chapter1.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
