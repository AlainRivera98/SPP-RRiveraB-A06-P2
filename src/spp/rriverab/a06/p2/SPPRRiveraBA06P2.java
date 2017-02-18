//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11
package spp.rriverab.a06.p2;
import java.util.Scanner;

public class SPPRRiveraBA06P2 {
    
    public static void main(String[] args) {
        inicioReinicio(); //Se llama a método inicio reinicio
    }
    
    
    //Método inicio reinicio: introduce al programa e inicia o reinicia los cálculos al llamar a los demás métodos
    public static void inicioReinicio(){
        int x,y;
        
        System.out.println("\n\n--------------------");
        System.out.println("Cálculadora de factoriales");     
        System.out.println("--------------------");
        
        //Manda a método solicitar datos y el valor que regresa lo asigna a "x"
        x=solicitarDatos(); 
        //Manda a método calcular factorial y le manda el valor anterior "x", y el valor que regresa lo asigna a "y".
        y=calcularFactorial(x); 
        //Manda a método mostrar resultados y les manda los datos anteriormente obtenidos "x" e "y". 
        mostrarResultados(x,y);
        //Manda a método salir
        salir();
    }
    
    
    //Método solicitar datos: permite verificar que los datos sean correctos y los captura
    public static int solicitarDatos(){
        Scanner teclado = new Scanner (System.in);
        int x=0;
        boolean flag;

        //Ciclo do while: ejecuta al menos una vez las instrucciones en do, y evalúa si es cierto en while
        do{      
            try{ //Intenta realizar las instrucciones 
                System.out.println("\nIntroduce un número entero");
                x = teclado.nextInt(); 
                flag = true;
            }catch (Exception ex) { //Evita que el programa falle en caso de error y muestra el error
                flag = false;
                System.out.println("\nEl valor insertado no es válido (entero normal)\n" +ex+ "\n");
                teclado.nextLine(); //Limpia el buffer del teclado
            } 
            
        }while(flag==false); //Evalua si la condición es verdadera o falsa, para volver a hacer las operaciones o no
        
        //Si el número es menor que 0 o mayor que 10 lo muestra como "Fuera de rango"
        if(x<0 || x>10){
            System.out.println("\nFuera de rango");
            salir();
        }

        return x; //regresa el valor obtenido
    }
    
    
    //Método calcular factorial: calcula el factorial del número pedido 
    public static int calcularFactorial(int x){
        int factorial = 1;
        
        if(x==0){
            return factorial; //Asigna el valor de 1 a 0!, pues ese es su valor con convención
        } 
        else{
            //Ciclo for para calcular el factorial con multiplicaciones consecutivas
            for(int i=x; i>1;i--){ 
                factorial = factorial*i;   
            }        
        }
                
        return factorial; //regresa el valor obtenido
    }
    
    
    //Método mostrar resultados: muestra los resultados del programa
    public static void mostrarResultados(int numero, int factorial){
       System.out.println("\n"+numero+"! es: "+factorial); //Se muestra el valor obtenido del proceso de multiplicar 
    }
            
            
    //Método salir: da opción de terminar o reiniciar los cálculos
    public static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;

        System.out.println("\n¿Desea continuar?");
        System.out.println("No: Presione E");
        System.out.println("Sí: Presione cualquier otra tecla\n");
        letra = teclado.nextLine();
        
        //verifica si el String es igual a "E"
        if(letra.equals("E")){
            //termina el programa
            System.exit(0);
        }
        //se ejecuta si el String es distinto de "E"
        else{
            //Se invoca a método inicio reinicio para volver a ejecutar el programa
            inicioReinicio();   
        }
    
    }   
        
    
}
