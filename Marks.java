public class Marks {
  public static void main(String[] args) {
   float[] mark = {40,60,70,99,87};
   float sum = 0;
   for(int i=0 ; i<mark.length; i++)
   sum += mark[i];
   System.out.println("total marks:"+ sum);
   System.out.println("Avarage marks:"+ sum/mark.length);
   float avg = sum/mark.length;
   if(avg>=90)
   System.out.println("Grade A");
   else if(avg>=80)
   System.out.println("Grade B");
   else if(avg>=70)
   System.out.println("Grade C");
   else if(avg>=60)
   System.out.println("Grade D");
   else if(avg<60 && avg>=30)
   System.out.println("Grade E");
   else
   System.out.println("Grade F");




  }
}