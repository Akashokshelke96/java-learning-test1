package java1;

public class Peacock {
            public static void main(String args[]) {
            StringBuffer sBuffer = new StringBuffer("test");
                System.out.println(sBuffer.reverse());
            System.out.println(sBuffer);
            sBuffer.delete(0,1);
                System.out.println(sBuffer);
        }
    }
