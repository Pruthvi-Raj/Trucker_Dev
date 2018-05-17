public class Test {

    private static Test singletonInstance = new Test();

    private Test() {

    }

    public static Test getInstance() {

        return singletonInstance;
    }

}
