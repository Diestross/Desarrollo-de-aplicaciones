package co.edu.unipiloto.beer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.List;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private tipoProyecto tipo = new tipoProyecto();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickFindProject(View view){
        TextView proyectos = (TextView) findViewById(R.id.proyectos);
        Spinner tipoProyectos = (Spinner) findViewById(R.id.spinner);
        String tipoProyecto = String.valueOf(tipoProyectos.getSelectedItem());
        List<String> listaProyectos = tipo.getProyectos(tipoProyecto);
        StringBuilder proyectoString = new StringBuilder();
        for (String proyecto : listaProyectos){
            proyectoString.append(proyecto).append('\n');
        }
        proyectos.setText(proyectoString);
    }
}