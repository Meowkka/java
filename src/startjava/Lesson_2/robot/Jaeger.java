package startjava.Lesson_2.robot;

public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    
    public Jaeger (String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName == ""){
            System.out.println("Пустая строка!");
        }else{
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if(mark == ""){
            System.out.println("Пустая строка!");
        }else{
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if(origin == ""){
            System.out.println("Пустая строка!");
        }else{
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height <= 0){
            System.out.println("Высота не может быть меньше или равна 0!");
        }else{
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight <= 0){
            System.out.println("Вес не может быть меньше или равен 0!");
        }else{
            this.weight = weight;
        }
    }
    
    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "Nothing";
    }

    public void useVortexCannon() {

    }

}