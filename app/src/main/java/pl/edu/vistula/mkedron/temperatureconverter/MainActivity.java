package pl.edu.vistula.mkedron.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import pl.edu.vistula.mkedron.temperatureconverter.util.ConvertUnitsHelper;

public class MainActivity extends AppCompatActivity {

    private ConvertUnitsHelper convertUnitsHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.tempRarioGroup);
        EditText numberField = (EditText)findViewById(R.id.tempValueField);
        Float tempValue = Float.valueOf(numberField.getText().toString());
        if(radioGroup.getCheckedRadioButtonId() == R.id.CelsiusRadioButton) {
            tempValue = convertFahtr2Cel(tempValue);
        } else {
            tempValue = convertCel2Fahr(tempValue);
        }

        numberField.setText(tempValue.toString());

    }

    private Float convertCel2Fahr(Float celValue) {
        return convertUnitsHelper.convertCel2Fahr(celValue);
    }

    private Float convertFahtr2Cel(Float fahrValue) {
        return convertUnitsHelper.convertFahtr2Cel(fahrValue);
    }
}
