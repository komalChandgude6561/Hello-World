package QuestionBank3_IfElse_Nested_IfElse;

public class threeSided_ShapeType_Triangle {

	public static void main(String[] args) {

	 int Angle1 = 60;
	 int Angle2 = 60;
	 int Angle3 = 60;
	 
	 /*in equilateral : all sides are equals. and all angles are 60 degree.
	  * in isosceles: exactly two sides are equal and two angles are equals.
	  * in scalene: all sides and angles are different.
	  */
	 
	 if(Angle1==60 && Angle2==60 && Angle3==60) {
		 System.out.println("Equilateral Triangle");
	 }
	 else if(Angle1==45 && Angle2==45 && Angle3==90) {
		 System.out.println("isosceles Triangle");
	 }
	 else {
		 System.out.println("Scalene Triangle");
	 }
	}

}
