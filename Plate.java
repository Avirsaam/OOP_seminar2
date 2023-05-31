package seminar02;

public class Plate {
    private int food = 0;
    private int foodCapacity;

    public Plate(){
        this.foodCapacity = 100;
        this.food = 0;
    }

    public Plate(int food) {
        this();
        addFood(food);
    }
    public Plate(int food, int capacity) {
        this.foodCapacity = capacity;
        addFood(food);
    }


    public void info() {
        System.out.println("plate: " + food + " of " + foodCapacity);
    }
    public int getFood() {
        return food;
    }

    /**
     * Наполняет тарелку едой
     * если переданное количество еды, больше чем тарелка может вместить,
     * то излишки еды безвозвратно падают на пол...
     */
    public int addFood(int food) {
        if (food >= 0){
            this.food += food;
            if (food > this.foodCapacity){
                this.food = this.foodCapacity;
            }
            System.out.print("Тарелка наполнена едой ");
            info();
        }
        return this.food;
    }

    public int consume(int food){
        if (food > 0 && food <= this.food){
            this.food -= food;
        }
        return this.food;
    }

}
