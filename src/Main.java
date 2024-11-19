public class Main {
        public static void main(String[] args) {
            GlobalConfig config = GlobalConfig.getInstance();

            config.setGlobalDesignPattern("eu");
            config.setDesignPattern2("eunocelular");
            config.setDesignPattern3("eunopc");

            System.out.println(config.getGlobalDesignPattern());
            System.out.println(config.getDesignPattern2());
            System.out.println(config.getDesignPattern3());
        }
    }
