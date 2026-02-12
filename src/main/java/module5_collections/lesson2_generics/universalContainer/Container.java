package module5_collections.lesson2_generics.universalContainer;

public class Container <T> {
    private T type;

    public void setType(T type){
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
