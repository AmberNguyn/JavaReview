package circle;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    public ToaDo(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public ToaDo() {
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



    public String toString(){
        String str = "x: " + x + "\n" +
                "y: " + y + "\n";
        return str;
    }


}
