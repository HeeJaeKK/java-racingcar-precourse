public class RandomNum {

    private int num;

    public boolean validateNum(int num) {
        if (num < 0 || num > 9)
            return false;
        return true;
    }

    public RandomNum(int i) {
        this.num = i;
    }

    public int getNum() {
        return num;
    }

}
