package model;

public class point3D extends point2D{
    private float z;
    public point3D(){};
    public point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.z=z;
        super.setX(x);
        super.setY(y);
    }
    public float[] getXYZ(){
        float[] xyz={super.getX(),super.getY(),z};
        return xyz;
    }
    public String toString(){
        return "Tọa độ là: (" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
