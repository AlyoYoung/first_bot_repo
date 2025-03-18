package package2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevels obj =new AccessLevels();
        System.out.println(obj.protectedvar);
        System.out.println(obj.defaultvar);
        System.out.println(obj.publicvar);
    }
}
