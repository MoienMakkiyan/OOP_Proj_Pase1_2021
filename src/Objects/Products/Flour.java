package Objects.Products;

import Objects.XY;

public class Flour extends Product{
    public Flour(int animal_x , int animal_y) {
        XY xy = random_location.base_random(animal_x,animal_y);
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Flour");
        this.capacity = variable_reading.item_capacity("Flour");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
    }
}
