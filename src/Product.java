public class Product {
    private String name;
    private int required_space;

    Variable_Reading variable_reading = new Variable_Reading();

    public Product(String name) {
        this.required_space = variable_reading.item_capacity(name);
    }
    /* TODO */

    public void sth(){
        //TODO
    }

    public String getName() {
        return name;
    }

    public void chrtoprt(String name){
        System.out.println("Hi "+name);
    }

    public int getRequired_space() {
        return required_space;
    }
}
