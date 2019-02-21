
public class Homework14 {
	public static void main(String[] args) {
        System.out.println("Получается долларов: "+getConvert(2800,0.036f));

    }
    public static float getConvert(float hryvnia, float rate){
        return hryvnia*rate;
    }
}
