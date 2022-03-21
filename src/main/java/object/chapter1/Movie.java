package object.chapter1;

import object.chapter1.discount.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private DiscountPolicy discountPolicy;
    private Money fee;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }


    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
