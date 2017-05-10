package castro.rodriguez.fernando.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import castro.rodriguez.fernando.carros.Carro;
import castro.rodriguez.fernando.carros.Datos;

public class Informe_3 extends AppCompatActivity {

    private ArrayList<Carro> carroArrayList;
    private TextView negroText, rojoText, blancoText;
    int negro = 0, rojo = 0, blanco = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_3);

        carroArrayList = Datos.getCarros();
        negroText = (TextView)findViewById(R.id.txtCarrosnegros);
        rojoText = (TextView)findViewById(R.id.txtCarrosRojos);
        blancoText = (TextView)findViewById(R.id.txtCarrosblancos);

        for (int i = 0; i < carroArrayList.size(); i++) {
            if (carroArrayList.get(i).getColor().equals("Negro") || carroArrayList.get(i).
                    getColor().equals("Black")){
                negro++;
            }else if (carroArrayList.get(i).getColor().equals("Rojo") || carroArrayList.get(i).
                    getColor().equals("Red")){
                rojo++;
            }else{
                blanco++;
            }
        }

        negroText.setText(String.valueOf(negro));
        rojoText.setText(String.valueOf(rojo));
        blancoText.setText(String.valueOf(blanco));
    }


}
