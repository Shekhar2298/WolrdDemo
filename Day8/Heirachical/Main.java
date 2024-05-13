package Heirachical;

public class Main {
    public static void main(String[] args) {
        Smartphone mySmartphone = new Smartphone();
        mySmartphone.call();
        mySmartphone.call("Janvi");

        FeaturePhone myFeaturePhone = new FeaturePhone();
        myFeaturePhone.call();
        myFeaturePhone.call();

    }
}
