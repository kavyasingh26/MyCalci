package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundlachae;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView workingsTV;
    TextView resultsTV;
    String workings ="";
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initTextView()
    {
        workingsTV =(TextView)findViewById(R.id.workingsTextView);
        resultsTV = (TextView)findViewById(R.id.resultTextView);
    }  
    private void setworkings(String givenValue)
    {
        workings = workings + givenValue;
        workingsTV.setText(workings);
    }    
        

    public void clearOnclick(View view) {
        workings TV .setText("");
        workings = "";
        resultsTV.setText(""); 
        leftbracket=true; 
        
    }

    public void FourOnclick(View view) {
    }

    public void MultiplicationOnclick(View view) {
    }

    public void nineOnclick(View view) {
        setWorkings("9");
    }

    public void eightOnclick(View view) {
        setWorkings("8");
    }

    public void sevenOnclick(View view) {
        setWorkings("7");
    }

    public void divisionOnclick(View view) {
        setWorkings("/");
    }

    public void powerOfOnclick(View view) {
        setWorkings("^");
    }

    public void bracketOnclick(View view) {
    }

    public void FiveOnclick(View view) {
        setWorkings("5");
    }

    public void SixOnclick(View view) {
       setWorkings("6"); 
    }

    public void Onclick(View view) {
    }

    public void MinusOnclick(View view) {
    }

    public void OneOnclick(View view) {
    }

    public void TwoOnclick(View view) {
    }

    public void ThreeOnclick(View view) {
        setWorkings("3");
    }

    public void PlusOnclick(View view) {
        setWorkings("+");
    }

    public void ZeroOnclick(View view) {
        setWorkings("0");
    }

    public void EqualOnclick(View view) {
         Double result =null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName(shortName:"rhio");
        checkforpowerof();
        
        try{
            result = (double)engine.eval(workings);
        }catch (ScriptException e)
        {
            Toast.makeText(context: this, text: "Invalid Input", Toast.LENGTH_SHORT).show();
        }
        if(result != null)
            resultsTV.setText(String.ValueOf(result.doubleValue()));
    }
    boolean leftbreacket =true;
     public void bracketsOnClick(View view)
     {
         if(left bracket)
         {
             setworkings("(");
          leftbracker = false;
         }
         elsw{ 
            setworkings("(");
          leftbracker = true;
         }
     }
         
    }
    
    public  void decimalOnClick(View view)
    {
        setWorkings(".");
    }    
}
