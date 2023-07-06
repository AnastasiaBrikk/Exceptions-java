import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
        // (типа float), и возвращает введенное значение. Ввод текста вместо числа не
        // должно приводить к падению приложения, вместо этого, необходимо повторно
        // запросить у пользователя ввод данных.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите дробное число: ");
        // try {
        //     Float num = sc.nextFloat();
        //     System.out.println(num);
        // } catch (Exception e) {
        //     System.out.println("Неккоректный формат ввода, введите дробное число");
        // } finally {
        //     sc.close();
        // }

        // Задание 2. Если необходимо, исправьте данный код:
        // try {
        // int d = 0;
        // double catchedRes1 = intArray[8] / d;
        // System.out.println("catchedRes1 = " + catchedRes1);
        // } catch (ArithmeticException e) {
        // System.out.println("Catching exception: " + e);
        // }

        // Здесь можно убрать блок try-catch и вместо него использовать if-else, так как
        // unchecked exception:
        // if (d != 0) {
        // double catchedRes1 = intArray[8] / d;
        // System.out.println("catchedRes1 = " + catchedRes1);
        // } else {
        // System.out.println("На ноль делить нельзя!");
        // }

        // Задание 3. Дан следующий код, исправьте его там, где требуется:
        // В представленном коде в блоке try имеются ошибки. В блоке catch как минимум
        // нужно изменить порядок обработки исключений на следующий:

        // catch (NullPointerException ex) {
        // System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        // System.out.println("Массив выходит за пределы своего размера!");
        // } catch (Exception ex) {
        // System.out.println("Что-то пошло не так...");
        // }

        //В последнем Throwable изменим на Exception. Также в методе printSum не нужен throws.


        // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя!

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scan.nextLine();
        scan.close();
        if (text.isEmpty()) {
            System.out.println("Exception: пустые строки вводить нельзя");
        }
    }
}