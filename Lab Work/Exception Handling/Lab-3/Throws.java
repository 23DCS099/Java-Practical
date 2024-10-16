public class Throws {

    class test {

        void m1() throws InterruptedException {
            m2();
        }

        void m2() throws InterruptedException {
            m3();
            // try{
            //     m3();
            // }
            // catch(Exception e)
            // {
            //     System.out.println("Exception handled");
            // }
        }

        void m3() throws InterruptedException {
            System.out.println("Hi");
            Thread.sleep(2000);
            // try {
            // Thread.sleep(2000);
            // }
            // catch (Exception e)
            // {
            //  System.out.println("Exception handled");
            // }

            System.out.println("Hello");
        }
    }

    public class throws_2 {

        public static void main(String[] args) throws InterruptedException {
            test t = new test();
            t.m1();
        }

    }
}
