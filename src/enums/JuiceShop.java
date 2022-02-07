package enums;

public class JuiceShop {
    enum GlassSize {Small, Medium, Large}
    GlassSize size;
}
class FreshJuiceTest{
    public static void main(String[] args) {
        JuiceShop juice = new JuiceShop();
        juice.size = JuiceShop.GlassSize.Medium;
        System.out.println("size is :" + juice.size);
    }

}
