package logic;

public class TimeSetLogic {

    private static TimeSetLogic instance;

    private TimeSetLogic() { }

    public static synchronized TimeSetLogic getInstance() {
        if (instance == null) {
            instance = new TimeSetLogic();
        }
        return instance;
    }
}
