package poly_pay0;

public abstract class WhatPay{
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();//null로 반환되는 경우를 생각해서
        }
    }
}
