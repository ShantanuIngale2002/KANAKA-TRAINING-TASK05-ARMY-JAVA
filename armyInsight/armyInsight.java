package Task05Army2304.armyInsight;

import Task05Army2304.armyInformation.armyInformation;
import Task03AGE1202.AGEtemplate.*;
import Task03AGE1202.AGEtemplate.ageTemp.AgeCalculator;

import java.time.LocalDate;

public class armyInsight implements armyInformation{
    private int id;
    private String name;
    private float height;
    private float weight;
    private int date;
    private int month;
    private int year;
    private int ageDate;
    private int ageMonth;
    private int ageYear;
    private boolean status;

    
    public void updateStatus(){
        if(this.height > 5.2 && this.weight > 50 && this.weight < 77 && ageYear>18){this.status=true;}
    }
    public void setId(int id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setHeight(float height){this.height=height;}
    public void setWeight(float weight){this.weight=weight;}
    public void setDOB(String dob){
        String[] dateIT=dob.split("/");
        this.date=Integer.parseInt(dateIT[0]);
        this.month=Integer.parseInt(dateIT[1]);
        this.year=Integer.parseInt(dateIT[2]);

        LocalDate currentDate = LocalDate.now();
        AgeCalculator ageObj = new AgeCalculator();
        AgeCalculator ageObj1 = new AgeCalculator(this.date, this.month, this.year);
        AgeCalculator ageObj2 = new AgeCalculator(currentDate.getDayOfMonth(), currentDate.getMonthValue(), currentDate.getYear());
        ageObj.calculateAge(ageObj1, ageObj2);

        this.ageDate=ageObj.getDate();
        this.ageMonth=ageObj.getMonth();
        this.ageYear=ageObj.getYear();

        updateStatus();
    }

    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public float getHeight(){return this.height;}
    public float getWeight(){return this.weight;}
    public String getDOB(){return this.date+"/"+this.month+"/"+this.year;}
    public String getAge(){return this.ageYear+" years,  "+this.ageMonth+" months,  "+this.ageDate+" days.";}
    public String getOrg(){return organization;}
    public String getStatus(){return (this.status)?"Eligible":"Not Eligible";}

}
