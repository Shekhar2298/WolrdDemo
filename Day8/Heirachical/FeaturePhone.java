package Heirachical;

class FeaturePhone extends phone {
   public void ring() {
        System.out.println("Feature phone is ringing");
    }

   public void call(String contact) {
        System.out.println("Feature phone is calling " + contact);
    }
}