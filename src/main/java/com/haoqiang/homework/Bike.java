package com.haoqiang.homework;

public class Bike {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(){

    }

    public Bike(String wheelShape,int wheelNum,String seatShape){
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }

    public String getWheelShape() {
        return wheelShape;
    }

    public void setWheelShape(String wheelShape) {
        this.wheelShape = wheelShape;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public String getSeatShape() {
        return seatShape;
    }

    public void setSeatShape(String seatShape) {
        this.seatShape = seatShape;
    }

    public String toString(){
        String str = "This is a bike, the wheelshape is " + this.getWheelShape()
                + ", it has "+this.getWheelNum()
                +" wheels and the seatshape is "+this.getSeatShape()
                +".";
        return str;
    }


}
