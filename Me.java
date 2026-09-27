import java.util.ArrayList;

class ParentsProp {
    double land = 8;
    int plots = 2;

    long bankBalance = 99999;

    void propSummary() {
        System.out
                .println("Total land: " + land + " Acers" + ". Total Plots " + plots + " Bank Balance: " + bankBalance);
    }
}

public class Me extends ParentsProp {
    public static void main(String[] args) {
        // Me yadnyesh = new Me();
        // yadnyesh.propSummary();

        int arr[] = new int[10];

        // System.out.println(arr[0]);

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(10);

        System.out.println(arrlist.get(0));
    }
}