import java.util.*;


    class TASK2 extends Thread

   {
	

        public void run()
            {
			int sec;
			int i=0;
        		Scanner sc = new Scanner(System.in);
        		System.out.println("ENTER SECONDS FOR COUNTDOWN");
        		sec=sc.nextInt();

                    
                    while(i<=sec)
                    {
                        System.out.println(sec+"SECONDS LEFT");
			sec--;
                        
                        try
                        { 
                            Thread.sleep(1000);
                        }
                        catch ( InterruptedException e)
                        {
                           System.out.println(e);
                        }


                   }
                 System.out.println("TIME'S UP!");
            }
	
	 public static void main(String[] args)
     {
        TASK2 t1 = new TASK2();
        t1.start();
     }
    }
    

