/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac01less09;

/**
 *
 * @author kieut
 */
public class Student {
    private String stdName;   
    private int stdRollNo;        
    private int stdId;

    public String getStdName()
    {          
        return this.stdName;         
    }         

    public int getStdRollNo()
    {             
        return this.stdRollNo;         
    }         

    public int getStdId()
    {             
        return this.stdId;        
    } 

    public void setStdName(String name)
    {             
        this.stdName = name;         
    }         

    public void setStdRollNo(int rollNo)
    {            
        this.stdRollNo = rollNo;   
    }         

    public void setId(int id)
    {             
        this.stdId = id;        
    }      
}
