package pers.peng.learn.javase.reflect;

public class PeopleWhoLookingHouse implements RentingHouse{


    @Override
    public void findHouse() {
        System.out.println("find house");
    }

    @Override
    public void houseViewing() {
        System.out.println("看房子");
    }

    @Override
    public void deal() {
        System.out.println("成交");
    }
}
