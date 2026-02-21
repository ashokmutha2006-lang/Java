public class TrappingRainWater {

    static int trapwater(int[] arr){
        int res = 0;
        for(int i = 1; i <= arr.length-2; i++){
            int lb = arr[i];        //lb = Left bar
            for(int j = 0; j < i; j++)
            {
                if(arr[j] > lb)
                {
                    lb = arr[j];
                }
            }
          int rb = arr[i];        //rb = Left bar
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > rb){
                    rb = arr[j];
                }
            }
            int wl ;    // wl = Water level.
            if(lb > rb)
                {
                    wl = rb;
                }else
                {
                    wl = lb;
                }
              int tw = wl - arr[i];      // tw = Trap water.
                  res = res + tw;
            }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,3};
        System.out.println(trapwater(arr));
    }
}

//(17/01/2026)
