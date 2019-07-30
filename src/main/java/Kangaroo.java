public class Kangaroo {


    static String kangaroo(int x1, int v1, int x2, int v2) {
        int speeddiff = v2 - v1;
        int posdiff = x1 - x2;
        if ((speeddiff % posdiff) == 0 && speeddiff * posdiff > 0)
            return "Yes";
        else
            return "No";
    }

}