package seminar02;
/*
1.  Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    (например, в миске 10 еды, а кот пытается покушать 15-20).

2.  Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    Если коту удалось покушать (хватило еды), сытость = true.
    Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

3.  Создать массив котов и тарелку с едой, попросить всех котов покушать
    из этой тарелки и потом вывести информацию о сытости котов в консоль.

4.  Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

import java.util.ArrayList;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 15)); //15
        cats.add(new Cat("Модест", 5));  //20
        cats.add(new Cat("Обжора", 30)); //50
        cats.add(new Cat("Василий", 10)); //70
        cats.add(new Cat("Мурзик", 18)); //95
        cats.add(new Cat("Везунчик", 11)); //110

        Plate plate = new Plate();

        while (countOfHungryCats(cats) > 0){
            plate.addFood(50);
            feedCats(cats, plate);
            printCatsStatus(cats);
        }




    }

    static int countOfHungryCats (List<Cat> listOfCats){
        int result = 0;
        for (Cat cat: listOfCats) {
            if (cat.isHungry()) result++;
        }
        return result;
    }

    static int feedCats (List<Cat> listOfCats, Plate plate){
        int catsEaten = 0;
        for (Cat cat: listOfCats) {
            if (cat.eat(plate)) catsEaten++;
        }
        return catsEaten;
    }

    static void printCatsStatus(List<Cat> listOfCats){
        System.out.println("\n-------");
        for (Cat cat : listOfCats) {
            System.out.println(cat);
        }
        System.out.println("-------\n");
    }
}
