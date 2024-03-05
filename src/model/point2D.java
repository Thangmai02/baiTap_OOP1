package model;

public class point2D {
    private float x;
    private  float y;
    public point2D(){};
    public point2D(float x, float y){
        this.y=y;
        this.x=x;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.y=y;
        this.x=x;
    }
    public float[] getXY(){
        return new  float[]{x,y};
    }
    public String toString(){
        return " tọa độ là ( x : "+x+" y : "+y+" )";
    }

}
