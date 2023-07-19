public class UnClicloMatriz {


    public static void main(String[] args) {
        int mar [][]= {{7,9,3,4,2},{4,6,2,7,3},{5,1,2,8,0}};
        System.out.println(UnFor(mar));
    }


    static String UnFor(int a [][]){
        String res = "";
        int b = 0;
        for (int i = 0; i < a[b].length; i++) {
            res += a[b][i]+",";
            if (i == a[b].length-1) {
                b++;
                i = -1;
                res += "\n";
                if (b == a.length) {
                    break;
                }
            }
        }
        return res;
    }
}
