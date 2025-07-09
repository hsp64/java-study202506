package chap2_8.stream;

public class SimpleDish {

    private String menuName;
    private int calories;

    public SimpleDish(Dish menu) {
        this.menuName = menu.getName();
        this.calories = menu.getCalories();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "menuName='" + menuName + '\'' +
                ", calories=" + calories +
                '}';
    }
}
