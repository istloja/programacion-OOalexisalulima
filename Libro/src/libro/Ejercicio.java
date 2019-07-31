
package libro;


public class Ejercicio {
      public static void main(String[] args) {
       
       
        Libro libro1=new Libro(1111111111, "titulo1", "autor1", 60);
        Libro libro2=new Libro(1111111112, "titulo2", "autor2", 30);
        
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        
        libro1.setNumPaginas(70);
        
        
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo()+" tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo()+" tiene más páginas");
        }
        
        
    }
    
}

