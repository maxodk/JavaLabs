package Lab2.phone;

/**
 * клас абонентів мобільного звязку Phone
 * @author Максим Міліневський
 */
public class Phone {
    private int id;
    private String fname;
    private String mname;
    private String lname;
    private int numb;
    private int timeIn;
    private int timeout;

    /**
     * конструктор класу Phone з параметрами:
     * @param id - ID клієнта
     * @param fname - Прізвище клієнта
     * @param mname - Імя клієнта
     * @param lname - По-батькові клієнта
     * @param numb - Номер рахунку клієнта
     * @param timeIn - Час міських розмов
     * @param timeout - Час міжміських розмов
     */
    public Phone(int id, String fname, String mname, String lname, int numb, int timeIn, int timeout) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.numb = numb;
        this.timeIn = timeIn;
        this.timeout = timeout;
    }

    /**
     * Геттер
     * @return ID клієнта
     */
    public int getId() {
        return id;
    }

    /**
     * Сеттер
     * @param id - значення ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Геттер
     * @return значення fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * Сеттер
     * @param fname значення fname
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
    /**
     * Геттер
     * @return mname
     */
    public String getMname() {
        return mname;
    }
    /**
     * Сеттер
     * @param mname значення mname
     */
    public void setMname(String mname) {
        this.mname = mname;
    }
    /**
     * Геттер
     * @return lname
     */
    public String getLname() {
        return lname;
    }
    /**
     * Сеттер
     * @param lname значення lname
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    /**
     * Геттер
     * @return numb
     */
    public int getNumb() {
        return numb;
    }
    /**
     * Сеттер
     * @param numb значення numb
     */
    public void setNumb(int numb) {
        this.numb = numb;
    }
    /**
     * Геттер
     * @return timeIn
     */
    public int getTimeIn() {
        return timeIn;
    }
    /**
     * Сеттер
     * @param timeIn значення timeIn
     */
    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }
    /**
     * Геттер
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }
    /**
     * Сеттер
     * @param timeout значення timeout
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * метод поверення символьного рядка , який описує обєкт класу
     * @return символьний рядок з значеннями полів обєкту класу Phone
     */
    @Override
    public String toString() {
        return "ID:" + id +
                "\tFname:" + fname +
                "\tMname:" + mname +
                "\tLname:" + lname +
                "\tNumb:" + numb +
                "\tTimeIn:" + timeIn +
                "\tTimeout:" + timeout;
    }

}
