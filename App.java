import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num = 5;
        String res;
        if (num >=0){
            res = "positive";
        
        } else{
            res = "negative";
        }
        System.out.println(res);
        Scanner sc = new Scanner (System.in);
        String user,pass;
        user = sc.nextLine();
        if (user.equals("admin")){
            pass = sc.nextLine();
            if  (pass.equals("12345")){
                System.out.println("usuario autenticado");
            }else{
                System.out.println("usuario correcto");
                System.out.println("contraseña erronea");
            }
        }else{
                System.out.println("usuario incorrecto");
            }
        Scanner scanner = new Scanner (System.in);
        String re=null;
        
        int op;
        op = scanner.nextInt();
        switch (op) {
        case 1 : res = "valor intro = 1"; break;
                
            
            
        case 2 : res = "valor intro = 2"; break;
        
        }
            }
        

        
    
    }
   


