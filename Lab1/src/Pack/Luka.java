package Pack;

/**
 * клас Luka із полями номеру{@link Luka#numb} і значення{@link Luka#data} числа Люка
 * @author Максим Міліневський
 */
public class Luka {
    /**
     * номер числа Люка
     */
    private int numb;
    /**
     * значення числа Люка
     */
    private int data;

    /**
     * констуктор класу {@link Luka} із параметрами
     * @param numb номер числа Люка
     * @param data значення числа Люка
     */
    public  Luka(int numb,int data)
    {
        this.data = data;
        this.numb = numb;
    }

    /**
     * метод класу - повернення значення числа Люка
     * @return значення числа Люка
     */
    public int getData() {
        return data;
    }
    /**
     * метод класу - повернення номеру числа Люка
     * @return номер числа Люка
     */
    public int getNumb() {
        return numb;
    }
    /**
     * метод класу - задання значення числа Люка
     * @param data значення числа Люка
     */
    public void setData(int data) {
        this.data = data;
    }
    /**
     * метод класу - задання номеру числа Люка
     * @param numb номеру числа Люка
     */
    public void setNumb(int numb) {
        this.numb = numb;
    }
}
