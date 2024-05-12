package Abstraction.Q84;

public abstract class Bird implements FlyAble{
    
    protected final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    
    
}
