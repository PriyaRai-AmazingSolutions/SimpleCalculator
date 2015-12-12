package com.AmazingSolutions.simplecalculator;

import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;

import org.xml.sax.Parser;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class SimpleCalculator extends Activity implements OnClickListener{

    private TextView tvResult;
	private TextView tvHistory;
	private Button btOne;
	private Button btTwo;
	private Button btThree;
	private Button btFive;
	private Button btSix;
	private Button btSeven;
	private Button btEight;
	private Button btNine;
	private Button btFour;
	private Button btZero;
	private double operand1 = -9999;
	private double operand2 = -9999;
	private String operator; 
	private Button btAdd;
	private Button btSub;
	private Button btMul;
	private Button btDiv;
	private Button btClear;
	private Button btBackspace;
	private boolean canAppend = true;
	private Button btDecimal;
	private Button btEquals;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        InitialiseVars();
        SetClickListener();
    }

	public void InitialiseVars() 
    {
	    //TextView
    	tvResult = (TextView) findViewById(R.id.tvResult);
    	tvHistory = (TextView) findViewById(R.id.tvHistory);
    	//Numeric Buttons
    	btOne = (Button) findViewById(R.id.btOne);
    	btTwo = (Button) findViewById(R.id.btTwo);
    	btThree = (Button) findViewById(R.id.btThree);
    	btFour = (Button) findViewById(R.id.btFour);
    	btFive = (Button) findViewById(R.id.btFive);
    	btSix = (Button) findViewById(R.id.btSix);
    	btSeven = (Button) findViewById(R.id.btSeven);
    	btEight = (Button) findViewById(R.id.btEight);
    	btNine = (Button) findViewById(R.id.btNine);
    	btZero = (Button) findViewById(R.id.btZero);
    	btDecimal = (Button) findViewById(R.id.btDecimal);
    	btEquals = (Button) findViewById(R.id.btEquals);
    	//Control Buttons
    	btAdd = (Button) findViewById(R.id.btAdd);
    	btSub = (Button) findViewById(R.id.btSub);
    	btMul = (Button) findViewById(R.id.btMul);
    	btDiv = (Button) findViewById(R.id.btDiv);
    	btClear = (Button) findViewById(R.id.btClear);
    	btBackspace = (Button) findViewById(R.id.btBackspace);
	}
	
	private void SetClickListener() 
	{
		// TODO Auto-generated method stub
		//Numeric Buttons
		btOne.setOnClickListener(this);
		btTwo.setOnClickListener(this);
		btThree.setOnClickListener(this);
		btFour.setOnClickListener(this);
		btFive.setOnClickListener(this);
		btSix.setOnClickListener(this);
		btSeven.setOnClickListener(this);
		btEight.setOnClickListener(this);
		btNine.setOnClickListener(this);
		btZero.setOnClickListener(this);
		btDecimal.setOnClickListener(this);
		btEquals.setOnClickListener(this);
		//Control Buttons
		btAdd.setOnClickListener(this);
		btSub.setOnClickListener(this);
		btMul.setOnClickListener(this);
		btDiv.setOnClickListener(this);
		btClear.setOnClickListener(this);
		btBackspace.setOnClickListener(this);
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.simple_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		    //Numeric Buttons
			case R.id.btOne:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btOne.getText());
				else
				{
					tvResult.setText(btOne.getText());
					canAppend = true;
				}
				break;
			case R.id.btTwo:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btTwo.getText());
				else
				{
					tvResult.setText(btTwo.getText());
					canAppend = true;
				}
				break;
			case R.id.btThree:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btThree.getText());
				else
				{
					tvResult.setText(btThree.getText());
					canAppend = true;
				}
				break;
			case R.id.btFour:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btFour.getText());
				else
				{
					tvResult.setText(btFour.getText());
					canAppend = true;
				}
				break;
			case R.id.btFive:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btFive.getText());
				else
				{
					tvResult.setText(btFive.getText());
					canAppend = true;
				}
				break;
			case R.id.btSix:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btSix.getText());
				else
				{
					tvResult.setText(btSix.getText());
					canAppend = true;
				}
				break;
			case R.id.btSeven:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btSeven.getText());
				else
				{
					tvResult.setText(btSeven.getText());
					canAppend = true;
				}
				break;
			case R.id.btEight:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btEight.getText());
				else
				{
					tvResult.setText(btEight.getText());
					canAppend = true;
				}
				break;
			case R.id.btNine:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btNine.getText());
				else
				{
					tvResult.setText(btNine.getText());
					canAppend = true;
				}
				break;
			case R.id.btZero:
				if(canAppend)
					tvResult.setText(tvResult.getText().toString() + btZero.getText());
				else
				{
					tvResult.setText(btZero.getText());
					canAppend = true;
				}
				break;
			case R.id.btDecimal:
				if(canAppend && !tvResult.getText().toString().contains("."))
					tvResult.setText(tvResult.getText().toString() + btDecimal.getText());
				else if(!tvResult.getText().toString().contains("."))
				{
					tvResult.setText(btDecimal.getText());
					canAppend = true;
				}
				break;
			case R.id.btEquals:
				if(canAppend)
				{
					operand2 = Double.parseDouble(tvResult.getText().toString());
					tvHistory.setText(null);
					tvHistory.setText(operand1 + " " + operator);
					PerformOperation();
					tvResult.setText(String.valueOf(operand1));
					tvHistory.setText(tvHistory.getText() + " " + operand2 + " = " + operand1);
					//operator = btAdd.getText().toString();
					operand2 = -9999;
					canAppend = false;
				}
				break;
				
			//Control Buttons	
			case R.id.btAdd:
				if(tvResult != null)
				{
					if(operand1 == -9999)
					{
						//tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString())+ operand1));
						operand1 = Double.parseDouble(tvResult.getText().toString());
						operator = btAdd.getText().toString();
						tvHistory.setText(operand1 + " " + operator);
						tvResult.setText(null);
					}
					else if(canAppend)
					{
						operand2 = Double.parseDouble(tvResult.getText().toString());
						tvHistory.setText(null);
						tvHistory.setText(operand1 + " " + operator);
						PerformOperation();
						tvResult.setText(String.valueOf(operand1));
						tvHistory.setText(tvHistory.getText() + " " + operand2 + " = " + operand1);
						operator = btAdd.getText().toString();
						operand2 = -9999;
						canAppend = false;
					}
					else
						operator = btAdd.getText().toString();
					
				}
				break;
			case R.id.btSub:
				if(tvResult != null)
				{
					if(operand1 == -9999)
					{
						//tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString())+ operand1));
						operand1 = Double.parseDouble(tvResult.getText().toString());
						operator = btSub.getText().toString();
						tvHistory.setText(operand1 + " " + operator);
						tvResult.setText(null);
					}
					else if(canAppend)
					{
						operand2 = Double.parseDouble(tvResult.getText().toString());
						tvHistory.setText(null);
						tvHistory.setText(operand1 + " " + operator);
						PerformOperation();
						tvResult.setText(String.valueOf(operand1));
						tvHistory.setText(tvHistory.getText() + " " + operand2 + " = " + operand1);
						operator = btSub.getText().toString();
						operand2 = -9999;
						canAppend = false;
					}
					else
						operator = btSub.getText().toString();
					
				}
				break;
			case R.id.btMul:
				if(tvResult != null)
				{
					if(operand1 == -9999)
					{
						//tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString())+ operand1));
						operand1 = Double.parseDouble(tvResult.getText().toString());
						operator = btMul.getText().toString();
						tvHistory.setText(operand1 + " " + operator);
						tvResult.setText(null);
					}
					else if(canAppend)
					{
						operand2 = Double.parseDouble(tvResult.getText().toString());
						tvHistory.setText(null);
						tvHistory.setText(operand1 + " " + operator);
						PerformOperation();
						tvResult.setText(String.valueOf(operand1));
						tvHistory.setText(tvHistory.getText() + " " + operand2 + " = " + operand1);
						operator = btMul.getText().toString();
						operand2 = -9999;
						canAppend = false;
					}
					else
						operator = btMul.getText().toString();
					
				}
				break;
			case R.id.btDiv:
				if(tvResult != null)
				{
					if(operand1 == -9999)
					{
						//tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString())+ operand1));
						operand1 = Double.parseDouble(tvResult.getText().toString());
						operator = btDiv.getText().toString();
						tvHistory.setText(operand1 + " " + operator);
						tvResult.setText(null);
					}
					else if(canAppend)
					{
						operand2 = Double.parseDouble(tvResult.getText().toString());
						tvHistory.setText(null);
						tvHistory.setText(operand1 + " " + operator);
						PerformOperation();
						tvResult.setText(String.valueOf(operand1));
						tvHistory.setText(tvHistory.getText() + " " + operand2 + " = " + operand1);
						operator = btDiv.getText().toString();
						operand2 = -9999;
						canAppend = false;
					}
					else
						operator = btDiv.getText().toString();
					
				}
				break;
			case R.id.btClear:
					tvResult.setText(null);
					operand1 = operand2 = -9999;
					canAppend = true;
				break;
			case R.id.btBackspace:
				if(tvResult.getText().length() > 0)
					tvResult.setText(tvResult.getText().subSequence(0, tvResult.getText().length()-1).toString());
				break;
				
		}
	}

	private void PerformOperation() 
	{
		// TODO Auto-generated method stub
		switch(operator)
		{
			case "+":
				operand1 = operand1 + operand2;
				break;
			case "-":
				operand1 = operand1 - operand2;
				break;
			case "*":
				operand1 = operand1 * operand2;
				break;
			case "/":
				operand1 = operand1 / operand2;
				break;
			
				
		}
	}
}
