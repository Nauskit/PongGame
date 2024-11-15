public class Vector {
    double x,y;
    public Vector(){
        x = 0;
        y = 0;
    }
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Vector add(Vector v){
        Vector result = new Vector();
        result.x = x+v.x;
        result.y = y+v.y;
        return result;
    }
}
