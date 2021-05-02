public class RandomNum {

    private int num;

    final static int MAX_RANDOM_NUM = 9;
    final static int MIN_RANDOM_NUM = 0;

    public boolean validateNum(int num) {
        if (num < MIN_RANDOM_NUM || num > MAX_RANDOM_NUM)
            return false;
        return true;
    }

    public RandomNum(int i) {
        if(validateNum(i))
            this.num = i;
        this.num = -1;
    }

    public int getNum() {
        return num;
    }

}
