package com.ohgiraffers.section02.enumtype;

public enum FoodsEnum {
    /* 작성 순서대로 0부터 값이 자동으로 부여된다.*/
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DEINK_RAW_CUTTLEFISH_SHAKE(2);

    private final int value;

    //추가 된 필드
    private final int var = 10;

    FoodsEnum(int value) { this.value = value; }

    //추가 된 메소드
    public void printVar() {
        System.out.println("print var : " + var);
    }

    @Override
    public String toString() { return this.name().toLowerCase(); }
}
