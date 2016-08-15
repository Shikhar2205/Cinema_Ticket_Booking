
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Cinema 
{
    static int i,j,k,m,n,o,a,v,b,c;
    static String seats11[][][]=new String[5][10][13];
    static String seats12[][][]=new String[5][10][13];
    static String seats13[][][]=new String[5][10][13];
    static String seats14[][][]=new String[5][10][13];
    static String seats21[][][]=new String[5][10][13];
    static String seats22[][][]=new String[5][10][13];
    static String seats23[][][]=new String[5][10][13];
    static String seats24[][][]=new String[5][10][13];
    public static void endless()
    {
        Scanner rk=new Scanner(System.in);
        System.out.println("DO YOU WANT TO BUY MORE TICKETS ");
        System.out.println("1 for YES");
        System.out.println("2 for NO");
        int z=rk.nextInt();
        if(z==1)
        {
            movie(i);
        }
        if(z==2)
        {
            System.out.println("WE HOPE YOU ENJOYED OUR SERVICES");
            System.out.println("\t THANK   YOU  COME  AGAIN");
            System.out.println("---------------------------------------------------------------------");
        }
        
        if(z>2)
        {
            System.out.println("INVALID CHOICE");
        }
        
    }
    public static void  printTicket(int i,int j,int k,int n,int o,int m)
{
    System.out.println();
    System.out.println("____________________________________________________________________________");
    System.out.println();
    System.out.println("\tSCREEN NO:"+k);
    if(j==1)
    {
        System.out.println("FAST AND FURIOUS 7");
    }
    if(j==2)
    {
        System.out.println("LOST");
    }
    if(j==3)
    {
        System.out.println("ALICE IN WONDERLAND");
    }
    if(j==4)
    {
        System.out.println("CINDRELLA");
    }
    Calendar objCalendar=Calendar.getInstance();
    Date objDate=objCalendar.getTime();
    System.out.println(objDate);
    if(m==1 && k==1)
    {
       System.out.println("SILVER   AMT Rs-80"); 
    }
    if(m==1 && k!=1)
    {
       System.out.println("SILVER   AMT Rs-100"); 
    }
     if(m==2 && k==1)
    {
       System.out.println("GOLD     AMT Rs-90"); 
    }
     if(m==2 && k!=1)
    {
       System.out.println("GOLD     AMT Rs-150"); 
    }
      if(m==3 && k==1)
    {
       System.out.println("DIAMOND  AMT Rs-120"); 
    }
      if(m==3 && k!=1)
    {
       System.out.println("DIAMOND   AMT Rs-200"); 
    }
      System.out.print("ROW "+n);
      System.out.println("\tSEAT "+o);
      a++;
      System.out.println("AUDIT NO:"+a);
      System.out.println("___________________________________________________________________________");
      endless();
}
    public static void book(int i, int j, int k)
     {   int q,w;
         Scanner ra=new Scanner(System.in);
         System.out.println("CHOOSE YOUR TICKET CHOICE");
         System.out.println("1- SILVER\t2- GOLD\t\t3- DIAMOND");
         m=ra.nextInt();
         if(m>3)
         {
             System.out.println("INVALID CHOICE");
         }
         else
         {
         System.out.println("CHOOSE YOUR SEAT FROM BELOW TABLE");
         
         for(q=1;q<=9;q++)
         {
             if(q==3)
                {
                    System.out.println("SILVER");
                }
              if(q==6)
                 {
                    System.out.println("GOLD");
                  }
               if(q==8)
                  {
                         System.out.println("DIAMOND");
                    }
             if(q>=1)
               {
                  System.out.println();
               }
            for(w=1;w<=12;w++)
             {
                 if(i==1 && j==1 && k==1)
                 {
                 
                    System.out.print(" "+seats11[0][q][w]); 
             } 
                 if(i==1 && j==1 && k==2)
                 {
                 
                    System.out.print(" "+seats11[1][q][w]); 
             } if(i==1 && j==1 && k==3)
                 {
                 
                    System.out.print(" "+seats11[2][q][w]); 
             } if(i==1 && j==1 && k==4)
                 {
                 
                    System.out.print(" "+seats11[3][q][w]); 
             } if(i==1 && j==2 && k==1)
                 {
                 
                    System.out.print(" "+seats12[0][q][w]); 
             } if(i==1 && j==2 && k==2)
                 {
                 
                    System.out.print(" "+seats12[1][q][w]); 
             } if(i==1 && j==2 && k==3)
                 {
                 
                    System.out.print(" "+seats12[2][q][w]); 
             } if(i==1 && j==2 && k==4)
                 {
                 
                    System.out.print(" "+seats12[3][q][w]); 
             } if(i==1 && j==3 && k==1)
                 {
                 
                    System.out.print(" "+seats13[0][q][w]); 
             } if(i==1 && j==3 && k==2)
                 {
                 
                    System.out.print(" "+seats13[1][q][w]); 
             } if(i==1 && j==3 && k==3)
                 {
                 
                    System.out.print(" "+seats13[2][q][w]); 
             } if(i==1 && j==3 && k==4)
                 {
                 
                    System.out.print(" "+seats13[3][q][w]); 
             } if(i==1 && j==4 && k==1)
                 {
                 
                    System.out.print(" "+seats14[0][q][w]); 
             } if(i==1 && j==4 && k==2)
                 {
                 
                    System.out.print(" "+seats14[1][q][w]); 
             } if(i==1 && j==4 && k==3)
                 {
                 
                    System.out.print(" "+seats14[2][q][w]); 
             } if(i==1 && j==4 && k==4)
                 {
                 
                    System.out.print(" "+seats14[3][q][w]); 
             }
             if(i==2 && j==1 && k==1)
                 {
                 
                    System.out.print(" "+seats21[0][q][w]); 
             } 
                 if(i==2 && j==1 && k==2)
                 {
                 
                    System.out.print(" "+seats21[1][q][w]); 
             } if(i==2 && j==1 && k==3)
                 {
                 
                    System.out.print(" "+seats21[2][q][w]); 
             } if(i==2 && j==1 && k==4)
                 {
                 
                    System.out.print(" "+seats21[3][q][w]); 
             } if(i==2 && j==2 && k==1)
                 {
                 
                    System.out.print(" "+seats22[0][q][w]); 
             } if(i==2 && j==2 && k==2)
                 {
                 
                    System.out.print(" "+seats22[1][q][w]); 
             } if(i==2 && j==2 && k==3)
                 {
                 
                    System.out.print(" "+seats22[2][q][w]); 
             } if(i==2 && j==2 && k==4)
                 {
                 
                    System.out.print(" "+seats22[3][q][w]); 
             } if(i==2 && j==3 && k==1)
                 {
                 
                    System.out.print(" "+seats23[0][q][w]); 
             } if(i==2 && j==3 && k==2)
                 {
                 
                    System.out.print(" "+seats23[1][q][w]); 
             } if(i==2 && j==3 && k==3)
                 {
                 
                    System.out.print(" "+seats23[2][q][w]); 
             } if(i==2 && j==3 && k==4)
                 {
                 
                    System.out.print(" "+seats23[3][q][w]); 
             } if(i==2 && j==4 && k==1)
                 {
                 
                    System.out.print(" "+seats24[0][q][w]); 
             } if(i==2 && j==4 && k==2)
                 {
                 
                    System.out.print(" "+seats24[1][q][w]); 
             } if(i==2 && j==4 && k==3)
                 {
                 
                    System.out.print(" "+seats24[2][q][w]); 
             } if(i==2 && j==4 && k==4)
                 {
                 
                    System.out.print(" "+seats24[3][q][w]); 
             }
              }
         }
         System.out.println();
         System.out.println("*-means seat reserved\n- means seat still available");
         System.out.println("PLEASE ENTER THE ROW AND COLUMN OF THE SEAT YOU WANT");
         n=ra.nextInt();
         o=ra.nextInt();
         if(i==1 && j==1 && k==1)
                 {
                 
                   seats11[0][n][o]="*"; 
             } 
                 if(i==1 && j==1 && k==2)
                 {
                 
                    seats11[1][n][o]="*"; 
             } if(i==1 && j==1 && k==3)
                 {
                 
                   seats11[2][n][o]="*";
             } if(i==1 && j==1 && k==4)
                 {
                 
                    seats11[3][n][o]="*"; 
             } if(i==1 && j==2 && k==1)
                 {
                 
                    seats12[0][n][o]="*"; 
             } if(i==1 && j==2 && k==2)
                 {
                 
                    seats12[1][n][o]="*"; 
             } if(i==1 && j==2 && k==3)
                 {
                 
                   seats12[2][n][o]="*";
             } if(i==1 && j==2 && k==4)
                 {
                 
                   seats12[3][n][o]="*";
             } if(i==1 && j==3 && k==1)
                 {
                 
                    seats13[0][n][o]="*"; 
             } if(i==1 && j==3 && k==2)
                 {
                 
                    seats13[1][n][o]="*";  
             } if(i==1 && j==3 && k==3)
                 {
                 
                    seats13[2][n][o]="*";  
             } if(i==1 && j==3 && k==4)
                 {
                 
                 seats13[3][n][o]="*"; 
             } if(i==1 && j==4 && k==1)
                 {
                 
                   seats14[0][n][o]="*"; 
             } if(i==1 && j==4 && k==2)
                 {
                 
                    seats14[1][n][o]="*";  
             } if(i==1 && j==4 && k==3)
                 {
                 
                  seats14[2][n][o]="*"; 
             } if(i==1 && j==4 && k==4)
                 {
                 
                    seats14[3][n][o]="*"; 
             }
             if(i==2 && j==1 && k==1)
                 {
                 
                   seats21[0][n][o]="*"; 
             } 
                 if(i==2 && j==1 && k==2)
                 {
                 
                   seats21[1][n][o]="*"; 
             } if(i==2 && j==1 && k==3)
                 {
                 
                   seats21[2][n][o]="*"; 
             } if(i==2 && j==1 && k==4)
                 {
                 
                   seats21[3][n][o]="*"; 
             } if(i==2 && j==2 && k==1)
                 {
                 
                    seats22[0][n][o]="*"; 
             } if(i==2 && j==2 && k==2)
                 {
                 
                     seats22[1][n][o]="*";  
             } if(i==2 && j==2 && k==3)
                 {
                 
                 seats22[2][n][o]="*"; 
             } if(i==2 && j==2 && k==4)
                 {
                 
                    seats22[3][n][o]="*"; 
             } if(i==2 && j==3 && k==1)
                 {
                 
                    seats23[0][n][o]="*"; 
             } if(i==2 && j==3 && k==2)
                 {
                 
                  seats23[1][n][o]="*";  
             } if(i==2 && j==3 && k==3)
                 {
                 
                     seats23[2][n][o]="*"; 
             } if(i==2 && j==3 && k==4)
                 {
                 
                   seats23[3][n][o]="*"; 
             } if(i==2 && j==4 && k==1)
                 {
                 
                   seats24[0][n][o]="*"; 
             } if(i==2 && j==4 && k==2)
                 {
                 
                 seats24[1][n][o]="*";
             } if(i==2 && j==4 && k==3)
                 {
                 
                 seats24[2][n][o]="*";
            } if(i==2 && j==4 && k==4)
                 {
                 
                  seats24[3][n][o]="*"; 
             }
         if(n>9 || o>12)
         {
             System.out.println("INVALID CHOICE");
         }
         else
         {
         printTicket(i,j,k,n,o,m);
         }
         }
    }
    public static void timings(int i, int j) 
    {
        Scanner rs=new Scanner(System.in);
       if(i==1 && j==1)
       {
          System.out.println("1- 9:00am\n2- 1:30pm\n3- 4:30pm\n4- 9:00pm"); 
       }
       if(i==1 && j==2)
       {
          System.out.println("1- 8:00am\n2- 12:30pm\n3- 5:30pm\n4- 9:30pm"); 
       }
       if(i==1 && j==3)
       {
          System.out.println("1- 9:30am\n2- 12:40pm\n3- 3:30pm\n4- 10:00pm"); 
       }if(i==1 && j==4)
       {
          System.out.println("1- 11:00am\n2- 3:30pm\n3- 6:30pm\n4- 11:00pm"); 
       }if(i==2 && j==1)
       {
          System.out.println("1- 9:50am\n2- 2:30pm\n3- 5:30pm\n4- 9:30pm"); 
          
       }if(i==2 && j==2)
       {
          System.out.println("1- 10:30am\n2- 1:30pm\n3- 6:30pm\n4- 10:00pm"); 
       }if(i==2 && j==3)
       {
          System.out.println("1- 9:40am\n2- 2:30pm\n3- 7:30pm\n4- 11:30pm"); 
       }if(i==2 && j==4)
       {
          System.out.println("1- 10:20am\n2- 12:30pm\n3- 5:40pm\n4- 9:30pm"); 
       }
       System.out.println("ENTER THE CHOICE FOR YOUR TIME SLOT");
       k=rs.nextInt();
       if(k>4)
           {
               System.out.println("INVALID CHOICE");
           }
           else
           {
       book(i,j,k);
           }
       
    }
    public static void movie(int i)
    {      
           Scanner cs=new Scanner(System.in);
           System.out.println("\t\tNOW SHOWING");
           System.out.println("\t\t1-FAST AND FURIOUS 7");
           System.out.println("\t\t2-LOST");
           System.out.println("\t\t3-ALICE IN WONDERLAND");
           System.out.println("\t\t4-CINDRELLA");
           System.out.println("\t\tENTER YOUR CHOICE FOR TIMINGS WILL BE SHOWN ACCORDINGLY");
           j=cs.nextInt();
           if(j>4)
           {
               System.out.println("INVALID CHOICE");
           }
           else
           {
           timings(i,j);
           }
    }
   public static void main(String args[])throws IOException
   {
      
       Scanner sc=new Scanner(System.in);
       
      for(v=0;v<=4;v++)
         {
             for(b=0;b<=9;b++)
             {
                 for(c=0;c<=12;c++)
                 {
                 seats11[v][b][c]="-";
                 seats12[v][b][c]="-";
                 seats13[v][b][c]="-";
                 seats14[v][b][c]="-";
                 seats21[v][b][c]="-";
                 seats22[v][b][c]="-";
                 seats23[v][b][c]="-";
                 seats24[v][b][c]="-";
                 
                 
         }
         }
         }
      
          System.out.println("\t\tWELCOME TO INOX");
          System.out.println("\t\tAAPKA INOX MEIN SWAGAT HAI");
          System.out.println("\t\tLOCATION KANPUR");
          System.out.println("ENTER YOUR LOCATION");
          System.out.println("\t\t1- SOUTH X MALL,KIDWAI NAGAR");
          System.out.println("\t\t2- Z SQUARE,BADA CHAURAHA");
      
          
          i=sc.nextInt();
          if(i==1 || i==2 )
          {
              movie(i);
          } 
          else
          {
              System.out.println("INVALID CHOICE");
             
          }
          
                
   }
 


}