public class Test implements Cloneable{
    private int a, b;
    public Test(){}
    public Test(int a, int b) {this.a=a; this.b=b;}

    public int getA() {return a;}

    public int getB() {return b;}

    public void setA(int a) {this.a = a;}

    public void setB(int b) {this.b = b;}
    public String toString() {return "Test {" + "a = " + a + ", b = " + b + "}";}
    public  boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test other = (Test) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }
    public int hashCode() {
        int hash = 7;
        hash = 97*hash + this.a;
        hash = 97*hash + this.b;
        return hash;
    }
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error");
        } return null;
    }
    protected  void finalize() throws Throwable {
        System.out.println("Delete");
    }
}
