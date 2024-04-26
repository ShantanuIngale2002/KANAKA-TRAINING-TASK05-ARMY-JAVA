package Task05Army2304;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Task05Army2304.armyInsight.armyInsight;

public class army {

    public static void main(String[] args) {

        List<armyInsight> armyInfo = new ArrayList<armyInsight>();
        Scanner sc = new Scanner(System.in);
        int idn=0;
        String ips;
        float ipf;
        int choice1;
        boolean flag;
        
        while(true){
            System.out.print("\n\n+++++ Army Information Interface +++++\nEnter the operation you want to perform\t1. Enter the new Information  ||  2. Print Existing Information || 3. Show status\nEnter : ");
            choice1=sc.nextInt(); 
            ips = sc.nextLine(); // using this just to clear buffer value
            switch (choice1) {
                case 1:
                    armyInsight obj= new armyInsight();
                    if(armyInfo.size()==0){
                        obj.setId(1);
                    }else{
                        idn=armyInfo.get(armyInfo.size()-1).getId();
                        obj.setId(idn+1);
                    }
                    System.out.print("Enter Name : ");
                    ips=sc.nextLine();
                    obj.setName(ips);
                    System.out.print("Enter Height : ");
                    ipf=sc.nextFloat();
                    obj.setHeight(ipf);
                    System.out.print("Enter Weight : ");
                    ipf=sc.nextFloat();
                    obj.setWeight(ipf);
                    ips=sc.nextLine();
                    System.out.print("Enter DOB : ");
                    ips=sc.nextLine();
                    obj.setDOB(ips);

                    armyInfo.add(obj);

                    break;
                
                case 2:
                    if(armyInfo.size()==0){
                        System.out.println("Sorry, There exist no data on army currently.");
                        break;
                    }
                    for(armyInsight i:armyInfo){
                        System.out.println("Candidate ID : "+i.getId());
                        System.out.println("Name         : "+i.getName());
                        System.out.println("Height       : "+i.getHeight());
                        System.out.println("Weight       : "+i.getWeight());
                        System.out.println("DOB          : "+i.getDOB());
                        System.out.println("Age          : "+i.getAge());
                        System.out.println("Organization : "+i.getOrg());
                        System.out.println("Status       : "+i.getStatus());
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.print("Enter ID : ");
                    idn=sc.nextInt();
                    for(armyInsight i:armyInfo){
                        if(i.getId()==idn){
                            System.out.println("Name   : "+i.getName());
                            System.out.println("Status : "+i.getStatus());
                        }
                    }
                    break;
            
                default:
                    break;
            }
        }

    }
}
