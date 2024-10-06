import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String names = "Максим, Леха, Семен, Михаил, Александр, Дмитрий, Денис, Илья, Андрей, Даниил, Артём, Иван, Алексей, Никита, Павел, Евгений, Антон, Лев, Эльдар, Григорий, Владимир, Руслан, Василий, Виталий, Вячеслав, Игнат, Николай, Олег, Ренат, Роман, Сергей, Тимур, Богдан, Гарик, Давид, Камиль, Кирилл, Константин, Леонид, Матвей, Степан, Филипп, Аркадий, Вадим, Виктор, Георгий, Егор, Макар, Семён, Станислав, Тимофей, Юрий, Всеволод";
        String[] arr = names.split(",");
        String low = arr[0];
        String high = String.valueOf(arr.length - 1);
        String name = "Александр";
        String mid = String.valueOf(arr.length / 2);
        int count = 0;
        Arrays.sort(arr);

        while (!mid.equals(name)) {
            count++;
            break;
        }

        System.out.println("Count " + count);
        System.out.println("mid " + mid);
        System.out.println(Arrays.toString(arr));
    }
}
