package com.Assignments2;

import java.io.Serializable;

public class ThreadSafeSingletonClass implements Serializable{

  private static ThreadSafeSingletonClass instance; 
  
  private ThreadSafeSingletonClass(){} 
  
  public Object readResolve() {
      return getInstance( );
   }
  
  public static ThreadSafeSingletonClass getInstance() 
  { 
    if (instance == null)  
    { 
      synchronized (ThreadSafeSingletonClass.class) 
      { 
        if(instance==null) 
        { 
          instance = new ThreadSafeSingletonClass(); 
        } 
        
      } 
    } 
    return instance; 
  } 
}