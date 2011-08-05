package manger.com;



import java.util.List;

import android.app.Activity;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


import android.widget.Button;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.TextView;


public class money_manager extends Activity {
    /** Called when the activity is first created. */
	private DataHelper dh;
	private TextView output;
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn1 = (Button)findViewById(R.id.saveExpensive);
        btn1.setOnClickListener(btnListener);
        
        

    }
    
    
    
    private OnClickListener btnListener = new OnClickListener()
    {
        public void onClick(View v)
        {       
        	setContentView(R.layout.display_data);
        	this.output = (TextView) this.findViewById(R.id.out_text);

            this.dh = new DataHelper(this);
            this.dh.deleteAll();
            this.dh.insert("Porky Pig");
            List<String> names = this.dh.selectAll();
            StringBuilder sb = new StringBuilder();
            sb.append("Names in database:\n");
            for (String name : names) {
            	sb.append(name + "\n");
            }
            this.output.setText(sb.toString());
        	
        	
//        	final EditText amountfield = (EditText) findViewById(R.id.AddAmount);
//        	final EditText reasonfield = (EditText) findViewById(R.id.AddReason);
//        	final Spinner  expensivetypefield = (Spinner) findViewById(R.id.ExpensiveType);
//        	String  amount = amountfield.getText().toString();
//        	String  reason = reasonfield.getText().toString();
//        	String expensivetype = expensivetypefield.getSelectedItem().toString();
//        	
//        	setContentView(R.layout.display_data);
//        	TextView myListView = (TextView)findViewById(R.id.displayData);
//        	myListView.setText(amount);
        	
        	
        	
        	
        	

        }

		

		
    };    

    
}



