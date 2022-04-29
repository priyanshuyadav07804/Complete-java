interface Car{
    String  getName();                     //public or abstract method
    
    default void ApplyBreak(){            //default method
        System.out.println("Apply break for : "+ getName());
    }
}

public class BMW implements Car{
    String name;
    BMW(String name){
        this.name = name;
    }
    public String getName(){             //defining abstract method using "public" keyword
        return name;
    }
    public static void main(String[] args){
        BMW b = new BMW("BMW");
        System.out.println(b.getName());
        b.ApplyBreak();                  //calling Interface's default method. 
    }
}
/*1st -> Interface me agr abstract method ka signature h then class me usko implemnent 
krna hi krna h (necessary) vrna error aayega.
2nd -> default method ka body bhi hota h interface method
3rd-> agr new method interface me dalenge to sari classes me bhi new method ka implemnent
krna pdega vrna error aayega ..ise problem ko dur krne ke liye default method bna.
4th-> default method sari class ke pas share hota h and koi class chahe to Override
bhi kr sakti h default method ko.*/
