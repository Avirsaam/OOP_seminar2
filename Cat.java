package seminar02;

public class Cat {
    private String name;
    private int appetite;

    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }
    public boolean eat(Plate plateOfFood) {
        System.out.printf("Кормим кота %s...\n", name);
        if (isHungry) {
            if (plateOfFood.getFood() >= appetite){
                System.out.printf("\tКот отъел из тарелки %d еды, в тарелке осталось %d\n", appetite, plateOfFood.consume(appetite));
                isHungry = false;
                return true;
            } else {
                System.out.printf("\tно он понюхал и отвернулся, так как  в тарелке мало еды\n");
            }
        } else {
            System.out.println("\tно он не голоден");
        }
        return false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return String.format("Кот %s, голоден: %b", name, isHungry);
    }
}
