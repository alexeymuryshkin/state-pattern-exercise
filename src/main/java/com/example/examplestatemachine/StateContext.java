package com.example.examplestatemachine;

public class StateContext {
	protected StateContext sc;
    protected boolean accept = false;
    protected char firstAction = 'C';
    
    public StateContext() {
    	accept = false;
    }
    
    public void actionA() {
    	if (firstAction == 'C')
    		firstAction = 'A';
    	
    	if (firstAction == 'A')
    		accept = true;
    	else
    		accept = false;
    }
    
    public void actionB() {
    	if (firstAction == 'C')
    		firstAction = 'B';
    	
    	if (firstAction == 'B')
    		accept = true;
    	else
    		accept = false;
    }
    
    public boolean isAccept() {
        return this.accept;
    }
}
