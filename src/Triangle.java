public class Triangle extends Form{
    private float base;
    private float height;

    public Triangle(){
        super();
        this.base = 0;
        this.height = 0;
    }
    public Triangle(float base, float height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }
    public float getArea(){
        return (base*height)/2;
    }
    public String toString(){
        return super.toString() + ",and is a triangle with base" + base+"and height" +height;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj==null|| getClass()!=obj.getClass()) return false;
        Triangle triangle = (Triangle)obj;
        return Float.compare(triangle.height,height)==0&&Float.compare(triangle.base,base)==0;
    }
}
