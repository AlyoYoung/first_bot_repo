package package1;

import package2.AccessLevels;

public class TestAccessOtherPackage extends AccessLevels{
    public static void main(String[] args) {
        AccessLevels obj =new AccessLevels();
        System.out.println(obj.publicvar);
    }
    public void testPritected(){
        System.out.println(protectedvar);
    }
}
