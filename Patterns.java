//name:Linhan
//date:10/29/25
import java.util.Scanner;
public class Patterns {

    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many row do you want the stars be?");
        stars(scan.nextInt());
        System.out.println("How many row do you want the triangle be?");
        triangle(scan.nextInt());
        System.out.println("How many row do you want the odd be?");
        reverseodd(scan.nextInt());
        System.out.println("What is the MAXE");
        EO(scan.nextInt());
    }

    public static void stars(int stars){
        int i = 0;
        String star = "*";
        while(i < stars){
            System.out.println(star);
            star = star + "*";
            i++;
        }
    }
    public static void triangle(int triangle){
        int i = 1;
        String tri = "1";
        String add;
        while(i <= triangle){
            System.out.println(tri);
            i++;
            tri = tri.replaceAll(tri.substring(0, 1), i+"");
            add = String.valueOf(i);
            tri = tri + add; 
        }
    }
    public static void reverseodd(int reverse){
            for(int triangle = reverse; triangle >= 0; triangle = triangle - 2){
                String odd = String.valueOf(triangle);
                String add;
                for(int i = triangle; i > 0; i--){
                    if(i == triangle){
                    }else{add = String.valueOf(triangle);
                    odd = odd + add;}
                    
                }
                System.out.println(odd);
        }       
    } 
    public static void EO(int MaxE) {
        for(int E = MaxE; E >= 0; E--){
            String One
            /*for(int i = triangle; i > 0; i--){
                    if(i == triangle){
                    }else{add = String.valueOf(triangle);
                    odd = odd + add;}
                    
                }
            System.out.println(odd); */
        }
    }
}


