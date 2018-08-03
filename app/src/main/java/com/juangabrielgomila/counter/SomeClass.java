package com.juangabrielgomila.counter; /*indica el nombre del paquete donde se encuentra la clase*/

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JuanGabriel on 6/11/17.
 */
  /* la clase public permite a cualquier persona consultar el valor de los atributos*/
public class SomeClass { /*se crea una clase*/

    int day; /* se declara una variable de tipo entera*/

    public void aMethod(){ /*se crea un metodo*/

        final String stringNice = "S"; /*se declara una variable de tipo final stringque quiere decir que esta serviracomo constante*/

        class AnonymousClass{

            int holaQueAse; /*se crea una variable de tipo entero*/

            public AnonymousClass(){

            }
            /* el metodo private quiere decir que nadie podra modificar el codigo sin nuestro consentimiento*/
            private void sayHello(){
                /* se crea un mensaje de tipo informacion donde se concatenan las variables creadas en los metodos anteriores*/
                Log.i("HOLA", "sayHello: "+stringNice+holaQueAse+day);

            }

        }



    }

    public class InnerClass{
        int age;
        String name;

        public InnerClass(){

        }

        public int addOne(){
            return age+1;
        }

        public void innerMethod(){
            day = day+1;
        }
    }


}



/*public class OtherClass{

}*/