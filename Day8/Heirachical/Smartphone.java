package Heirachical;

class Smartphone extends phone {
   public void text() {
        System.out.println("Smartphone is sending a text message");
    }


   public void call(String contact) {
        System.out.println("Smartphone is calling " + contact);
    }
}