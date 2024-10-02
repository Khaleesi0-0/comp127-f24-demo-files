package InterfacePractice;

public class Lion implements Animal {

    private String color;
    public Lion(String color){
        this.color = color;

    }

    @Override
    public String makeNoise() {
        return "Roar!";
       
    }
    public String getColor(){
        return this.color;
    }
    
}
