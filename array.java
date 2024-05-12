public class array {
    public static void main(String[] args) {
        int[] myarr = new int[5];
        // int index =2;
        myarr[0] = 98;
        myarr[1] = 76;
        myarr[2] = 43;
        myarr[3] = 12;
        myarr[4] = 65;
        // System.out.println(myarr[4]); 
        // System.out.println(myarr[index]);
        int index = 0;
        while(index < myarr.length){
            System.out.println(myarr[index]);
            index++;
        }
    }
}
