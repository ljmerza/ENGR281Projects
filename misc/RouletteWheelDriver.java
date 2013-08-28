public class RouletteWheelDriver
{
	 public static void main(String[] args)
	 {
		 RouletteWheel rw = new RouletteWheel();

		 for(int i = 0; i <= 10; i++)
		 {
			 rw.spin();
			 System.out.print(rw.getCurrentNumber());
			 System.out.println(", " + rw.getCurrentColor());
		 }
	 }
}