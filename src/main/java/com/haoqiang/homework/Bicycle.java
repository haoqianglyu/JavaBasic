package com.haoqiang.homework_May22;

public class Bicycle extends Bike{
    public int pedalNum;

    public int getPedalNum() {
        return pedalNum;
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    public Bicycle(String wheelShape,int wheelNum,String seatShape,int pedalNum){
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
        this.pedalNum = pedalNum;
    }

    public String toString(){
        String str = "This is a bicycle, the wheelshape is " + this.getWheelShape()
                + ", it has "+this.getWheelNum()
                +" wheels, the seatshape is "+this.getSeatShape()
                +" and it has "+this.getPedalNum()+" pedals"
                +".";
        return str;
    }



}
