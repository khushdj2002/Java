package abhijith.Generics;

class SimpleGenericClass<T> {
    public T value;//declare an object of type T

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
