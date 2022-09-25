public class main_Contact {
    public static void main(String[] args) {
        Contact c1 = new Contact("kiran", new PhoneNumber("7892126828"));
        Contact c2 = new Contact("hello",new PhoneNumber(14,"7845422414"));

//        Contact c2 = new Contact("Maggie smith",new PhoneNumber(41,"7892126818"));
        Contact c3 = new Contact("kushal","kushaldj2002@gmail.com");



        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
