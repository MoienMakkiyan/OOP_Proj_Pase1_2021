package Objects.Animal;

import java.util.Random;

public class Animal {

    private int x;
    private int y;
    protected String type;
    private boolean activation;

    public Animal(String type) {
        Random randomX = new Random();
        this.x = randomX.nextInt();
        Random randomY = new Random();
        this.y = randomY.nextInt();
        this.type = type;
        this.activation=true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    private void walkDirection1(Animal animal) {
        int direction = assignDirection(1);
        assignXY(animal, direction, 1);
    }

    private void walkDirection2(Animal animal) {
        int direction = assignDirection(2);
        assignXY(animal, direction, 2);
    }

    private int assignDirection(int speed) {
        int direction = 0;
        if (this.x > 6 - speed && this.y <= 6 - speed && this.y >= 1 + speed) {
            direction = 3 + (int) (Math.random() * (5));
            if (direction == 3) {
                direction = 0;
            }
        } else if (this.x < 1 && this.y <= 6 - speed && this.y >= 1 + speed) {
            direction = (int) (Math.random() * (5));
        } else if (this.x >= 1 + speed && this.x <= 6 - speed && this.y < 1 + speed) {
            direction = 2 + (int) (Math.random() * (5));
        } else if (this.x >= 1 + speed && this.x <= 6 - speed && this.y > 6 - speed) {
            direction = (int) (Math.random() * (5));
            if (direction == 3) {
                direction = 6;
            } else if (direction == 4) {
                direction = 7;
            }
        } else if (this.x < 1 + speed && this.y < 1 + speed) {
            direction = 2 + (int) (Math.random() * (3));
        } else if (this.x > 6 - speed && this.y < 1 + speed) {
            direction = 4 + (int) (Math.random() * (3));
        } else if (this.x < 1 + speed && this.y > 6 + speed) {
            direction = 0 + (int) (Math.random() * (3));
        } else if (this.x > 6 - speed && this.y > 6 - speed) {
            direction = 5 + (int) (Math.random() * (3));
            if (direction == 5) {
                direction = 0;
            }
        }
        return direction;
    }

    private void assignXY(Animal animal, int direction, int speed) {
        if (direction == 0) {
            animal.y += speed;
        } else if (direction == 1) {
            animal.y += speed;
            animal.x += speed;
        } else if (direction == 2) {
            animal.x += speed;
        } else if (direction == 3) {
            animal.x += speed;
            animal.y -= speed;
        } else if (direction == 4) {
            animal.y -= speed;
        } else if (direction == 5) {
            animal.x -= speed;
            animal.y -= speed;
        } else if (direction == 6) {
            animal.x -= speed;
        } else if (direction == 7) {
            animal.x -= speed;
            animal.y += speed;
        }
    }

    public void walk(Animal animal) {
        if (animal instanceof Domestic) {
            walkDirection1(animal);
        } else if (animal instanceof Wild) {
            if (animal instanceof Lion || animal instanceof Bear) {
                walkDirection1(animal);
            } else if (animal instanceof Bear) {
                walkDirection2(animal);
            }
        } else if (animal instanceof HunterDog) {
            walkDirection1(animal);
        } else if (animal instanceof CollectorCat) {
            walkDirection1(animal);
        }
    }
}

