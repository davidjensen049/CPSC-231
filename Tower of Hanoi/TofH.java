import java.util.*;
public class TofH
{
    private int nDisks; // 
    
    public TofH(int nDisks){ 
        this.nDisks=nDisks;
    }
    
    public void moving(){
        int n=nDisks; 
        int limit = (int)Math.pow(2,n)-1;
        for(int i=0;i<limit;i++){
            int disk = disk(i); 
            int begin = ( movements(i,disk)*direction(disk,n))%3;
            int end = (begin + direction(disk,n))%3; 
            move(disk,begin,end);
        }      
    }
    private int disk(int i) { 
        int D, x= i+1;
        for(D=0;x%2==0;D++){ 
            x/=2;
        }
        return D; 
    }
    private int movements(int i, int d) { 
        while(d--!=0)
            i/=2;
        return (i+1)/2;
    }
    private int direction(int d,int n) { 
        return 2 - (n + d)%2;
    }
    private void move(int disk, int source, int destination) {
        System.out.println("Move Disk " + (disk+1)+ " from Tower " + (source+1) + " to Tower " + (destination+1));
    }
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the No. of Disks : ");
       TofH toh=new TofH(sc.nextInt());
       toh.moving();
    }
}