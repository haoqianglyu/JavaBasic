package com.haoqiang.homework_May22;

public class Motorcycle extends Bike{

    public int pedalNum;
    public String gasTank;
    public String motor;

    public Motorcycle(String wheelShape, int wheelNum, String seatShape,
                      int pedalNum, String gasTank, String motor){
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
        this.pedalNum = pedalNum;
        this.gasTank = gasTank;
        this.motor = motor;

    }

    public int getPedalNum() {
        return pedalNum;
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String toString(){
        String str = "This is a Motorcycle, the wheelshape is " + this.getWheelShape()
                + ", it has "+this.getWheelNum()
                +" wheels, the seatshape is "+this.getSeatShape()
                +" , it has "+this.getPedalNum()+" pedals,"
                +"the gasTank is " + this.getGasTank()
                +"the motor is "+this.getMotor()
                +".";
        return str;
    }



}
