public class Tea extends Food {
    private String color; // Цвет чая (черный или зеленый)

    // Конструктор для чая, принимающий цвет
    public Tea(String color) {
        super("Чай"); // Название чая фиксированное
        this.color = color;
    }

    // Геттер для цвета чая
    public String getColor() {
        return color;
    }

    // Сеттер для цвета чая
    public void setColor(String color) {
        this.color = color;
    }

    // Переопределение метода consume для употребления чая
    @Override
    public void consume() {
        System.out.println(this + " выпит");
    }

    // Переопределённая версия метода toString, которая выводит название чая и его цвет
    @Override
    public String toString() {
        return super.toString() + " (" + color + " )";
    }
}