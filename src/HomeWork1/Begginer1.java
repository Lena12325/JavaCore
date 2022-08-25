package HomeWork1;

import java.sql.PseudoColumnUsage;

public class Begginer1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String World = " WoRld!";
        char newLine = '\n';
        String hi2 = hi.trim();
        String world2 = World.toLowerCase();
        String result = hi2 + world2 + newLine;
        System.out.print(result.repeat(3));

        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние слова,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
    }
}
