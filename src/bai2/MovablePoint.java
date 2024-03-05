package bai2;

public class MovablePoint extends point{
    private float xSpeed;
    private  float ySpeed;
    public MovablePoint(){};
    public MovablePoint(float x, float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }
    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }
    public String toString(){
        return "tọa độ = ( x :" + super.getX() + ", y : " + super.getY() + ") speed = (" + xSpeed + ", " + ySpeed + ")";
    }
}
