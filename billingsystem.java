import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

class billing{
String[] s = new String[]{"SPECIAL IDLI","GHEE IDLI","SAMBHAR IDLI","MINI IDLI","RAVAIDLI","PODI+OIL","PANIYARAM","FILTER COFFEE","QUIT NOW"};
int[] rate = new int[]{20,25,60,10,25,10,25,25,0};
String[] a = new String[]{"1","2","3","4","5","6","7","8","9"};
int[] qt = new int[10];
int sum ;



public void getmenu(){
System.out.println("--------------MURUGAN IDLI KADAI-----------------");
System.out.println("------------------MENU CARD----------------------");
System.out.println("1.SPECIAL IDLI    - RS 20");
System.out.println("2.GHEE PODI IDLI  - RS 25");
System.out.println("3.SAMBHAR IDLI    - RS 60");
System.out.println("4.MINI IDLI       - RS 10");
System.out.println("5.RAVA IDLI       - RS 25");
System.out.println("6.PODI+OIL        - RS 10");
System.out.println("7.KULI PANIYARAM  - RS 25");
System.out.println("8.FILTER COFFEE   - RS 25");
System.out.println("-------------------------------------------------");
System.out.println("Get 4% assured cashback on orders above 999 INR");
System.out.println("\n");
}


public void placeorder(){
Scanner sc = new Scanner(System.in);
System.out.println("------------------------------------------------");
      sum=0;
boolean quit=true;
      System.out.println(" ITEM"+"\t\t\t"+"PRICE");
      for(int i=0;i<9;i++)
            System.out.println(((i+1)+"."+s[i]+"\t\t"+rate[i]));      
System.out.println("------------------------------------------------");
       
        do{
          System.out.println("Order please...(click 9 once you finish ordering)");
          int ch= sc.nextInt();
   if(ch>0 && ch<9)
   {
System.out.println("enter the no of quantites of "+s[ch-1]);
                 int q=sc.nextInt();
        qt[ch-1]+=q;
System.out.println("------------------------------------------------");
   }
   else
   {
               quit=false;
             
            }
       
       }while(quit);


       System.out.println("------------------------------------------------");
System.out.println("orders placed....");
System.out.println("\t");
System.out.println("ITEM"+"\t\t\t"+"QTY");
System.out.println("\t");
for(int i=0;i<10;i++)
   {
             if(qt[i]!=0)
    {
             
              System.out.println(s[i]+"\t\t"+qt[i]);
             
    }
   }

System.out.println("------------------------------------------------");

System.out.println("1.Takeaway , 2.Dine-in");

int cx = sc.nextInt();
double m = 0;
double n = 0;


System.out.println("----------------MURUGAN IDLI KADAI--------------");
System.out.println("------------------------------------------------");
System.out.println("               GENERATING BILL.....!            ");
System.out.println("------------------------------------------------");
System.out.println("ITEM"+"\t\t\t"+"QTY"+"\t"+"RATE"+"\t"+"PRICE");
System.out.println("\t");

   for(int i=0;i<10;i++)
   {
             if(qt[i]!=0)
    {
     sum+=qt[i]*rate[i];
              System.out.println(s[i]+"\t\t"+qt[i]+"\t"+rate[i]+".0"+"\t"+qt[i]*rate[i]+".0");
              System.out.println("\t");
    }
   }
 
        System.out.println("------------------------------------------------");
        if(cx == 1){
n = Math.round(sum*0.05);
        System.out.println("Takeaway :"+"\t\t\t\t"+n);

        System.out.println("------------------------------------------------");}
        if(cx == 2){
m = Math.round(sum*0.07);
        System.out.println("Service charge "+"\t\t\t\t"+m);
        System.out.println("------------------------------------------------");}
       
        System.out.println("total bill"+"\t\t\t\t"+(sum+m+n));
        if(sum<699){
                double xin = 0;
                System.out.println("discount "+"\t\t\t\t"+"0.0");
                System.out.println("------------------------------------------------");
                System.out.println("Grand total "+"\t\t\t\t"+((sum+m+n)));
        }
        else{
                double xin;
                xin = sum*0.04;
                System.out.println("Discount "+"\t\t\t\t"+xin);
                System.out.println("------------------------------------------------");
                System.out.println("Grand total "+"\t\t\t\t"+((sum+m+n)-xin));
        }
        
        System.out.println("\n");
        System.out.println("------------------------------------------------");
       
         System.out.println("Thank you");

SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
    
System.out.println("------------------------------------------------");
System.out.println("\n");

System.out.println("Enter payment method");
System.out.println("1.Cash , 2.UPI");
System.out.println("------------------------------------------------");

int qw = sc.nextInt();

if(qw == 1){
System.out.println("Given amount");
int cash = sc.nextInt();
System.out.println("------------------------------------------------");
if(cash>(sum+n+m))
System.out.println("Balance:"+(cash-(sum+n+m))) ;
else{
System.out.println("AMOUNT DEFICIT => Pay:"+((sum+n+m)-cash));
}

System.out.println("Thankyou...!");}

if(qw == 2){
System.out.println("UPI ID: murugan1997@okicici");
System.out.println("------------------------------------------------");
System.out.println("SCAN THE QR code");


System.out.println("please make sure that the amount is credited to us ......");

System.out.println("Thankyou ....!");

}    
}
public void rateus(){
Scanner sc = new Scanner(System.in);
System.out.println("RATE US OUT OF 5:");
int s = sc.nextInt();
String s1= "*";
System.out.println("Rated :"+s+"/5");
System.out.println("Thanks for your feedback");
}
public void aboutus(){
System.out.println("Murugan Idli Shop was founded around two decades ago serving delicious, and mouth-watering vegetarian, South Indian dishes. Our consistency in delivering the tasty dishes which satisfy your taste buds is well-appreciated making us the favorite destination for Authentic South Indian foods. We follow consistency in all our braches’ decor, making our customers feel the same. We deliver top-notch food items with eye for nutrient value.");
System.out.println("Our quality is experienced in all our branches. We have expanded our horizon to 3 countries and soon will establish in more countries fulfilling the hunger for authentic Sound Indian foods. We have both ambience and taste, reflecting the authentic South Indian dishes. Murugan Idli Shop has well-experienced chefs as our creative force who render the taste in all the dish which we offer.");
}
}

   
public class billingsystem{
public static void main(String args[]){
System.out.println("\n");
System.out.println("BILLING SYSTEM");
System.out.println("------------------------------------------------------------------------------------------------S");



Scanner sc = new Scanner(System.in);


int choice;
do{
billing bill1= new billing();


System.out.println("1.GET MENU CARD , 2.PLACE ORDER n GETBILL 3.RATE US , 4.ABOUT US , 5.PARTY/BULK ORDERS , 6.EXIT");
System.out.println("------------------------------------------------------------------------------------------------");
System.out.println("Enter your choice:");

choice = sc.nextInt();
switch(choice){
case 1:

billing bill = new billing();
bill.getmenu();
System.out.println("------------------------------------------------");
break;

case 2:

bill1.placeorder();
System.out.println("------------------------------------------------");
break;


case 3:

billing bill3= new billing();
bill3.rateus();
System.out.println("------------------------------------------------");
break;

case 4:
System.out.println("------------------------------------------------");
billing bill4 = new billing();
bill4.aboutus();
System.out.println("------------------------------------------------");
break;

case 5:

System.out.println("For bulk orders : ");
System.out.println("------------------------------------------------");
System.out.println("Contact: Mr.Nagarajan");
System.out.println("Head supervising executive");
System.out.println("mobile:9876543210");
System.out.println("------------------------------------------------");
System.out.println("get assured 18% discount on orders above 50k inr");
System.out.println("------------------------------------------------");
break;

case 6:
System.out.println("-----------------------------------------------");

System.out.println("thankyou...! , visit again");

System.out.println("-----------------------------------------------");






}}
while(choice<6);
}} 
