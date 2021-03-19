package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/115000112
public class ParkingSystem {
    int [] count=new int[4];
    public ParkingSystem(int big, int medium, int small) {
      count[1]=big;
      count[2]=medium;
      count[3]=small;
    }

    public boolean addCar(int carType) {
       if(count[carType]-1>=0){
           count[carType]--;
           return  true;
       }
       return  false;

    }

    public  static  void main(String[] args){
        ParkingSystem parkingSystem=new ParkingSystem(1,1,0);
        int [] car={1,2,3,1};
        for (int c:car
             ) {
            System.out.println(parkingSystem.addCar(c));

        }

    }

}
