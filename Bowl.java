class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) { // конструктор дл миски с некоторым количеством еды
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public boolean eat(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
}
