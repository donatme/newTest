public class Test {
    public static void main(String[] args) {
        Human theAdam; // Объявим ссылку типа Human. Эта запись равносильна `Human theAdam = null;`
        theAdam = new Human(); // создаем новый объект Human справа от = и присваиваем его адрес ссылке theAdam
        // Сделаем все то же самое но с Евой и в одну строчку:
        Human theEve = new Human(); // Кстати, Еву можно было объявить и в теле класса.

        // А теперь, ради фана, создадим тут же объект класса Main:
        Test main = new Test();
    }

    static class Human {

    }
}