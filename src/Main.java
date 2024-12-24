public class Main {
    public static void main(String[] args) throws Exception {
        // Массив для хранения продуктов завтрака
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;

        // Обработка командной строки и создание продуктов
        for (String arg : args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                if (parts.length > 1) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                } else {
                    System.out.println("Ошибка: Яблоко должно иметь параметр (например, 'Apple/Big').");
                    continue;
                }
            } else if (parts[0].equals("Tea")) {
                if (parts.length > 1) {
                    breakfast[itemsSoFar] = new Tea(parts[1]);
                } else {
                    System.out.println("Ошибка: Чай должен иметь параметр (например, 'Tea/Green').");
                    continue;
                }
            } else {
                System.out.println("Неизвестный продукт: " + parts[0]);
                continue;
            }

            itemsSoFar++;
        }

        // Подсчёт общего количества чаёв
        String teaName = "Чай"; // Имя чая, используемое в методе equals()
        int teaCount = 0;

        // Объект для сравнения
        Food targetTea = new Food(teaName) {
            @Override
            public void consume() {
                // Реализация не требуется для анонимного объекта
            }
        };

        // Перебираем продукты завтрака
        for (Food item : breakfast) {
            if (item != null && item.equals(targetTea)) {
                teaCount++;
            }
        }

        // Выводим количество чаёв
        System.out.println("Общее количество чаёв: " + teaCount);

        // Перебор всех продуктов и вызов метода consume()
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }

        System.out.println("Всего хорошего!");
    }
}

