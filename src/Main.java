public class Main {
        public static void main(String[] args) {
            GlobalConfig config = GlobalConfig.getInstance();

            config.setGlobalDesignPattern("eu");
            config.setDesignPattern2("eudenovo");
            config.setDesignPattern3("eudenovoagain");

            System.out.println(config.getGlobalDesignPattern());
            System.out.println(config.getDesignPattern2());
            System.out.println(config.getDesignPattern3());
        }
    }
