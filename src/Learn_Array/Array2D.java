package Learn_Array;

public class Array2D {
    public static void main(String[] args) {

        String[][] Apple = new String[3][3];

        Apple[0][0] = "iphone";
        Apple[0][1] = "ipad";
        Apple[0][2] = "imac";
        Apple[1][0] = "macbook";
        Apple[1][1] = "pencil";
        Apple[1][2] = "iwatch";
        Apple[2][0] = "folio";
        Apple[2][1] = "keyboard";
        Apple[2][2] = "mouse";
        System.out.println(Apple[1][2]);

        //2nd type to make 2d array
        String[][] brand = {
                {"apple","realme","oppo"},
                {"vivo","mi","infinix"},
                {"lava","xiaomi","micromax"}
        };

        System.out.println(brand[1][2]);
    }
}
