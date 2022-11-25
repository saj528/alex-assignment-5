public class Main {
    public static void main(String[] args) {

        CustomArrayList<String> list = new CustomArrayList();

        for(int i = 0; i <= 22;i++){
            list.add("String element: " + i);
        }

        for(int i = 0; i < list.getSize();i++){
            System.out.println(list.get(i));
        }


    }
}
