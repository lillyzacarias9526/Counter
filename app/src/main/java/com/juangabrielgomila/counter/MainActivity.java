package com.juangabrielgomila.counter; /*indica el nombre del paquete donde se encuentra la clase*/


/*los imports que se encuentran aqui son lo que vamos a necesitar para trabajar dentro de la clase*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*el MainActivity.java es la actividad de la aplicacion, en esta clase es donde se van
    a definir los metodos y llamadas a otras clases, asi como el funcionamiento de layout*/

    //Variable para sostener el valor entero que vamos a mostrar
    private int value = 0;
    //Variables para los 6 botones y la text view
    private TextView textView;
    private Button btnAdd, btnTake, btnGrow, btnShrink, btnHide, btnReset;



    @Override

    /* del metodo OnCretae lo mas importante es la linea de codigo: setContentView(R.layout.activity_main);
    que es la que hace el trabajo de enlazar la parte logica con la parte grafica
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnTake = (Button) findViewById(R.id.btnTake);
        btnGrow = (Button) findViewById(R.id.btnGrow);
        btnShrink = (Button) findViewById(R.id.btnShrink);
        btnHide = (Button) findViewById(R.id.btnHide);
        btnReset = (Button) findViewById(R.id.btnReset);

        /* aqui se crean los eventos de los botones creados*/
        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnReset.setOnClickListener(this);

    }
    @Override

    /* en esta parte el OnClick nos permite capturar los clicks en determinadas vistas comunmente botones, para ejecutar ciertas partes de
    nuestro codigo y de esta forma realizar las accion que se requieran*/


    public void onClick(View view) {
        Log.i("Main Activity", "onClick: "+view.getId()); /* se crea un mensaje y se obtendra un numero que servira para el menu*/

        float scale; /*se crea una variable de tipo flotante*/

        switch (view.getId()){ /* en esta parte de crean las opciones de los botones para cuando sean presionados*/

            /*aqui se crea la opcion agregar del boton*/
            case R.id.btnAdd:
                value++;
                textView.setText(""+value);
                break;
            /*se crea la opcion tomar del boton*/
            case R.id.btnTake:
                value--;
                textView.setText(""+value);
                break;
            /*se crea la opcion reiniciar del boton*/
            case R.id.btnReset:
                value = 0;
                textView.setText(""+value);
                break;

            /*se crea la opcion sumar +1 del boton*/
            case R.id.btnGrow:
                scale = textView.getTextScaleX();
                scale = scale +1;
                textView.setTextScaleX(scale);
                break;

            /*se crea la opcion restar -1 del boton*/
            case R.id.btnShrink:
                scale = textView.getTextScaleX();
                scale = scale -1;
                textView.setTextScaleX(scale);
                break;


            case R.id.btnHide:
                if (textView.getVisibility() == View.VISIBLE){
                    //En este caso, la vista está visible y debemos ocultarla....
                    textView.setVisibility(View.INVISIBLE);
                    btnHide.setText("Mostrar");
                }else {
                    //En este caso, la vista está invisible, debemos mostrarla...
                    textView.setVisibility(View.VISIBLE);
                    btnHide.setText("Ocultar");
                }
                break;
        }
    }
}
