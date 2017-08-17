/*
 * Programa para probar polimorfismo 
 *
 * Autor: Angeles Junco
 */

public class ProgramaFigurasPolimorfismo  {

    public static void main(String[] args) {
       
      Point point = new Point( 7, 11 );          
      Circle circle = new Circle( 3.5, 22, 8 );  
      Cylinder cylinder = new Cylinder( 10, 3.3, 10, 10 );

      Shape arrayOfShapes[];

      arrayOfShapes = new Shape[ 3 ];

      arrayOfShapes[ 0 ] = point;

      arrayOfShapes[ 1 ] = circle;

      arrayOfShapes[ 2 ] = cylinder;  

      String output =
         point.getName() + ": " + point.toString() + "\n" +
         circle.getName() + ": " + circle.toString() + "\n" +
         cylinder.getName() + ": " + cylinder.toString();

		System.out.println (output);   

		output = "";
		
      for ( int i = 0; i < arrayOfShapes.length; i++ ) {
         output += "\n\n" +
            arrayOfShapes[ i ].getName() + ": " +
            arrayOfShapes[ i ].toString() +
            "\nArea = " + arrayOfShapes[ i ].area() +
            "\nVolume = " + arrayOfShapes[ i ].volume() ;
      }
      
      System.out.println (output);   
	}
}

