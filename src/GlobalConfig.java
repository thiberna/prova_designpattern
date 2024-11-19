public class GlobalConfig {
    private static volatile GlobalConfig instance;

    private GlobalConfig() {
    }
    public static GlobalConfig getInstance() {
        if (instance == null) {
            instance = new GlobalConfig();
        }
        return instance;
    }
    private String designPattern;
    private String designPattern2;
    private String designPattern3;

    public String getGlobalDesignPattern() {

        return designPattern;
    }

    public void setGlobalDesignPattern(String pattern) {

        this.designPattern = pattern;
    }

    public String getDesignPattern2() {

        return designPattern2;
    }

    public void setDesignPattern2(String designPattern2) {

        this.designPattern2 = designPattern2;
    }

    public String getDesignPattern3() {
        return designPattern3;
    }
    public void setDesignPattern3(String designPattern3) {
        this.designPattern3 = designPattern3;
    }
}