package labb3;
public class tinhvector {
    public static void main(String[] args) {
        vector v = new vector();
        double x = 0;
        double y = 0;
        double z = 0;
        v.setcongvector(x + v.getx());
        v.setcongvector(y + v.gety());
        v.setcongvector(z + v.getz());
        v.settruvector(x - v.getx());
        v.settruvector(y - v.gety());
        v.settruvector(z - v.getz());
        double k = 0;
        v.setnhanmothangso(k*x);
        v.setnhanmothangso(k*y);
        v.setnhanmothangso(k*z);
        v.setnhanvohuong(x * v.getx() + y * v.gety() + z * v.getz());
    }
}
