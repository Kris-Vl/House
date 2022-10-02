public class House {
    private int id;
    private String numberHouse;
    private int area;
    private int stage;
    private String street;
    private int countRoom;

    public House() {
    }

    /**
     * Сеттер для поля id
     * @param id квартири
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Геттер для поля id
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * Сеттер для поля numberHouse
     * @param numberHouse - номер квартири
     */
    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    /**
     * Геттер для поля numberHouse
     * @return numberHouse
     */
    public String getNumberHouse() {
        return numberHouse;
    }

    /**
     * Сеттер для поля area
     * @param area - повер, на якому розташована квартира
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Геттер для поля area
     * @return area
     */
    public int getArea() {
        return area;
    }

    /**
     * Сеттер для поля stage
     * @param stage - площа квартири
     */
    public void setStage(int stage) {
        this.stage = stage;
    }

    /**
     * Геттер для поля stage
     * @return stage
     */
    public int getStage() {
        return stage;
    }

    /**
     * Сеттер для поля street
     * @param street - назва вулиці, на якій рзташовано будинок
     */
    public void setStreet(String street) {
        this.street=street;
    }

    /**
     * Геттер для поля street
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Сеттер для поля countRoom
     * @param countRoom - кількість кімнат в квартирі
     */
    public void setCountRoom(int countRoom) {
        this.countRoom=countRoom;
    }

    /**
     * Геттер для поля countRoom
     * @return countRoom
     */
    public int getCountRoom() {
        return countRoom;
    }

    /**
     * Конструктор створення нового об'єкту
     * @param id - id квартири
     * @param numberHouse - номер квартири
     * @param stage - площа квартири
     * @param area - поверх, на якому розташована квартира
     * @param street - назва вулиці, на якій знаходиться будинок
     * @param countRoom - кількість кімнат в квартирі
     */
    public House (int id, String numberHouse, int stage, int area, String street, int countRoom) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.stage = stage;
        this.area = area;
        this.street = street;
        this.countRoom = countRoom;
    }

    /**
     * Перевантажений метод toString
     * @return предсталення об'єкта у String форматі
     */
    public String toString() {
        return id + ". Кавртира №" + numberHouse + "; Площа: " + stage + "; Поверх: " +
                area + "; Вулиця: " + street + "; К-сть кімнат: " + countRoom + "\n";
    }
}
