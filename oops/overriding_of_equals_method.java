// Equals()=> only verifies if the references are same. It does not verify if the contents are same. Content verification 
//            is the responsibility of the overriding implementation.
class A{
    int x;
    A(int val){
        x = val;
    }
    public boolean equals(Object obj){
//         if(this == obj){     //if both point to same object or not;
//             return true;
//         }
        if(obj instanceof A){               //1st obj(of type Object) ko type A me bnana
            A otherobj = (A) obj;           //hoga bcoz x , A ka field h naki object ka 
            return this.x == otherobj.x;    //overall hme content compare krna h isliye
        }else{               
            return false;   //means kuch bhi same nhi h
        }
    }
}
public class test{
    public static void main(String[] args){
        A a1 = new A(4);     //dif
        A a2 = new A(5);     //dif
        A a3 = new A(4);     //dif
        A a4 = a1;          //point to same object
      
        System.out.println(a1.equals(a2));   //false
        System.out.println(a1.equals(a3));   //true bcoz content same h 
        System.out.println(a1.equals(a4));   //true bcoz dono same addres ko point kr rhe h
        
        System.out.println(a1 == a2);        //false
        System.out.println(a1 == a3);        //false
        System.out.println(a1 == a4);        //true;
    }
}
