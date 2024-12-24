public class Apple extends Food {

    // Новое поле для хранения размера яблока
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size; // Инициализируем размер яблока
    }

    // Переопределение метода consume() для яблока
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    // Геттер для получения размера яблока
    public String getSize() {
        return size;
    }

    // Сеттер для изменения размера яблока
    public void setSize(String size) {
        this.size = size;
    }

    // Переопределенная версия метода equals() для сравнения яблок по имени и размеру
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple) arg0).size); // Шаг 3
        } else
            return false;
    }

    // Переопределенная версия метода toString(), которая включает размер яблока
    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
